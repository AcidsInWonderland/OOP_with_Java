// Robyn Lesch
// Student 
// 7 July 2020
// Mood: Stressed

// Create Class
class Student {
	//Create Method
   private String firstName;
   private String middleName;
   private String lastName;
   public void setNames(String first, String middle, String last){
       firstName=first;
       middleName=middle;
       lastName=last;
   }
   public String getFullName(){
       return firstName+" "+middleName.charAt(0)+". "+lastName;
   }
}
