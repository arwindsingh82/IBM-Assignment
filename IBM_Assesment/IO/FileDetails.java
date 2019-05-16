import java.util.Scanner;
import java.io.File;

class FileDetails {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String search=input.nextLine();
		File f=new File(search);

		System.out.println("File Name:"+f.getName());
	
		System.out.println("This file is:  " + (f.exists()?"Exists":"Does not exists"));

		System.out.println("Is Readable:  "  +f.canRead());

		System.out.println("IS Writable:  "  +f.canWrite());

		System.out.println("File Size:  "+ f.length()+ "bytes");
		
	}
}


