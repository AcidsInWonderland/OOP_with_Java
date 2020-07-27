// Robyn Lesch
// Imperial Metric
// 6 July 2020
// Mood: Sigh

// Import Necessary Library
import java.util.Scanner;


	// Create The Class
	public class ImperialMetric{
		// Create Method 
	   public static void main(String args[]){
       int minFeet, maxFeet;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the minimum number of feet (not less than 0):");
       minFeet = in.nextInt();
       System.out.println("Enter the maximum number of feet (not more than 30):");
       maxFeet = in.nextInt();
       if(maxFeet > 10) System.out.print(" ");
       System.out.println("   |    0\"     1\"     2\"     3\"     4\"     5\"     6\"     7\"      8\"    9\"    10\"    11\"");
       for(double feet = minFeet; feet <= maxFeet; feet++){
           System.out.printf("%.0f' | ", feet);
           for(double inches = 0; inches < 12; inches++){
               double metres = (feet * 12 + inches) * 0.0254;
               System.out.printf("%6.3f ", metres);
           }
           System.out.println();
       }
   }
}

	   
