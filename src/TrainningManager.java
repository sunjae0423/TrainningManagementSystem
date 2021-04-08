import java.util.ArrayList;
import java.util.Scanner;

import Trainning.Chesttrainning;
import Trainning.Trainning;

public class TrainningManager {
	
	ArrayList<Trainning> trainnings = new ArrayList<Trainning>();
	Scanner input;
	TrainningManager(Scanner input){
		this.input = input;
	}
		
		
	public void AddTrainning() {
		int kind = 0;
		Trainning trainning;
		while(kind != 3) {
			System.out.println("1 for Chest : ");
			System.out.println("2 for Back : ");
			System.out.print("Select num for Trainning Kind between 1 and 2 : ");
			kind = input.nextInt();
			if(kind == 1) {
				trainning = new Chesttrainning();
				trainning.getUserInput(input);
				trainnings.add(trainning);
				break;
			}
			else if(kind == 2) {
				trainning  = new Trainning();
				trainning.getUserInput(input);
				trainnings.add(trainning);
				break;
			}
			else {
				System.out.print("Select num for Trainning Kind between 1 and 2 : ");			
			}
		}
		
		
		
		
		
		
		
	}
	public void DeleteTrainning() {
		System.out.print("TrainningProgram : ");
		String Trainning = input.nextLine();
		int index = -1;
		for(int i= 0; i<trainnings.size();i++) {
			if(trainnings.get(i).getTrainning().equals(Trainning)) {
				index = i;
				break;
			}
		}
		if(index>=0) {
			trainnings.remove(index);
			System.out.println("the student"+ Trainning + "is deleted");
		}
		else {
			System.out.println("the student has not been registered");
			return;
		}
		if(trainnings.equals(null)) {
				System.out.println("the trainning  has not been registerd");
		}
	}
			
		
		
		
    public void EditTrainning() {
    	System.out.println("TrainningProgram : ");
    	String Trainning = input.nextLine();
    	for(int i= 0; i<trainnings.size();i++) {
    		Trainning trainning = trainnings.get(i);
    		if(trainning.getTrainning().equals(Trainning)) {
    			int num = -1; 
    			while(num != 4) {
    				System.out.println("**Trainning Info Edit Menu**");
    				System.out.println("1. Edit Trainning");
    				System.out.println("2. Edit Reps");
	    			System.out.println("3. Edit Sets");
	    			System.out.println("4. Exit");
	    			System.out.println("5. Select ont number between 1-5");
	    			num = input.nextInt();
	    			if(num == 1){
	    				System.out.print("Trainnig : ");
	    				Trainning= input.nextLine();
	    				trainning.setTrainning(Trainning);			
	    			}
	    			else if(num == 2) {
	    				System.out.print("Reps : ");
	    				int Reps = input.nextInt();	
	    				trainning.setReps(Reps);
	    			}
	    			else if(num == 3){
	    				System.out.print("Sets : ");
	    				int Sets = input.nextInt();
	    				trainning.setSets(Sets);
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


