package LuchaLegend;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuestionPage extends Page {
	JPanel content;
	JLabel questiontext = new JLabel();
	String[] answers;
	JButton ans1 = new JButton();
	JButton ans2 = new JButton();
	JButton ans3 = new JButton();
	JButton ans4 = new JButton();
	
	public QuestionPage(Question question) {
		this.content = super.content;
		this.answers = question.getAnswers();
		this.questiontext.setText(question.getQuestion());
		this.ans1.setText(answers[0]);
		this.ans2.setText(answers[1]);
		this.ans3.setText(answers[2]);
		this.ans4.setText(answers[3]);
	}


	@Override
	public void updateContent() {
		content.removeAll();
		content.add(questiontext, BorderLayout.PAGE_START);
		content.add(ans1);
		content.add(ans2);
		content.add(ans3);
		content.add(ans4);
		content.repaint();
		
		
	}
}
