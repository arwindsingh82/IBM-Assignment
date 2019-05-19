import java.util.*;
import java.util.Scanner;


       class PositiveString {

       	public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
         String str = sc.nextLine();
     
             PositiveString ref = new PositiveString();
             ref.find(str);

   if (find(str)==1){
System.out.println("positive string");
   }else
   System.out.println("negative string");
       		
       	}

static int find(String str){
      
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
             

       
