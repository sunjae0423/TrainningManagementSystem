package Trainning;

import java.util.Scanner;

public abstract class  Trainning {
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
    
    public abstract void printInfo(); 
    	
    
}
