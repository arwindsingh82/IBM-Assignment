import java.util.*;
class HennaException extends Exception{
HennaException(String str)
{

}
}

 class AgeValidate {
   static void checkEligibilty(int num1) throws HennaException{ 

      if(num1<15) {
         throw new HennaException("Age of the person should be above 15"); // optional
      }
      else {
         System.out.println("Age is valid and person is major..."); 
      }
     
   } 

   public static void main(String args[]){ 
        Scanner input = new Scanner(System.in);
System.out.println("Enter Age");
int n = input.nextInt();
     try{
      checkEligibilty(n);
    }
    catch(Exception Henna){
     System.out.println("Enter A valid Age: " + "age of person should be above 15"); 
    }
 
}
}