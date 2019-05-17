
import java.io.*;
class ReplaceWord{
    public static void main(String[] args) {
        
        java.util.Scanner sc =  new java.util.Scanner(System.in);
        System.out.println("word you want to replace :");
            String word = sc.nextLine();
            System.out.println("enter word:");
            String newreplace = sc.nextLine();

        

        try
        {
            File file = new File("firstFile.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String str; 
            String filecontent = ""; 
            while((str = reader.readLine()) != null)
            {
                str = str.replace(word,newreplace);
                filecontent = filecontent + str + "\n";
            }
            reader.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(filecontent);
            bw.flush();
            bw.close();
            
            
            
        }catch(Exception e)
        {
            System.out.println("Exception caught: "+e);
        }
    }
}