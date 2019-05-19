import java.util.*;
import java.util.Arrays;

class CalculateSum{
	public static void main(String[] args) {
 CalculateSum ref = new CalculateSum();
  ref.calculateSum();

	}

static int calculateSum(){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter number n to find sum of first n natural number divisible by 3 or 5 \n");

	int n = input.nextInt();
	int sum=0;

	for (int i =1; i<=n ;i++ ) {
		if (i%3==0 || i%5==0) {
    System.out.print(i + "  ");
			sum = sum + i;
			
		}
	}
	System.out.println(" \n Sum is:  " + sum);

		
		
return 1;
} 


}