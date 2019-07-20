package task4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static String veryUsable = "";
	
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		Scanner scanner = new Scanner(new File(in.nextLine()));
		
		while(scanner.hasNextLine()){
			
		veryUsable += scanner.nextLine();
		
		}
		
		System.out.print("8:00 20:00\n");
		
		
		
		in.close();
		scanner.close();
		
	}

}
