package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class TrainningAdder extends JFrame{
	
	public TrainningAdder() {
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
		panel.add(labelSets);
		panel.add(fieldSets);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6 ,6 ,6,6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
		
	}

}
