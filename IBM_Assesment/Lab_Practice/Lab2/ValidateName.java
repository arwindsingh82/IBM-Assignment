import java.util.*;

class MyOwnException extends Exception{
	MyOwnException(String s)
	{

	}
}


class ValidateName{
   static void checkEligibilty(String fName, String lName) throws MyOwnException { 

		
      if(fName.equals("") || lName.equals("")) {
         throw new MyOwnException("Student is not eligible for registration"); // OPTIONAL comment it, it will not effect o/p. 
      }
  
  else{
         System.out.println("Name is Valid!!"); 
  
   } 
}

   public static void main(String args[]){ 
     System.out.println("Welcome to the Registration process!!");
     		Scanner input = new Scanner(System.in);
System.out.println("Enter First Name");
String str1 = input.nextLine();
System.out.println("Enter last Name");
String str2 = input.nextLine();
try{      
    checkEligibilty(str1, str2); 
}catch(Exception arwind) // arwind is object of Exception.
{
	System.out.println("Enter First And Last Name Properly...");
}
}
}


		
