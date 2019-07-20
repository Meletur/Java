package task3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static double[] allArrays;

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);
		Scanner scanner; //= new Scanner(new File(in.nextLine()));
		
		String path = in.nextLine();
		
		allArrays = new double[16];
		
		int indexOfMax = 0;
		
		for (int i = 0; i < 5; i++){
			scanner = new Scanner(new File(path + "/Cash" + (i+1) + ".txt"));
			for (int j = 0; j < 16; j++){
				allArrays[j] += scanner.nextDouble();
			}
		}
		
		
		
		for (int i = 1; i < allArrays.length; i++){
		    if (allArrays[i] > allArrays[indexOfMax])
		        indexOfMax = i;
		}
		
		System.out.print(indexOfMax-1 + "\n");
		
		
		
		
		in.close();
		//scanner.close();
	}

}
