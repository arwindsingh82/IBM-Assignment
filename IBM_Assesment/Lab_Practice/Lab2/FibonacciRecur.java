import java.util.*;

public class FibonacciRecur{

	public static int fibo(int a){
        if(a == 1 || a == 2){
            return 1;
        }
              
        return fibo(a-1) + fibo(a -2); // recursion
    }
 

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
System.out.println("Enter the nth Number :  ");
int n = input.nextInt();

System.out.println(fibo(n));
   
}
}





//int firstnum=1, secnum=1, sum=0;


/*    int fibo(n){
        if(n == 1 || n == 2){
            return 1;
        }
      
        return fibo(n-1) + fibo(n -2); // recursion
    }
    for(int i=1; i<=n; i++){
            System.out.print(fibo(i) +" ");
        }*/

