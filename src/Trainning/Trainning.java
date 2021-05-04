package Trainning;

import java.util.Scanner;

public class Trainning {
	protected TrainningKind kind = TrainningKind.Chest;
	protected String Trainning;
    protected int Reps;
    protected int Sets;
    protected int weight;
    
    

	public Trainning() {
    	
    }
    
    public Trainning(TrainningKind kind) {
    	this.kind = kind;
    }
    
    public Trainning(String Trainning) {
    	this.Trainning = Trainning;
       
    }
        
    public Trainning(String Trainning , int Reps, int Sets) {
    	this.Trainning = Trainning;
        this.Reps = Reps;
        this.Sets = Sets;
    }
    
    public Trainning(TrainningKind kind, String Trainning , int Reps, int Sets) {
    	this.kind = kind;
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
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
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

    String skind = "none";
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
    public void getUserInput(Scanner input) {
    	System.out.print("TrainningProgram : ");
	    String Trainning = input.next();
		this.setTrainning(Trainning);
		
		System.out.print("weight: ");
		int weight= input.nextInt();
		this.setReps(weight);
		
		
		System.out.print("Reps: ");
		int Reps= input.nextInt();
		this.setReps(Reps);
		
		System.out.print("Sets: ");
		int Sets = input.nextInt();
		this.setSets(Sets);
    	
    }
}
