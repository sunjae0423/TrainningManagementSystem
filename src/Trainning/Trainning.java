package Trainning;

import java.io.Serializable;
import java.util.Scanner;

import exception.WeightFormatException;

public abstract class  Trainning implements Trainninginput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7231415161866520741L;
	
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

	public void setWeight(int weight) throws WeightFormatException{
		if(weight < 0) {
			throw new WeightFormatException();
		}
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
    
    public void setTrainning(Scanner input) {
    	System.out.print("Trainnig : ");
		String Trainning= input.next();
		this.setTrainning(Trainning);	
    }
    
    public void setWeight(Scanner input) {
    	int weight = -1;
    	while(weight < 0) {
	    	System.out.print("Weight : ");
			weight = input.nextInt();	
			try {
				this.setWeight(weight);
			}catch(WeightFormatException e) {
				System.out.println("Incorrect Weight Format. put Weight more than 0 ");
				
			}
    	}
    }
    
    public void setReps(Scanner input) {
    	System.out.print("Reps : ");
		int Reps = input.nextInt();	
		this.setReps(Reps);
    }
    
    public void setSets(Scanner input) {
    	System.out.print("Sets : ");
		int Sets = input.nextInt();
		this.setSets(Sets);
    }
    
    public String getKindString() {
		String skind = "none";
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
    	default:
    	}
    	return skind;
		
	}
    
    	
    
}
