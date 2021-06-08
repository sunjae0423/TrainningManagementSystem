package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.TrainningAdderCancelListener;
import listeners.TrainningAdderListener;
import manager.TrainningManager;

public class TrainningAdder extends JPanel{
	
	WindowFrame frame;
	
	TrainningManager TrainningManager;
	
	public TrainningAdder(WindowFrame frame,TrainningManager TrainningManager) {
		
		this.frame = frame;
		this.TrainningManager = TrainningManager;
		
		JPanel panel= new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelTrainning = new JLabel("Trainning : ", JLabel.TRAILING);
		JTextField fieldTrainning = new JTextField(10);
		labelTrainning.setLabelFor(fieldTrainning);
		panel.add(labelTrainning);
		panel.add(fieldTrainning);
		
		JLabel labelweight = new JLabel("Weight : ", JLabel.TRAILING);
		JTextField fieldweight = new JTextField(10);
		labelweight.setLabelFor(fieldweight);
		panel.add(labelweight);
		panel.add(fieldweight);
		
		JLabel labelReps = new JLabel("Reps : ", JLabel.TRAILING);
		JTextField fieldReps = new JTextField(10);
		labelweight.setLabelFor(fieldReps);
		panel.add(labelReps);
		panel.add(fieldReps);
		
		JLabel labelSets = new JLabel("Sets : ", JLabel.TRAILING);
		JTextField fieldSets = new JTextField(10);
		labelweight.setLabelFor(fieldSets);
		
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new TrainningAdderListener(fieldTrainning,fieldweight,fieldReps,fieldSets,TrainningManager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new TrainningAdderCancelListener(frame));
		
		panel.add(labelSets);
		panel.add(fieldSets);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6 ,6 ,6,6);
		
		
		this.add(panel);
		this.setVisible(true);
		
	}

}
