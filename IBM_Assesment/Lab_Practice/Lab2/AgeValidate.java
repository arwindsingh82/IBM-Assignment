import java.util.*;
import java.lang.Exception;

public class AgeValidate {
  public static int checkEligibilty(int num1){ 

//int num=number1;

      if(num1<15) {
         throw new ArithmeticException("Age of the person should be above 15"); 
      }
      else {
         System.out.println("person is major..."); 
      }
      return 0;
   } 

   public static void main(String args[]){ 
        Scanner input = new Scanner(System.in);
System.out.println("Enter Age");
int n = input.nextInt();
     System.out.println(checkEligibilty(n));
     System.out.println("Have a nice day.."); 
 
}
}