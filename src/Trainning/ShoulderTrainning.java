package Trainning;

import java.util.Scanner;

public class ShoulderTrainning extends Trainning implements Trainninginput {
	
	
	public ShoulderTrainning(TrainningKind kind) {
    	super(kind);
    }
	
	public void getUserInput(Scanner input) {
    	System.out.print("TrainningProgram : ");
		String Trainning = input.next();
		this.setTrainning(Trainning);
		
		System.out.print("weight(kg): ");
		int weight= input.nextInt();
		this.setWeight(weight);
		
		System.out.print("Reps: ");
		int Reps= input.nextInt();
		this.setReps(Reps);
		
		System.out.print("Sets: ");
		int Sets = input.nextInt();
		this.setSets(Sets);  	
    }
	
	public void printInfo() {
    	switch(this.kind) {
    	case Chest:
    		skind = "Chest";
    		break;
    	case Back:
    		skind = "Back";
    		break;
    	case Shoulder:
    		skind = "Shoulder";
    		break;
    	case Arm:
    		skind = "Arm";
    		break;
    	case Leg:
    		skind = "Leg";
    		break;
    	}
    	System.out.println("Kind : " +kind + ", Trainning : " + Trainning + ", weight : " + weight + "kg, Reps : " + Reps + ", Sets : " + Sets);
    	
    }
}
