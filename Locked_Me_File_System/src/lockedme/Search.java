package lockedme;

import java.io.File;

public class Search {
	public static void search(File dir, String fileName) {
		File processingDirectory = dir;
		String filePath = processingDirectory.getPath() + "\\" + fileName;
		File file = new File(filePath);
		
		if(file.exists()) {
			
			String directoryAfterSorting[] = List.list(processingDirectory);
			int x = directoryAfterSorting.length;
			
			// Searching with Linear Search
			for (int i = 0; i < x; i++) {
	            if (directoryAfterSorting[i].equals(fileName) ) {
	            	 System.out.println("\n" + fileName + " Exist at index " +  i + "\n");
	            }
	                 
	        }
	    }else
	    	System.out.println("\n" + fileName + " Doses not Exist.....Kindly Check Your Input !!!!!");
	}
		
}

