import java.util.*;
		import java.util.regex.Pattern;  
import java.util.regex.Matcher; 
class JobSeeker{

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username: \n");
		String username = sc.nextLine();
		
		JobSeeker ref = new JobSeeker();
		ref.validation(username);
	

   if (validation(username)==true){
	System.out.println("Correct");
   }else
System.out.println("Incorrect!.." + "Enter Valid pattern");
       		
       	}



	static boolean validation(String username){


if (username.endsWith("_job") && username.length()>7) {

return true;
	
}else
return false;



		
/*		String username = new String();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter user name.. With pattern: ------_job");
		username = sc.nextLine();
		int unamelen = username.length();
		if(unamelen < 12)
			System.out.println("Give user name of atleast 12 and above");
		else
		{
			String pattern = "[A-Z][a-z]{8}_[job]+";
			if(username.matches(pattern))
				System.out.println("Correct");
			else
				System.out.println("Incorrect");
		}*/

	}
}

