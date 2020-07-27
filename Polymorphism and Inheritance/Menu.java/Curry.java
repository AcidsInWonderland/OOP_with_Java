public class Curry {
//class variables
int menuItemNumber;
String curryType,size;
//constructor
public Curry(int menuItemNumber, String size, String curryType) {
this.menuItemNumber = menuItemNumber;
this.size = size;
this.curryType = curryType;
}
//to string method
public String toString(){
return this.menuItemNumber + " "+ this.size+" "+this.curryType;
}
}
