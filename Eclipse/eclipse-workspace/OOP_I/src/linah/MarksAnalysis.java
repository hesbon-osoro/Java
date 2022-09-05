package linah;
import java.util.Scanner;

public class MarksAnalysis {
	
	static void Grade(int Cluster)	{
	  switch(Cluster)
	  {
	   case 9: System.out.print("A\t");
	   break;
	   case 8: System.out.print("B+\t");
	   break;
	   case 7: System.out.print("B\t");
	   break;
	   case 6: System.out.print("B-\t");
	   break;
	   case 5: System.out.print("C+\t");
	   break;
	   case 4: System.out.print("C\t");
	   break;
	   case 3: System.out.print("C-\t");
	   break;
	   case 2: System.out.print("D+\t");
	   break;
	   case 1: System.out.print("D-\t");
	   break;
	   case 0: System.out.print("E\t");
	   break;
	   default:System.out.print("N/A\t");
	   break;
	  }
	}
	static void Lowest(int marks[],int n){
	  int i,low=0,min=0;
	  System.out.printf("\nLowest Mark\n");
	 for(i=1;i<n;i++) {
		 //initialize low as the value of the first index
		 low=marks[0];
	    if(low>marks[i])
	    {
	      /*if lower index value has less value,
	      swap the values to higher index*/
	      low=marks[i];
	    }
	    min=low/10;
	  }
		System.out.printf("%d\t",low);
		//low=low/10;
		Grade(min);
		System.out.printf("\n");
		
}

	static void Highest(int marks[],int n){
	  int i,max=0,high=0;
	  //ascend sort
	  System.out.printf("\nHighest Mark\n");
	  for(i=1;i<n;i++)
	    {
		  high=marks[0];
	    if(marks[i]>high)
	    {
	      /*if lower index value has less value,
	      swap the values to higher index*/
	      high=marks[i];
	    }
	    max=high/10;
	  }
	System.out.printf("%d\t",high);
	high=high/10;
	Grade(max);
	System.out.printf("\n");

}
	static void Mean(int marks[],int n)	{
	  int i,mean,sum=0;
	  float average;
	  for(i=0;i<n;i++)
	  {
	    sum=sum+marks[i];
	  }
	  average=(float)sum/n;
	  mean=(int)average;
	  System.out.printf("\nMean Mark\n%.2f\t",average);
	  Grade(mean/10);
	  System.out.printf("\n");
	}
	static void Distribution(int marks[],int n)	{
	  int cluster[]=new int[n*n];
	  int i,j,temp,count;
	System.out.printf("\nGrade Distribution\n");
	System.out.printf("Grade\tCount\n");
	  for(i=0;i<n;i++)
	  {
	    cluster[i]=marks[i]/10;
	  }
	  System.out.printf("\n");
	for(i=n-1;i>=0;i--)//start at last element
	{
	    for(j=1;j<=i;j++)
	    {
	        if(cluster[j-1]<cluster[j])
	        {
	            temp=cluster[j-1];
	            cluster[j-1]=cluster[j];
	            cluster[j]=temp;
	        }
	     }
	}
	count=1;
	  for(i=0;i<n;i++)
	  {
	    for(j=0;j<i;j++)
	    {
	    if(cluster[j+1]==cluster[j]){
	      count++;
	      }else{
	    count=1;
	    }
	  }
	  while(cluster[i]==cluster[i+1]){
	      i++;
	      count++;
	  }
	  Grade(cluster[i]);
	  System.out.printf("%d\n",count);
	  }
	}
	static void Ascend(int marks[], int n){
	int i,j,temp;
	System.out.printf("\nMarks\tGrade\n");
	 for(i=n-1;i>=0;i--)//last element
	{
	    for(j=1;j<=i;j++)
	    {
	        if(marks[j-1]>marks[j])
	        {
	            temp=marks[j-1];
	            marks[j-1]=marks[j];
	            marks[j]=temp;
	        }
	    }
	    System.out.printf("%d\t",marks[i]);
	    Grade(marks[i]/10);
	    System.out.printf("\n");
	}
	}
	static void Descend(int marks[], int n)	{
	int i,j,temp;
	System.out.printf("\nMarks\tGrade\n");
	for(i=n-1;i>=0;i--)
	{
	    for(j=1;j<=i;j++)
	    {
	        if(marks[j]>marks[j-1])
	        {
	         temp=marks[j];
	         marks[j]=marks[j-1];
	         marks[j-1]=temp;
	        }
	    }
	    System.out.printf("%d\t",marks[i]);
	    Grade(marks[i]/10);
	    System.out.printf("\n");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mrks=new Scanner(System.in);
		//int marks[]=new int[100];
		int marks[]={20,90,40,77,85,86,36,78,87,84,
				  25,10,89,98,74,76,75,75,65,85,
				  };
				int i,n,cluster;
				System.out.printf("Enter the number of marks input: ");
				n=mrks.nextInt();
				while(n<2)
				{
				System.out.printf("Use positive numbers greater than 1\n");
				System.out.printf("\nEnter the number of marks input: ");
				n=mrks.nextInt();
				}
				//n=mrks.nextInt();
				System.out.printf("Marks\tGrade\n");
				for(i=0;i<n;i++){
				cluster=marks[i]/10;
				System.out.printf("%d\t",marks[i]);
				Grade(cluster);
				System.out.printf("\n");
				}

				Highest(marks,n);
				Lowest(marks,n);
				Mean(marks,n);
				Distribution(marks,n);

	}

}
