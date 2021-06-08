package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.TrainningViewer;
import gui.WindowFrame;
import manager.TrainningManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		
		this.frame = frame;
	}

	
	public void actionPerformed(ActionEvent e) {
		TrainningViewer viewer = frame.getTrainningviewer();
		TrainningManager TrainningManager = getObject("trainningmanager.ser");
		viewer.setTrainningManager(TrainningManager);
		frame.getContentPane().removeAll();
		frame.getContentPane().add(viewer);
		frame.revalidate();
		frame.repaint();

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

}
