package lockedme;

import java.io.File;
import java.util.*;

public class List {
	
	public static void list(File dir){
		File Directory = dir;
		String files[] = Directory.list();
		
		int n = files.length;
		String temp;
		 
        // Sorting with bubble Sort
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (files[j].compareTo(files[i]) > 0) {
                    temp = files[j];
                    files[j] = files[i];
                    files[i] = temp;
                }
            }
        }
        for(String f:files) {
        	System.out.println(f);
        }
        System.out.println("\n");
	}

}