import java.util.*;
import java.util.Scanner;
import java.util.StringTokenizer;

       class StringTokenizerSum {

       	public static void main(String[] args) {
       		Scanner sc = new Scanner(System.in);
       		 System.out.print("\nEnter A Line Of Integers:");
       		String num = sc.nextLine();

       		System.out.print("Integers are: " + num);

        StringTokenizer token = new StringTokenizer(num, " ");

         System.out.print("\nTokens are : \n" );

           int sum = 0;
         while (token.hasMoreTokens())
         {
             String temp = token.nextToken();
             Integer a = Integer.parseInt(temp);
            System.out.print(a + "\n");
            sum = sum + a;
         }
         System.out.println("\nThe Sum Is :" +sum);


       		
       	}
         
      }