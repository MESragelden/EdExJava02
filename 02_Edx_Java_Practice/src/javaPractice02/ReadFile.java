package javaPractice02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ReadFile {
    /**
     * Method to read a file and display its contents to Console
     * @param fName - file name to be read
     */
    public static void showFile(String fName) {
	File myFile = new File(fName);
	try{
	    Scanner in = new Scanner(myFile);
	    while (in.hasNextLine()) {
		String line = in.nextLine();
		System.out.println(line);
	    }
	    in.close();
	}
	catch (FileNotFoundException e) {
	    System.out.println("Unable to locate file.\nPlease try a different file.");
	    e.printStackTrace();
	}
    }
    
    public static void clearFile(String fileToClear) {
	try {
	    PrintWriter pw = new PrintWriter(new FileWriter(fileToClear));
	    pw.flush();
	    pw.close();
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    public static void appendFile(String fileToWriteTo, String str) {
	try {
//	    FileWriter fw = new FileWriter(fileToWriteTo);
	    PrintWriter pw = new PrintWriter(new FileWriter(fileToWriteTo, true));
	    pw.print(str+"\n");
	    pw.flush();
	    pw.close();
	}
	catch (IOException e) {
	    System.out.println("File IO Exception occured.");
	    e.printStackTrace();
	}
	finally {
	    
	}
    }
    
    public static void main(String[] args) {
	String file = "/Users/piercegresham/that.txt";
	
//	showFile(file);
	Scanner in = new Scanner(System.in);
	System.out.println("Enter 'show' to see the file.\nEnter 'clear' to clear the file.\nEnter 'add' to add text to the file.");
	while(in.hasNext()) {
	    String n = in.nextLine();
	    if(n.equals("show")) {
		System.out.println("Showing file:\n");
		showFile(file);
	    }
	    else if(n.equals("clear")) {
		System.out.println("Clearing file:\n");
		clearFile(file);
	    }
	    else if (n.equals("add")){
		System.out.println("Enter the text to add and press return.");
		String o = in.nextLine();
		appendFile(file, o);
	    }
	}
    }
    

}
