package Trainning;

import java.util.Scanner;

public class Chesttrainning extends Trainning {
	
	public void getUserInput(Scanner input) {
    	System.out.print("TrainningProgram : ");
		String Trainning = input.next();
		this.setTrainning(Trainning);
		
		System.out.print("Reps: ");
		int Reps= input.nextInt();
		this.setReps(Reps);
		
		System.out.print("Sets: ");
		int Sets = input.nextInt();
		this.setSets(Sets);
		
				
		
    	
    }

}
