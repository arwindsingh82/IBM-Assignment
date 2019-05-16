import java.io.*;
class ReadFile {

public static void main(String [] args) {

try{


 
BufferedReader br = new BufferedReader(new FileReader("firstFile.txt"));

String str = "";
int count = 0;
StringBuilder sb = new StringBuilder(str);

while((str = br.readLine()) != null)
{
      sb.append(str);
     
     count++;

    System.out.println(count + " " + str);
   }
}catch(IOException e){
            System.out.println("Can't read from the file currently...");

}



}
}