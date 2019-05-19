import java.util.*;
import java.util.Arrays;
class IntArrayReverse{
	public static void main(String[] args) {
 IntArrayReverse ref = new IntArrayReverse();
  ref.reverseIntArr();

	}

static int reverseIntArr(){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter how many number you want to insert in array \n");

	int num = input.nextInt();

	int n ,i , reverse=0;
		 
		 int[] arr = new int[num];

	System.out.println("Enter Number in Array: \n");

		    for ( i = 0; i < num; i++)
    {
      arr[i] = input.nextInt();
    }

    for ( i=0; i<num ;i++ ) {
    	
    	 n = arr[i];
    	  while (n != 0)
   {
      reverse = reverse * 10;
      reverse = reverse + n%10;
      n       = n/10;
   }
   arr[i]= reverse;

   reverse=0;

    }
 

     System.out.println("reversed array: \n");
 
	   


       for (i = 0; i < num; i++) {
            System.out.print(arr[i] + "\n ");                      
        }
    
    
       Arrays.sort(arr); 
System.out.println(" \nSorted Array of Reversed Array:  \n");

		for (i=0;i<num ;i++ ) {
			System.out.println("\n"+ arr[i]);
		}
		
return 1;
} 


}