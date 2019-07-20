package task1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	static ArrayList<Double> values;
	
	static final int percentile = 90;
	
	static int percentileValue;
	
	static double medium = 0;
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		Scanner scanner = new Scanner(new File(in.nextLine()));
		
        values = new ArrayList<Double>();
        int j = 0;
        
        while(scanner.hasNextDouble()){
        	values.add(scanner.nextDouble());
        }
        
        double percentileIndex = values.size()/100.0*percentile;
        
        //Менять percentileIndex не нужно - в любом случае для индекса берется следующее целочисленное значение (+1),
        //а его положение в массиве окажется индекс-1
        
        values.sort(null);
        System.out.print(values.get((int)percentileIndex - 1) + "\n");
        
        if (values.size() % 2 == 0)
        	System.out.print((values.get(values.size()/2) + values.get(values.size()/2 + 1))/2 + "\n");
        else
        	System.out.print(values.get(values.size()/2) + "\n");
        
        System.out.print(values.get(values.size()-1) + "\n");
        
        System.out.print(values.get(0) + "\n");


        for (int i = 0; i < values.size(); i++){
        	medium += values.get(i);
        }
        medium = medium/values.size();
        System.out.print(medium + "\n");
        //D:\Programming\Java\Eclipse\Workspace\task1.txt
        
        in.close();
        scanner.close();
        
        

	}

}
