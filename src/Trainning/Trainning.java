package Trainning;

import java.util.Scanner;

public class Trainning {
	protected TrainningKind kind = TrainningKind.Chest;
	protected String Trainning;
    protected int Reps;
    protected int Sets;
    
    public Trainning() {
    	
    }
    
    public Trainning(String Trainning) {
    	this.Trainning = Trainning;
       
    }
        
    public Trainning(String Trainning , int Reps, int Sets) {
    	this.Trainning = Trainning;
        this.Reps = Reps;
        this.Sets = Sets;
    }
    public TrainningKind getKind() {
		return kind;
	}

	public void setKind(TrainningKind kind) {
		this.kind = kind;
	}

	public String getTrainning() {
		return Trainning;
	}

	public void setTrainning(String trainning) {
		Trainning = trainning;
	}

	public int getReps() {
		return Reps;
	}

	public void setReps(int reps) {
		Reps = reps;
	}

	public int getSets() {
		return Sets;
	}

	public void setSets(int sets) {
		Sets = sets;
	}

    
    public void printInfo() {
    	System.out.println("Trainning : " + Trainning+ ", Reps : " + Reps + ", Sets : " + Sets);
    	
    }
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
