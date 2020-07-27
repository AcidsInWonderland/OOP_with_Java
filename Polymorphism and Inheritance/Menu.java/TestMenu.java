//Robyn Lesch
// Pizza
// 20 July 2020
// Mood: anxious

import java.util.ArrayList;
import java.util.Scanner;

public class TestMenu extends Pizza{
    public static void main(String args[]){
        ArrayList yourOrder = new ArrayList(); //i stores order data
        System.out.println("Welcome to Great International Food Court");
        Scanner sc = new Scanner(System.in);
        while(true){
            //menu displaying
            System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
            String choice = sc.nextLine();
            if(choice.equals("p") ||choice.equals("P")){ //this is for pizza
                System.out.println("Enter menu item number");
                int menuItem = sc.nextInt();
                System.out.println("Enter size");
                String size = sc.nextLine();
                sc.nextLine();
                System.out.println("Enter the base");
                String base = sc.nextLine();
                sc.nextLine();
                System.out.println("Enter extra cheese");
                boolean Cheese = sc.nextBoolean();
                sc.nextLine();
                System.out.println("Enter extra Garlic");
                boolean Garlic = sc.nextBoolean();
                Pizza pizza = new Pizza(menuItem,size,base,Cheese,Garlic);
                yourOrder.add(pizza);
                System.out.println("Done");
            }
            else if(choice.equals("c") ||choice.equals("C")){ //this is for curry
                System.out.println("Enter menu item number");
                int menuItem = sc.nextInt();
                System.out.println("Enter size");
                String size = sc.nextLine();
                sc.nextLine();
                System.out.println("Enter curry type");
                String curryType = sc.nextLine();
                sc.nextLine();
                Curry curry = new Curry(menuItem,size,curryType);
                yourOrder.add(curry);
                System.out.println("Done");
            }
            else if(choice.equals("s") ||choice.equals("S")){//this is for soft drinks
                System.out.println("Enter menu item number");
                int menuItem = sc.nextInt();
                System.out.println("Enter size");
                String size = sc.nextLine();
                sc.nextLine();
                System.out.println("Enter flavour");
                String flavour = sc.nextLine();
                System.out.println("Enter whether it is a bottle or can");
                String type = sc.nextLine();
                sc.nextLine();
                softDrink drink = new softDrink(menuItem,size,flavour,type);
                yourOrder.add(drink);
                System.out.println("Done");
            }
            else if(choice.equals("d") ||choice.equals("D")){ //to delte order
                System.out.println("Enter posiyion to delete");
                int number = sc.nextInt();
                yourOrder.remove(number);
            }
            else if(choice.equals("l") ||choice.equals("L")){//to show all data
                for(int i=0;i<yourOrder.size();i++){
                    System.out.println(yourOrder.get(i));
                }
            }
            else if(choice.equals("q") ||choice.equals("Q")){ //safely exiting
                System.out.println("Thank you!!");
                break;
            }
        }
    }
    
    public TestMenu(int menuItemNumber, String size, String base, boolean extraCheese, boolean extraGarlic) {
        super(menuItemNumber, size, base, extraCheese, extraGarlic);
    }
}
