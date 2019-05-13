import java.util.*;
import java.lang.Exception;

public class ValidateName{
   public static String checkEligibilty(String fName, String lName) { 

		try{
      if(fName=="" && lName=="") {
         throw new Exception("Student is not eligible for registration"); 
      }
  }
  catch(Exception ie) {
         System.out.println("Student Entry is Valid!!"); 
         System.out.println(ie);
      }
      return "rtu";
   } 

   public static void main(String args[]){ 
     System.out.println("Welcome to the Registration process!!");
     		Scanner input = new Scanner(System.in);
System.out.println("Enter First Name");
String str1 = input.nextLine();
System.out.println("Enter last Name");
String str2 = input.nextLine();
//String str="";
      
     System.out.println(checkEligibilty("str1", "str2")); 
 } 
}


		
