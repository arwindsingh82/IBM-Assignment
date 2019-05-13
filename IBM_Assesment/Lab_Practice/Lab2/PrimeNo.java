import java.util.*;
class PrimeNo{
    
	void prime(){
			Scanner input = new Scanner(System.in);
System.out.println("Enter the Number :  ");
int n = input.nextInt();

 		
		for (int i=1;i<=n ;i++ ) {
			int count=0;
			for (int j=1;j<=i ;j++ ) {
				if(i % j == 0){
                count++;
        }
        }
         if (count==2) {
        	System.out.println("prime number are :" + i);
			}
        
    }
}
public static void main(String[] args) {
PrimeNo ref = new PrimeNo();
ref.prime();
   
}
}