import java.util.*;

class CubeOfNumber{

	public static void main(String[] args) {

	CubeOfNumber ref = new CubeOfNumber();
	ref.cube();
		
	}

void cube(){

		Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number \n");
	Integer number = sc.nextInt();
	int num = number,rem, sum=0;
    
  while(num>0){ 
   rem = num % 10; 
   rem = rem * rem *rem;  
   sum = sum + rem;    
   num = num/10;    
  }   

System.out.println("sum of digits cube of number : " + sum);

}



}