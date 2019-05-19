import java.util.*;
import java.util.Arrays;

class SecondSmallest{
	public static void main(String[] args) {
 SecondSmallest ref = new SecondSmallest();
  ref.getSecondSmallest();

	}

static int getSecondSmallest(){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter how many number you want to insert in array \n");

	int num = input.nextInt();

	
		 
		 int[] arr = new int[num];

	System.out.println("Enter Number in Array: \n");

		    for (int i = 0; i < num; i++)
    {
      arr[i] = input.nextInt();
    }

   
    
  Arrays.sort(arr); 

		
			System.out.println("Second Smallest number in a array is:\n"+ arr[1]);
		
		
return 1;
} 


}