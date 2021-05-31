package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.Eventlogger;

public class MenuManager {
	static Eventlogger logger = new Eventlogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		TrainningManager TrainningManager = getObject("trainningmanager.ser");
		if(TrainningManager == null) {
			TrainningManager = new TrainningManager(input);
		}
		
		
		
		WindowFrame frame = new WindowFrame(TrainningManager);
		selectMenu(input, TrainningManager);
		putObject(TrainningManager, "trainningmanager.ser");
	}
	
	public static void selectMenu(Scanner input,TrainningManager TrainningManager ) {
		int num = 0;	
		while ( num != 5){
			try {
				showMenu();
		        num = input.nextInt();  
		        switch(num) {
		        case 1:
		        	TrainningManager.AddTrainning();
		        	logger.log("add a Trainning");
		        	break;
		        case 2:
		        	TrainningManager.DeleteTrainning();
		        	logger.log("Delete a Trainning");
		        	break;
		        case 3:
		        	TrainningManager.EditTrainning();
		        	logger.log("Edit a Trainning");
		        	break;
		        case 4:
		        	TrainningManager.ViewTrainning();
		        	logger.log("View a list of Trainning");
		        	break;
		        default:
		        	continue;
		        }
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1-5");
				if(input.hasNext()) {
					input.next();
				}
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("1. Add Trainning Program");
	    System.out.println("2. Delete Trainning Program");
	    System.out.println("3. Edit Trainning Program");
        System.out.println("4. View Trainning Program");
        System.out.println("5. Exit");
        System.out.print("Select one number between 1-5 : ");
	}
	
	public static TrainningManager getObject(String filename) {
		TrainningManager TrainningManager = null;
		
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			TrainningManager = (TrainningManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return TrainningManager;
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return TrainningManager;
		
	}
	
	public static void putObject(TrainningManager TrainningManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(TrainningManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 	
		
	}
	
}

