package assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		String data;
		char[] array = new char[60];
		Scanner sc =new Scanner(System.in);
		
		 try {
		        // Step 1: Creates a reader using the FileReader
		        FileReader input = new FileReader("C:\\Filehandling\\try.txt");

		        // Step 2: Reads characters
		        input.read(array);
		        
		        System.out.println("Data present inside the file is:");
		        System.out.println(array);

		        // Step 3: Closes the reader
		        input.close();
		      }
		      catch(Exception e) {
		        e.getStackTrace();
		      }
		    
		
	//	System.out.println("Enter the data");
		//data = sc.nextLine(); 
		data = "How are you?";
	   try {
	      // Step 1: Creates a Writer using FileWriter
	      FileWriter output = new FileWriter("C:\\Filehandling\\try.txt");
	 
	      // Step 2: Writes string to the file
	      output.write(data);
	      System.out.println("\nData is written to the file.");

	      // Step 3: Closes the writer
	      output.close();
	   }
	    catch (Exception e) {
	      e.getStackTrace();
	    
	    }
	   
	    String d1 =" Nice to meet you.";
	    File file = new File("C:\\Filehandling\\try.txt");
	    
	    FileWriter fr = null;
		try {
			fr = new FileWriter(file, true);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	    BufferedWriter br = new BufferedWriter(fr);
	    br.write(d1);

	    br.close();
	    fr.close();


	}
}
