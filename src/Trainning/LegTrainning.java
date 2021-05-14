package Trainning;

import java.util.Scanner;

public class LegTrainning extends Trainning{
	
	public LegTrainning(TrainningKind kind) {
    	super(kind);
    }
	
	public void getUserInput(Scanner input) {
    	setTrainning(input);
    	setWeight(input);
    	setReps(input);
    	setSets(input);
    }
	
	public void printInfo() {
		String skind = getKindString();
    	System.out.println("Kind : " +skind + ", Trainning : " + Trainning + ", weight : " + weight + "kg, Reps : " + Reps + ", Sets : " + Sets);
    	
    }
	
}
