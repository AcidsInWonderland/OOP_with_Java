public class softDrink {
//class variables
int menuItemNumber;
String flavour,type,size;
//constructor
public softDrink(int menuItemNumber, String size, String flavour, String type) {
this.menuItemNumber = menuItemNumber;
this.size = size;
this.flavour = flavour;
this.type = type;
}
//toString method
public String toString(){
return this.menuItemNumber + " "+ this.size+" "+this.flavour+" "+this.type;
}
}
