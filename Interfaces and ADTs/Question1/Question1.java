import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;


public class Question1{
   public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       ArrayList<SoftDrink> list = new ArrayList<SoftDrink>();
       while(true){
           System.out.println("Enter option: (1) add soft drink (2) quit:");
           String n, c;
           double v;
           int option = in.nextInt();
           if(option == 1){
               System.out.println("Enter name, colour and volume in ml separated by space");
               n = in.next();
               c = in.next();
               v = in.nextInt();
               list.add(new SoftDrink(n, c, v));
           }
           else{
               break;
           }
       }
       Collections.sort(list, new SoftDrinkComparator());
       for(int i = 0; i < list.size(); i++){
           System.out.println(list.get(i).name + " " + list.get(i).color + " " + list.get(i).volume);
       }
   }
}
