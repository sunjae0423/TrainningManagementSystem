import java.util.ArrayList;
import java.util.Scanner;

import Trainning.ArmTrainning;
import Trainning.BackTrainning;
import Trainning.ChestTrainning;
import Trainning.LegTrainning;
import Trainning.ShoulderTrainning;
import Trainning.Trainning;
import Trainning.TrainningKind;
import Trainning.Trainninginput;

public class TrainningManager {	
	ArrayList<Trainninginput> trainnings = new ArrayList<Trainninginput>();
	Scanner input;
	TrainningManager(Scanner input){
		this.input = input;
	}	
	public void AddTrainning() {
		int kind = 0;
		Trainninginput trainninginput;
		while(kind != 6) {
			System.out.println("1 Chest : ");
			System.out.println("2 Back : ");
			System.out.println("3 Shoulder : ");
			System.out.println("4 Arm : ");
			System.out.println("5 Leg : ");
			System.out.print("Select num for Trainning Kind between 1, 2, 3, 4 or 5 : ");
			kind = input.nextInt();
			if(kind == 1) {
				trainninginput = new ChestTrainning(TrainningKind.Chest);
				trainninginput.getUserInput(input);
				trainnings.add(trainninginput);
				break;
			}
			else if(kind == 2) {
				trainninginput  = new BackTrainning(TrainningKind.Back);
				trainninginput.getUserInput(input);
				trainnings.add(trainninginput);
				break;
			}
			else if(kind == 3) {
				trainninginput  = new ShoulderTrainning(TrainningKind.Shoulder);
				trainninginput.getUserInput(input);
				trainnings.add(trainninginput);
				break;
			}
			else if(kind == 4) {
				trainninginput  = new ArmTrainning(TrainningKind.Arm);
				trainninginput.getUserInput(input);
				trainnings.add(trainninginput);
				break;
			}
			else if(kind == 5) {
				trainninginput  = new LegTrainning(TrainningKind.Leg);
				trainninginput.getUserInput(input);
				trainnings.add(trainninginput);
				break;
			}
			else {
				System.out.print("Select num for Trainning Kind between 1, 2, 3, 4 or 5 : ");		
			}
		}	
	}
	public void DeleteTrainning() {
		System.out.print("TrainningProgram : ");
		String Trainning = input.next();	
		int index = -1;
		for(int i= 0; i<trainnings.size();i++) {
			if(trainnings.get(i).getTrainning().equals(Trainning)) {
				index = i;
				break;
			}
		}
		if(index>=0) {
			trainnings.remove(index);
			System.out.println("the trainning "+ Trainning + " is deleted");
		}
		else {
			System.out.println("the trainning has not been registered");
			return;
		}
	}		
    public void EditTrainning() {
    	System.out.println("TrainningProgram : ");
    	String Trainning = input.next();
    	for(int i= 0; i<trainnings.size();i++) {
    		Trainninginput trainninginput = trainnings.get(i);
    		if(trainninginput.getTrainning().equals(Trainning)) {
    			int num = -1; 
    			while(num != 5) {
    				System.out.println("**Trainning Info Edit Menu**");
    				System.out.println("1. Edit Trainning");
    				System.out.println("2. Edit weight");
    				System.out.println("3. Edit Reps");
	    			System.out.println("4. Edit Sets");
	    			System.out.println("5. Exit");
	    			System.out.println("Select ont number between 1-5");
	    			num = input.nextInt();
	    			if(num == 1){
	    				System.out.print("Trainnig : ");
	    				Trainning= input.nextLine();
	    				trainninginput.setTrainning(Trainning);			
	    			}
	    			else if(num == 2) {
	    				System.out.print("Weight : ");
	    				int weight = input.nextInt();	
	    				trainninginput.setWeight(weight);
	    			}
	    			else if(num == 3) {
	    				System.out.print("Reps : ");
	    				int Reps = input.nextInt();	
	    				trainninginput.setReps(Reps);
	    			}
	    			else if(num == 4){
	    				System.out.print("Sets : ");
	    				int Sets = input.nextInt();
	    				trainninginput.setSets(Sets);
	    			}
	    			else {
	    				continue;
	    			}
    		    }//while
    		}//if
    	}//for	
	}//Edit
    public void ViewTrainning() {
//		System.out.print("TrainningProgram : ");
//		String Trainning = input.next();
    	for(int i= 0; i<trainnings.size();i++) {
    		trainnings.get(i).printInfo();
    	}
    }	
}


