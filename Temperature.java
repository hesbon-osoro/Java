import java.util.Scanner;

class Temperature{
	 public static void main(String[] args) {
	  Scanner myScanner = new Scanner(System.in);
      String[] dayOfWeek = new String[5];
      int [] humidity = new int[3];
      int d,h;
      int avWeek;
      int sumDay=0;
      int sumWeek = 0;
      int avDay = 0;

      //this for loop is for entering the days of the week
      for(d = 0;d < 5;d++)
      {
         System.out.print("Enter day " + (d + 1) + ":> ");
         dayOfWeek[d] = myScanner.next();
         //this is an inner loop.for entering the humidity
         for (h = 0; h < 3; h++) {
         	System.out.println("Enter humidity:"+ (h + 1) + ":> ");
         	humidity[h] = myScanner.nextInt();
         	sumDay = sumDay + humidity[h];
         }
         
      }
      	 avDay = sumDay/3;

      System.out.println(avDay+"Humidity Analysis for Five Days\n");
      for(d = 0;d < 5;d++){
         System.out.print(dayOfWeek[d] + "\n");
         for (h = 0; h < 3; h++) {
         	System.out.println(humidity[h]);
         }
         System.out.println("Average is:"+ avDay);
      }
	}
}