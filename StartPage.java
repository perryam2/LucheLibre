package LuchaLegend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPage extends Page{
	public JPanel content;
	
	public StartPage() {
		this.content = super.content;
	}
	
	@Override
	public void updateContent() {
		content.removeAll();
		frame.repaint();
	}
	
	

}
