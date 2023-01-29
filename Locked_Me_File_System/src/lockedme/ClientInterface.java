package lockedme;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientInterface {
	static File workingDirectory = null;
	
	//Insert the working directory
	public static void workingDirectory(){
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Working Directory: ");
			String path = sc.nextLine();
			try {
				workingDirectory = new File(path);
			}catch (Exception e) {
				 System.out.println(e.getMessage());
			}
			if (workingDirectory.isDirectory())
	            System.out.println("Your working directory is: " + path + "\n");
	        else
	        	System.out.println(workingDirectory.getPath() + " is not a valid path for directory....pleaes enter valid path\n");
		}while(!workingDirectory.isDirectory());	
    }
	
	//Welcome to user
	public static void welcome(){
		System.out.println("Welcome to LockedMe File System !!!!!\n");
		System.out.println("Developed by: Hossam Mousa\n");
		System.out.println("Please Enter your Working Directory......\n");
		workingDirectory();
	}
	
	//The display menu
	public static void runningMenu() {
		System.out.println("Select one of the below options: ");
		System.out.println("[1]List Existing Files");
		System.out.println("[2]Search For A File");
		System.out.println("[3]Add A New File");
		System.out.println("[4]Delete An Existing File");
		System.out.println("[5]Change Your Working Directory");
		System.out.println("[6]Exit from LockedMe");
	}
	
	public static void main(String[] args) {
		welcome();
		Scanner sc1 = new Scanner(System.in);
		boolean exit = false;
		new List();
		new Search();
		new Edit();
		int choice = 0;
		while(!exit) {
			runningMenu();
			
			// Validate your input is an Integer.
			while (true) {
				try {
					//Take the input from the user
					choice = sc1.nextInt();
					break;
				} catch (InputMismatchException exception) {
					System.out.println("\nYou enterd unvalid option, please select valid one !!!!\n");
				}
				sc1.nextLine();
			}
			
			// Validate your input is one of the valid options to operate.
			if (choice < 1 || choice > 6) 
				System.out.println("\nYou eneterd unvalid option, please select valid one !!!!\n");
			else {
				switch(choice) {
				case 1:
					System.out.println("\nHere you are the contents of the your working directory: \n");
					String accendingDir[] = List.list(workingDirectory);
					for(String f:accendingDir) {
			        	System.out.println(f);
			        }
					System.out.println("\n");
					break;
				case 2:
					System.out.println("\nPlease Enter The File Name: \n");
					String fileToSearch = sc1.next();
					Search.search(workingDirectory, fileToSearch);
					break;
				case 3:
					System.out.println("Enter The File Name You Want To Add: \n");
					String fileToAdd = sc1.next();
					Edit.addFile(fileToAdd, workingDirectory);
					break;
				case 4:
					System.out.println("Enter The File Name You Want To Delete: \n");
					String fileToDelete = sc1.next();
					Edit.deleteFile(fileToDelete, workingDirectory);
					break;
				case 5:
					workingDirectory();
					break;
				case 6:
					exit = true;
					break;
				}
			}
		}	
		System.out.println("Logged out successfully from LockedMe.... Goodbye!!!");	
	}
}
			
		
		
		


