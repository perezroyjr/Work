package Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {

	
	
	//create a new empty file
	public void createEmptyFile(String fileName){
		PrintWriter outStream = null;
		try {
			outStream = new PrintWriter(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if(outStream !=null){
				outStream.close();//close the file if it has not been closed
			}
			System.out.println("End of createEmptyFile method");
		}
	}
	
	// write to a new file
	public void generateIDs() {
		writeToNewFile("ids.txt", "0");
	}
	
	
	public String getCurrentID() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("ids.txt"));
		String LastLine = null, line;
		while ((line = reader.readLine()) != null ) {
			LastLine = line;
		}
		reader.close();
		return LastLine;
		
	}
	
	public void setCurrentID() {
		String currId = null;
		try {
			currId = getCurrentID();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int newId = Integer.parseInt(currId) + 1;
		appendIntToFile("ids.txt", newId);
		
		
		
	}
	//write to a new file
	public void writeToNewFile(String fileName, String text){
		PrintWriter outStream = null;

		try {
			outStream = new PrintWriter(fileName);//create and connect to file
			outStream.println(text);//write to the file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if(outStream !=null){
				outStream.close();//close the file if it has not been closed
			}
			System.out.println("End of writeToNewFile method");
		}
	}
	
	//append to an existing file... or create a new one if it doesn't exist
	public void appendToFile(String fileName, String newId){
		PrintWriter outStream = null;
		try {
			//outStream = new PrintWriter(fileName);//create and connect to file would overwrite the content
			outStream = new PrintWriter(new FileOutputStream(fileName, true));//pass true to the FileOutputStream constructor to append to end of file
			outStream.println(newId);//write to the file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if(outStream !=null){
				outStream.close();//close the file if it has not been closed
			}
			System.out.println("End of appendToFile method");
		}
	}
	
	public void appendIntToFile(String fileName, int newId){
		PrintWriter outStream = null;
		try {
			//outStream = new PrintWriter(fileName);//create and connect to file would overwrite the content
			outStream = new PrintWriter(new FileOutputStream(fileName, true));//pass true to the FileOutputStream constructor to append to end of file
			outStream.println(newId);//write to the file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if(outStream !=null){
				outStream.close();//close the file if it has not been closed
			}
			System.out.println("End of appendToFile method");
		}
	}
	
	
	
	//read from a very small file
	public String getStringFromFile(String fileName){
		String fileContent = "";
		Scanner inStream =null;
		try{
			File theFileObject = new File(fileName);//create a File Object using its String file name
					inStream = new Scanner(theFileObject);//connect to the file
					while(inStream.hasNextLine()){//as long as there is a next line
						fileContent += inStream.nextLine()+"\n";//get the next line and append it to our string that we will return
						
					}
		}
		catch(FileNotFoundException fnfe){
			//fnfe.printStackTrace();
			System.out.println("File NOT FOUND: "+fileName);
			System.out.println(fnfe.getMessage());
		}
		catch(SecurityException se){
			System.out.println("No read access for the file named "+fileName);
			System.err.println(se);
		}
		finally{
			if(inStream !=null){
				inStream.close();
			}
		}
		return fileContent;
	}
	public void printFileContent(String fileName){
		//String fileContent = "";
		Scanner inStream =null;
		try{
			File theFileObject = new File(fileName);//create a File Object using its String file name
			inStream = new Scanner(theFileObject);//connect to the file
			while(inStream.hasNextLine()){//as long as there is a next line
				System.out.println(inStream.nextLine());//print it out
			}
		}catch(FileNotFoundException fnfe){
			//fnfe.printStackTrace();
			System.out.println("File NOT FOUND: "+fileName);
			System.out.println(fnfe.getMessage());
		}
		catch(SecurityException se){
			System.out.println("No read access for the file named "+fileName);
			System.err.println(se);
		}
		finally{
			if(inStream !=null){
				inStream.close();
			}
		}
	}
	
	/*public void copyFileContent(String fileName){
		//String fileContent = "";
		Scanner inStream =null;
		PrintWriter outStream = null;
	    String fileCopyName = "copy_"+fileName;//assuming the filename does not include path
		try{
			System.out.println("INSIDE TRY");
			File theFileObject = new File(fileName);//create a File Object using its String file name
			inStream = new Scanner(theFileObject);//connect to the original file
			outStream = new PrintWriter(new FileOutputStream(fileCopyName,true));//create a new File to write to
			while(inStream.hasNextLine()){//as long as there is a next line
				String line = inStream.nextLine();//get line from original
				//System.out.println(line);
				//outStream.println(line);//print it to the copy file
				appendToFile(fileCopyName, line);
			}
		}catch(FileNotFoundException fnfe){
			//fnfe.printStackTrace();
			System.out.println("File NOT FOUND: "+fileName);
			System.out.println(fnfe.getMessage());
		}
		catch(SecurityException se){
			System.out.println("No read access for the file named "+fileName);
			System.err.println(se);
		}
		finally{
			if(inStream !=null){
				inStream.close();
			}
		}
	}
	*/
	public boolean deleteFile(String fileName){
		File theFileObject = new File(fileName);
		if(theFileObject.exists()){
			if(theFileObject.delete()){
				System.out.println("cool beans"+fileName+"was deleted");
				return true;
			}
			else{
				System.out.println("could not delete"+ fileName);
			}
		}
		else{
			System.out.println("File "+fileName+" does not exist");
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}