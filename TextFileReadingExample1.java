package Read.files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReadingExample1 {
 
    public static void main(String[] args) throws Exception
    {
    	FileWriter fw=new FileWriter("D:\\ATM.txt");    
    	Scanner s=new Scanner(System.in);
    	String st=s.nextLine();
        fw.write("Ramesh Goud Marupakula"); 
        fw.close();
        FileReader fr=new FileReader("D:\\ATM.txt");
        int i;    
        while((i=fr.read())!=-1)  {  
        System.out.print((char)i);           
  }    
        fr.close();
        ProcessBuilder p= new ProcessBuilder("notepad","D:\\ATM.txt");
        p.start();
    
    }
 
}