package lockedme;

import java.io.File;
import java.util.Scanner;

public class ClientInterface {
	static File workingDirectory = null;
	
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
	
	public static void welcome(){
		System.out.println("Welcome to LockedMe File System !!!!!\n");
		System.out.println("Developed by: Hossam Mousa\n");
		System.out.println("Please Enter your Working Directory......\n");
		workingDirectory();
	}
	
	public static void runningMenu() {
		System.out.println("Select one of the below options: ");
		System.out.println("[1]List Existing Files");
		System.out.println("[2]Add A New File");
		System.out.println("[3]Delete An Existing File");
		System.out.println("[4]Search For A File");
		System.out.println("[5]Change Your Working Directory");
		System.out.println("[6]Exit from LockedMe");
	}
	
	
	public static void main(String[] args) {
		welcome();
		Scanner sc1 = new Scanner(System.in);
		boolean exit = false;
		while(!exit) {
			runningMenu();
			int choice = sc1.nextInt();
			if (choice < 1 || choice > 6) 
				System.out.println("You eneterd unvalid option, please select valid one !!!!");
			else {
				switch(choice) {
				case 1:
					System.out.println("\nHere you are the contents of the your working directory: \n");
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
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