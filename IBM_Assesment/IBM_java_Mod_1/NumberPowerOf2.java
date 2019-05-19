import java.util.*;


class NumberPowerOf2{
	public static void main(String[] args) {



 NumberPowerOf2 ref = new NumberPowerOf2();
  ref.checkNumber();

	}

static int checkNumber(){
		Scanner input = new Scanner(System.in);
	System.out.println("Enter number to check the number is power of 2 or not: \n");
	int num = input.nextInt();


	int newnum;

	while(num!=1){

		if (num%2==0) {		
			newnum = num/2;
			num = newnum;
			}
			else{
			System.out.println("Number is not a power of 2");
              break;
          }
			}
			if (num==1) {
			System.out.println("Number is power of 2.");		
			}
			
return 1;

}

}