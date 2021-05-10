package Trainning;

import java.util.Scanner;

public interface Trainninginput {
	
	public void getUserInput(Scanner input);
	
	public String getTrainning();
	
	public void setTrainning(String trainning);
	
	public void setWeight(int weight) ;
	
	public void setReps(int reps);
	
	public void setSets(int sets);
	
	public void printInfo();

}
