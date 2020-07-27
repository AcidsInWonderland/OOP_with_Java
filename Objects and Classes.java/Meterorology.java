// Robyn Lesch
// Meteorology
// 7 July 2020
// Mood: oof

// importing necessary libraries
import java.util.*;

// create class 
public class Meteorology {
	// create method
      public static int maximum(ArrayList<Integer> temp) {
          int maximum = -1;
          for (int i = 0; i < temp.size(); i++){
              if (temp.get(i) > maximum)
                  maximum = temp.get(i);
          }
          return maximum;
      }

      public static int minimum(ArrayList<Integer> temp) {
          int minimum = 10000000;
          for (int i = 0; i < temp.size(); i++) {
              if (temp.get(i) < minimum)
                  minimum = temp.get(i);
          }
          return minimum;
      }

      public static int average(ArrayList<Integer> temp) {
          double sum = 0.0;
          for (int i = 0; i < temp.size(); i++) {
              sum += temp.get(i);
          }
          return (int)Math.round(sum/temp.size());
      }

      public static void main(String[] args) {
          ArrayList<Integer> temperature = new ArrayList<Integer>();
          ArrayList<Integer> pressure = new ArrayList<Integer>();
          ArrayList<Integer> humidity = new ArrayList<Integer>();
          int n;
          Scanner sc = new Scanner(System.in);
          while (true) {
        	  // print options 
              System.out.println("Make a selection and press return.");
              System.out.println("1. Record a temperature reading.");
              System.out.println("2. Record a pressure reading.");
              System.out.println("3. Record a humidity reading.");
              System.out.println("4. print maximum values.");
              System.out.println("5. print minimum values.");
              System.out.println("6. print average values.");
              System.out.println("7. Quit");
              n = sc.nextInt();
              if (n == 1) {
                  System.out.println("Enter value :");
                  int m = sc.nextInt();
                  temperature.add(m);
              } else if (n == 2) {
                  System.out.println("Enter value :");
                  int m = sc.nextInt();
                  pressure.add(m);
              } else if (n == 3) {
                  System.out.println("Enter value :");
                  int m = sc.nextInt();
                  humidity.add(m);
              } else if (n == 4) {
                  int ans_1 = maximum(temperature);
                  int ans_2 = maximum(pressure);
                  int ans_3 = maximum(humidity);
                  if (ans_1 == -1)
                      System.out.println("Maximum temperature: -");
                  else
                      System.out.println("Maximum temperature: "+ans_1);
                  if (ans_2 == -1)
                      System.out.println("Maximum pressure: -");
                  else
                      System.out.println("Maximum pressure: "+ans_2);
                  if (ans_3 == -1)
                      System.out.println("Maximum humidity: -");
                  else
                      System.out.println("Maximum humidity: "+ans_3);
              } else if (n == 5) {
                  int ans_1 = minimum(temperature);
                  int ans_2 = minimum(pressure);
                  int ans_3 = minimum(humidity);
                  if (ans_1 == -1)
                      System.out.println("Minimum temperature: -");
                  else
                      System.out.println("Minimum temperature: "+ans_1);
                  if (ans_2 == -1)
                      System.out.println("Minimum pressure: -");
                  else
                      System.out.println("Minimum pressure: "+ans_2);
                  if (ans_3 == -1)
                      System.out.println("Minimum humidity: -");
                  else
                      System.out.println("Minimum humidity: "+ans_3);   
              } else if (n == 6){
                  int ans_1 = average(temperature);
                  int ans_2 = average(pressure);
                  int ans_3 = average(humidity);
                  if (ans_1 == -1)
                      System.out.println("Average temperature: -");
                  else
                      System.out.println("Average temperature: "+ans_1);
                  if (ans_2 == -1)
                      System.out.println("Average pressure: -");
                  else
                      System.out.println("Average pressure: "+ans_2);
                  if (ans_3 == -1)
                      System.out.println("Average humidity: -");
                  else
                      System.out.println("Average humidity: "+ans_3);
              } else {
                  break;
              }
          }
      }
}
