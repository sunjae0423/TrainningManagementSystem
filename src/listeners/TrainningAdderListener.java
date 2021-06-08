package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Trainning.ChestTrainning;
import Trainning.TrainningKind;
import Trainning.Trainninginput;
import exception.WeightFormatException;
import manager.TrainningManager;

public class TrainningAdderListener implements ActionListener {
	JTextField fieldTrainning;
	JTextField fieldweight;
	JTextField fieldReps;
	JTextField fieldSets;
	
	TrainningManager TrainningManager;
	
	public TrainningAdderListener(
			JTextField fieldTrainning, 
			JTextField fieldweight, 
			JTextField fieldReps,
			JTextField fieldSets,
			TrainningManager TrainningManager) {	
		this.fieldTrainning = fieldTrainning;
		this.fieldweight = fieldweight;
		this.fieldReps = fieldReps;
		this.fieldSets = fieldSets;
		this.TrainningManager = TrainningManager;
	}

	public void actionPerformed(ActionEvent e) {	
		Trainninginput trainning = new ChestTrainning(TrainningKind.Chest);
		
		
		try {
			trainning.setTrainning(fieldTrainning.getText());
			trainning.setWeight(Integer.parseInt(fieldweight.getText()));
			trainning.setReps(Integer.parseInt(fieldReps.getText()));
			trainning.setSets(Integer.parseInt(fieldSets.getText()));
			TrainningManager.AddTrainning(trainning);
			putObject(TrainningManager, "trainningmanager.ser");
			trainning.printInfo();
		} catch (NumberFormatException | WeightFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
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
 