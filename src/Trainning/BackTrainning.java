package Trainning;

import java.util.Scanner;

public class BackTrainning extends Trainning {
	
	public BackTrainning(TrainningKind kind) {
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
