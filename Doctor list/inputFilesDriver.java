import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * Date: March 4th 2022
 * This program generates html files based on csv files to create tables that display the information in the files.
 * @author Shamma_and_Ihana
 * @version 1.0
 *
 */

/**
 *  Exception class thats targets all errors in relation with missing attributes in the csv file
 */
class CSVAttributeMissing extends Exception {

	/**
	 * Constructor
	 */
	public CSVAttributeMissing() {

		super("Error: Input row cannot be parsed due to missing information.");
	}
	
	/**
	 * Constructor that takes in a String parameter
	 */
	public CSVAttributeMissing(String s) {

		super(s);

	}
	
	/**
	 * String method to return the message
	 */
	public String getMessage() {

		return super.getMessage();

	}
}

/**
 *  Exception class thats targets all errors in relation with missing data in the csv file
 */
class CSVDataMissing extends Exception {
	
	/**
	 * Constructor
	 */
	public CSVDataMissing() {

		super("Error: Input row cannot be parsed due to missing information.");
	}
	
	/**
	 * Constructor that takes in a String parameter
	 */
	public CSVDataMissing(String s) {

		super(s);

	}
	
	/**
	 * String method to return the message
	 */
	public String getMessage() {

		return super.getMessage();

	}
}

/**
 *  Driver class +
 */
public class inputFilesDriver {

	/**
	 * @param args Main class to try to open, read the files and create a new one
	 */
	public static void main(String[] args) {
		Scanner sc = null;
		Scanner answer = new Scanner(System.in);
		PrintWriter pw = null;
		PrintWriter pw2 = null;
		BufferedReader br = null;
		String html = null;
		String el = "Exception.log";
		FileOutputStream fos = null;

		
		System.out.println("Enter the name of the file to open: ");
		String file = answer.nextLine();
		
		System.out.println("\nEnter the path where you want to create a folder: ");
		String path = answer.nextLine();
		
		System.out.println("\nEnter the name of the desired directory: ");
		String path2 = path+answer.nextLine();
		
		File dir = new File(path2);
		
		boolean bool = dir.mkdirs();
		
		if(bool) {
			System.out.println("\nFolder is createad successfully!\n");
			
		}	
		
		System.out.println("\nEnter the name of the HTML file you want to create: ");
		html = answer.nextLine();
		
		File destination = new File(dir, html);
		File exceptionLog = new File(dir, el);
		

		try {
			sc = new Scanner(new FileInputStream(path + file));
			pw = new PrintWriter(new FileOutputStream(destination, true));

		} catch (FileNotFoundException e) {
			System.out.println("\nCould not open input file " + file + " for reading. \r\n"
					+ "Please check that the file exists and is readable. This program will terminate after closing any opened files");
			
			
			String[] files = dir.list();
			for(String s : files) {
				File current = new File(dir.getPath(), s);
				current.delete();
			}
			
			System.exit(0);

		}

		try {

			convertCSVtoHTML(sc, pw, file);

		} catch (CSVAttributeMissing e) {

			String s = e.getMessage();
			System.out.println(s);
			
			try {
				fos = new FileOutputStream(exceptionLog);
				
				if(!exceptionLog.exists()) {
					exceptionLog.createNewFile();
				}
				
				
					String myContent = "Could not open file " + file + " for reading\r\n"
							+ "Please check that the file exists and is readable. \r\n"
							+ "This program will terminate after closing any opened files.\r\n" + "" + "\n\n" + s;
					
					byte[] bytesArray = myContent.getBytes();
					
					fos.write(bytesArray);
					fos.flush();
					fos.close();
				
			}
			catch(IOException e1) {
				e.printStackTrace();
			}
			
			System.exit(0);

		} catch (CSVDataMissing e) {

			String s = e.getMessage();
			System.out.println(s);
			
			try {
				fos = new FileOutputStream(exceptionLog);
				
				if(!exceptionLog.exists()) {
					exceptionLog.createNewFile();
				}
				
				
					String myContent = "Could not open file " + file + " for reading\r\n"
							+ "Please check that the file exists and is readable. \r\n"
							+ "This program will terminate after closing any opened files.\r\n" + "" + "\n\n" + s;
					
					byte[] bytesArray = myContent.getBytes();
					
					fos.write(bytesArray);
					fos.flush();
					fos.close();
				
			}
			catch(IOException e1) {
				e.printStackTrace();
			}
			
			System.exit(0);
	
		}
		
		System.out.println("\nEnter the name of the html file you want to display from the directory: ");
		String htmlFile = answer.nextLine();
		
		File displayFile = new File (dir, htmlFile);
		
		try {
			
			br = new BufferedReader(new FileReader(displayFile));
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				
				line = br.readLine(); 
			}
			
			br.close();
		}
		
		catch (FileNotFoundException e){
			System.out.println("\nInvalid input, file does not exist! Please try again: ");
			htmlFile = answer.nextLine();
			
			displayFile = new File (dir, htmlFile);
			
			try {
				br = new BufferedReader(new FileReader(displayFile));
				
				String line = br.readLine();
				
				while (line != null) {
					System.out.println(line);
					
					line = br.readLine(); 
				}
				
				br.close();
			}
			
			catch (FileNotFoundException e2) {
				System.out.println("Sorry, this was your last chance, input invalid. Program will terminate");
				System.exit(0);
			}
			
			catch (IOException e3) {
				System.out.println("Sorry, this was your last chance. Program will terminate");
				System.exit(0);
			}
			
		}
		
		catch (IOException e3) {
			System.out.println("Sorry, this was your last chance. Program will terminate");
			System.exit(0);
		}
		

		answer.close();		
		
	}
	
	/**
	 * @param s Scanner to read the files
	 * @param p Printwriter to write the desired information from the file to the new html file
	 * @param fileName String that represents the name of the file the user wants to read
	 * @throws CSVAttributeMissing Class Exception thrown if there's an error in the reading
	 * @throws CSVDataMissing Class exception thrown if there's an error in the reading
	 */
	public static void convertCSVtoHTML(Scanner s, PrintWriter p, String fileName) throws CSVAttributeMissing, CSVDataMissing {
		
		String n = null;
		String [] Attribute=null;

		StringBuilder sb = new StringBuilder();

		while (s.hasNextLine()) {
			n = s.nextLine();
			sb.append(n+"!");
		}

		String [] content = sb.toString().split("!");

		String w = content[0];
		String[] d = w.split(",");


		for(int i = 1; i < content.length - 1; i++) {
			n = content[i];
			String[] st1 = n.split(",");

			if (i == 1) {
				Attribute = new String [st1.length];

				for (int z = 0; z < Attribute.length; z++) {
					Attribute[z] = st1[i];
				}
			}

			int count=0;

			for (int j= 0; j<st1.length; j++) {

				count++;

				if (st1[j] == null && i==1) {
					
					throw new CSVAttributeMissing("\nERROR: In file " + fileName + ". Misssing attribute. File is not converted to HTML." );
				}

				if ((st1[j] == null || st1[j].isBlank()) && i!=1) {
					
					throw new CSVDataMissing("\nWARNING: In file " + fileName + " line " + (i+1) + " is not converted to HTML : missing data: " + Attribute[count]);
				}
			}
		}

		p.println("\n<html>\r\n"
				+ "<style>\r\n"
				+ "table {font-family: arial, sans-serif;border-collapse: collapse;}\r\n"
				+ "td, th {border: 1px solid #000000;text-align: left;padding: 8px;}\r\n"
				+ "tr:nth-child(even) {background-color: #dddddd;}\r\n"
				+ "span{font-size: small}\r\n"
				+ "</style>\r\n" + "<body>\r\n\r\n" + "<table>\r\n");			

		p.println("<caption>");

		for (String c : d)
			p.println(c);

		p.println("</caption>");

		for(int j = 1; j < content.length - 1; j++) {
			n = content[j];
			StringTokenizer st1 = new StringTokenizer(n,",");

			p.println("<tr>");

			while (st1.hasMoreTokens()) {
				p.println("<th>" + st1.nextToken() + "</th>");			
			}
			p.println("</tr>");
		}

		String z = content[content.length-1];

		String[] m = z.split(",");

		p.println("</table>\r\n" + "<span>");

		for (String c : m)
			p.println(c);

		p.println("</span>\r\n" + "</body>\r\n" + "</html>");
		
		System.out.println("\nYour file was successfully created!");

		s.close();
		p.close();

	}
}
