import java.util.*;

class TrafficLight{

public static void main(String[] args) {
	TrafficLight ref = new TrafficLight();
	ref.signal();
	
}


void signal(){

Scanner input = new Scanner(System.in);
System.out.println("Enter the following choice :  ");
System.out.println("1");
System.out.println("2");
System.out.println("3");
int choice = input.nextInt();

if (choice==1) {
	System.out.println("Green Light Go...");
	
}else if(choice==2){
	System.out.println("Yellow light Ready...");
}else if(choice==3){
	System.out.println("Red light wait...");
}else
System.out.println("Enter correct choice");

}


}