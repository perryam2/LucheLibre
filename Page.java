package LuchaLegend;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Page {
	JFrame frame = new JFrame();
	JPanel banner = new JPanel();
	JPanel content = new JPanel();
	Font header = new Font(Font.SANS_SERIF, Font.BOLD, 14);
	Font body = new Font(Font.SANS_SERIF, Font.PLAIN, 11);
	Font bodyBold = new Font(Font.SANS_SERIF, Font.BOLD, 11);
	Font bodyItalic = new Font(Font.SANS_SERIF, Font.ITALIC, 11);
	
	JButton quizButton = new JButton("Take the Quiz");
	
	JButton maskButton = new JButton("Make A Mask");
	JLabel info = new JLabel("APP INFORMATION/INSTRUCTION");

	public class quizButListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			content.removeAll();
		}
	}
	
	public class maskButListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			content.removeAll();
		}
	}
	
	public Page() {
//		banner.add(quizButton);
//		this.quizButton.addActionListener(new quizButListener());
//		banner.add(maskButton);
//		this.maskButton.addActionListener(new maskButListener());
		
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
	
	public void updatePage() {
		frame.add(banner, BorderLayout.NORTH);
		this.updateContent();
		frame.add(content, BorderLayout.CENTER);
		frame.repaint();
	}
	
	public abstract void updateContent();
}
