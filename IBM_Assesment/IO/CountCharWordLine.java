//Write a Java program that displays the number of characters, lines and words in a text read from a file

import java.io.*; 
  
public class CountCharWordLine { 
    public static void main(String[] args) 
    { 

        try{
        File file = new File("firstFile.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String str; 
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
          
        while((str = reader.readLine()) != null) 
        { 
            if(!(str.equals(""))) 
            { 
                  
                characterCount += str.length(); 
                String[] wordList = str.split("\\s+"); 
                  countWord += wordList.length; 
                String[] sentenceList = str.split("[.]+"); 
                  sentenceCount += sentenceList.length; 
            } 
        } 
          
        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        System.out.println("Total number of characters = " + characterCount); 
    } catch(IOException e){
        System.out.println("file doesn't exist");
    }
    } 
}