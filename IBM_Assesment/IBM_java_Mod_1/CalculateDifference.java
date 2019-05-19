import java.util.*;
import java.util.Arrays;

class CalculateDifference{
	public static void main(String[] args) {
 CalculateDifference ref = new CalculateDifference();
  ref.calDifference();

	}

static int calDifference(){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter number n to find difference between the sum of the squares of the first n natural numbers and the square of their sum  \n");

	int n = input.nextInt();

	int sum1=0 , sum2 = 0;
	

	for (int i =1; i<=n ;i++ ) {
		int digSquare = 0;
		digSquare = i*i;
		sum1 = sum1 + digSquare;
 
	}
	System.out.println("sum of Square of digit of first "+ n +" natural number is: \n" + sum1 );

	for (int j=0; j<=n ;j++ ) {
		sum2 = sum2 + j;
		
	}
	 int square = sum2 * sum2;
System.out.println("\n square of sum of first " + n + " natural number is: \n" + square);

	 int result = sum1 - square;
	System.out.println(" \n Difference between the sum of the squares of the first " + n +  " natural numbers and the square of their sum is:  \n" + result);

		
		
return 1;
} 


}