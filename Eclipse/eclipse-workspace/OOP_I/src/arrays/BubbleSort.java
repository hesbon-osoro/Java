package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int nums[]= {99,-10,100123,18,-978,5623,463,-9,287,49};
		int i,j,temp;
		int size;
		size=10;
		//display original array
		System.out.println("Original Array: ");
		for(i=0;i<size;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		//this is the bubble sort
		for(i=1;i<size;i++) {
		for(j=size-1;j>=i;j--) {
			if(nums[j-1]>nums[j]) {
				temp=nums[j-1];
				nums[j-1]=nums[j];
				nums[j]=temp;
			}	
	    }
	}
	System.out.println("Sorted Array:");
	for(i=0;i<size;i++) {
		System.out.print(nums[i]+" ");
	}
	System.out.println();
	}

}
