package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.TrainningViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TrainningViewer viewer = frame.getTrainningviewer();
		frame.setupPanel(viewer);

	}

}
