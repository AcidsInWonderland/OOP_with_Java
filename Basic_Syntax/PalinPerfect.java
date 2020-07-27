// Robyn Lesch
// Imperial Metric
// 6 July 2020
// Mood: Yay!

// Importing Necessary Libraries 
// i.e. importing math class to use square root function and
// importing io to make use of buffered reader to get user input
import static java.lang.Math.*; 
import java.io.*; 


	// Create the Class
	public class PalinPerfect {
		// Create the Method
		public static void main(String[] args)throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
			// input the starting point	
			System.out.print("Enter the starting point N:\n"); 
			int start = Integer.parseInt(br.readLine());
			// input the end point
			System.out.print("Enter the ending point M:\n"); 
			int finish = Integer.parseInt(br.readLine());
			//loop to iterate between start and end points
			System.out.print( "The palindromic prefect squares are as follows:\n");
			for(int i=start; i <=finish; i++){ 
			
			// variables a to help loop iterate	
			int a,n1,n2=0; 
			// variable n1 to store value of i and check for perfect square condition
			n1 = i; 
			// loop to check for perfect squares
			for(a = 0; a <= i; a++) 
			{
			if (a==Math.sqrt(n1))
			{
			// perfect squares get stored in n2 else are discarded	
			n2=n1; 
			}
			}
			// value of n2 stored in another variable to get it's reverse
			int number = n2; 
			int reversedNumber = 0;
			int temp=0;
			
			//loop to apply the reverse logic
			while(number > 0){ 
			temp = number % 10;
			number = number / 10;
			reversedNumber = reversedNumber * 10 + temp;
			}
			// check to match both the number and it's reverse
			if(n1 == reversedNumber) 
			System.out.println(n1);
			  
			}
			// catch block to encounter any io exceptions
			}catch(NumberFormatException nfe){ System.err.println("Invalid Format!"); } 


			}
			}
