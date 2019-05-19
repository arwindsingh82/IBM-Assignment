import java.util.*;
import java.util.Scanner;


       class CheckNumber {

       	public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n: ");
       Integer n = sc.nextInt();
     
             CheckNumber ref = new CheckNumber();
             ref.checkNumber(n);

   if (checkNumber(n)==1){
System.out.println("Increasing Number");
   }else
   System.out.println("Non-Increasing number");
       		
       	}

static int checkNumber(int n){

  String str = Integer.toString(n);
      
            for(int j=1; j<=str.length()-1; j++)
            {      
            
                
                if(str.charAt(j-1) > str.charAt(j))
                {

                 return 0;
                  
                }

          } 

          return 1;
            }

         

         
      } 
             

       
