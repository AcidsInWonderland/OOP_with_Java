public class Pizza{
//class variables
int menuItemNumber;
String base,size;
boolean extraCheese,extraGarlic;
//constructor
public Pizza(int menuItemNumber, String size, String base, boolean extraCheese, boolean extraGarlic) {
this.menuItemNumber = menuItemNumber;
this.size = size;
this.base = base;
this.extraCheese = extraCheese;
this.extraGarlic = extraGarlic;
}
//tostring method
public String toString(){
return this.menuItemNumber + " "+ this.size+" "+this.base+" "+this.extraCheese+" "+this.extraGarlic;
}
}
