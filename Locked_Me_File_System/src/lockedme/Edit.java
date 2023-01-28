package lockedme;

import java.io.File;
import java.io.IOException;

public class Edit {
	// Adding the file
	public static void addFile(String fileName, File dir) {
		File processingDirectory = dir;
		String filePath = processingDirectory.getPath() + "\\" + fileName;
		try {
			  File file = new File(filePath);
		      if (file.createNewFile()) {
		        System.out.println("File added: " + file.getName() + "\n");
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
    // Deleting the file
	public static void deleteFile(String fileName, File dir) {
		File processingDirectory = dir;
		String filePath = processingDirectory.getPath() + "\\" + fileName;
		File file = new File(filePath);
	    if(file.delete()) 
	        System.out.println("File deleted: " + file.getName() + "\n");
	    else   
	        System.out.println("Failed to delete this File....Maybe it is a Folder and it is not Empty...Kindly check.\n");	      
	}
	
}

