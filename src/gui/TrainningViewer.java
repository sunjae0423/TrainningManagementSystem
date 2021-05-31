package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Trainning.Trainninginput;
import manager.TrainningManager;

public class TrainningViewer extends JPanel{
	
	WindowFrame frame;
	
	TrainningManager TrainningManager;
	
	public TrainningViewer(WindowFrame frame, TrainningManager TrainningManager) {
		
		this.frame = frame;
		this.TrainningManager = TrainningManager;
		
		System.out.println("***" + TrainningManager.size()+"***");
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Trainning");
		model.addColumn("Weight");
		model.addColumn("Reps");
		model.addColumn("Sets");
		
		for(int i = 0; i<TrainningManager.size(); i++) {
			Vector row = new Vector();
			Trainninginput ti = TrainningManager.get(i);
			row.add(ti.getTrainning());
			row.add(ti.getWeight());
			row.add(ti.getReps());
			row.add(ti.getSets());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
