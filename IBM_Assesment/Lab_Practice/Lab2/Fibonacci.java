import java.util.*;

class Fibonacci{

public static void main(String[] args) {
	Fibonacci ref = new Fibonacci();
	ref.nthNumber();
	
}


void nthNumber(){

Scanner input = new Scanner(System.in);
System.out.println("Enter the nth Number :  ");
int n = input.nextInt();

int firstnum=1, secnum=1, sum=0;



if (n==1) {
	System.out.print(firstnum);	
}else if(n==2){
System.out.print(firstnum +" "+ secnum);
}if (n>=3) {
	for (int i=3; i<=n ;i++ ) {
sum = firstnum + secnum;
System.out.print("value is " + sum);	
firstnum = secnum;
secnum = sum;

}
	
}



}


}