package Trainning;

import java.util.Scanner;

import exception.WeightFormatException;

public interface Trainninginput {
	
	public void getUserInput(Scanner input);
	
	public String getTrainning();
	
	public void setTrainning(String trainning);
	
	public int getWeight();
	
	public void setWeight(int weight) throws WeightFormatException;
	
	public int getReps();
	
	public void setReps(int reps);
	
	public int getSets();
	
	public void setSets(int sets);
	
	public void printInfo();
	
	 public void setTrainning(Scanner input);

	 public void setWeight(Scanner input);
	 
	 public void setReps(Scanner input);
	 
	 public void setSets(Scanner input);
}
