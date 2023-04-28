package LuchaLegend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import LuchaLegend.QuestionList.Node;

public class AnswerListener implements ActionListener{
	private JButton chosenAns;
	private Node crrent;
	private QuestionPage page;
	private Luchador[] luchadores;
	
	public AnswerListener(JButton chosenAns, QuestionPage page, Luchador[] luchadores) {
		this.chosenAns = chosenAns;
		this.crrent = page.current;
		this.page = page;
		this.luchadores = luchadores;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		crrent.getQuestion().choose(chosenAns.getText());
		crrent = crrent.getNext();
		if(crrent.getNext() == null) {
			Luchador lucha = luchadores[0];
			for(int i = 0; i< luchadores.length; i++) {
				if(luchadores[i].getCount() > lucha.getCount()) {
					lucha = luchadores[i];
				}
			}
			LuchadorPage luchaPage = new LuchadorPage(lucha);
			luchaPage.updateContent();
		}else {
			page.current = crrent.getNext();
			page.updateContent();
		}
		
		
		
	}

}
