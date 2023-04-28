package LuchaLegend;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class Page {
	JFrame frame = new JFrame();
	JPanel banner = new JPanel();
	JPanel content = new JPanel();
	Font header = new Font(Font.SANS_SERIF, Font.BOLD, 14);
	Font body = new Font(Font.SANS_SERIF, Font.PLAIN, 11);
	Font bodyBold = new Font(Font.SANS_SERIF, Font.BOLD, 11);
	Font bodyItalic = new Font(Font.SANS_SERIF, Font.ITALIC, 11);
	
	
	public Page() {
		
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
