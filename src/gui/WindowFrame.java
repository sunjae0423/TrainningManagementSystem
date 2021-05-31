package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.TrainningManager;

public class WindowFrame extends JFrame{
	
	TrainningManager TrainningManager;
	
	MenuSelection menuselection;
	TrainningAdder trainningadder;
	TrainningViewer trainningviewer;
	

	public WindowFrame(TrainningManager TrainningManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.TrainningManager = TrainningManager;
		menuselection = new MenuSelection(this);
		trainningadder = new TrainningAdder(this, this.TrainningManager);
		trainningviewer = new TrainningViewer(this, this.TrainningManager);
		
		
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public TrainningAdder getTrainningadder() {
		return trainningadder;
	}

	public void setTrainningadder(TrainningAdder trainningadder) {
		this.trainningadder = trainningadder;
	}

	public TrainningViewer getTrainningviewer() {
		return trainningviewer;
	}

	public void setTrainningviewer(TrainningViewer trainningviewer) {
		this.trainningviewer = trainningviewer;
	}

}
