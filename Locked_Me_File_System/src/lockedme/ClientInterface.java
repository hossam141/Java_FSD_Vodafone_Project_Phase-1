package lockedme;

import java.io.File;
import java.util.Scanner;

public class ClientInterface {
	
	public static void welcome(){
		System.out.println("Welcome to LockedMe File System !!!!!\n");
		System.out.println("Developed by: Hossam Mousa\n");
		System.out.println("Please Enter your Working Directory......\n");
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
		runningMenu();
	}

}
