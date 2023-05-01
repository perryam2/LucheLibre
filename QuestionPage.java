package LuchaLegend;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import LuchaLegend.QuestionList.Node;

public class QuestionPage extends Page {
	public JPanel content;
	public Node current;
	public final Luchador[] luchadores;
	public GridBagLayout gridbag = new GridBagLayout();
	public GridBagConstraints c = new GridBagConstraints();
	public JLabel questiontext = new JLabel();
	public String[] answers;
	public JButton ans1 = new JButton();
	public JButton ans2 = new JButton();
	public JButton ans3 = new JButton();
	public JButton ans4 = new JButton();
	
	public QuestionPage(QuestionList questions, Luchador[] luchadores) {
		this.content = super.content;
		this.luchadores = luchadores;
		this.content.setLayout(gridbag);
		c.fill = GridBagConstraints.HORIZONTAL;
		this.current = questions.head;
		
	}


	@Override
	public void updateContent() {
		this.answers = current.getQuestion().getAnswers();
		this.questiontext.setText(current.getQuestion().getQuestionText());
		this.ans1.setText(answers[0]);
		this.ans1.addActionListener(new AnswerListener(ans1));
		this.ans2.setText(answers[1]);
		this.ans2.addActionListener(new AnswerListener(ans2));
		this.ans3.setText(answers[2]);
		this.ans3.addActionListener(new AnswerListener(ans3));
		this.ans4.setText(answers[3]);
		this.ans4.addActionListener(new AnswerListener(ans4));
		
		content.removeAll();
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		gridbag.setConstraints(questiontext, c);
		content.add(questiontext);
		
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.weightx = 0.5;
		gridbag.setConstraints(ans1, c);
		content.add(ans1);
		
		c.gridx = 1;
		c.gridy = 1;
		gridbag.setConstraints(ans2, c);
		content.add(ans2);
		
		c.gridx = 0;
		c.gridy = 2;
		gridbag.setConstraints(ans3, c);
		content.add(ans3);
		
		c.gridx = 1;
		c.gridy = 2;
		gridbag.setConstraints(ans4, c);
		content.add(ans4);
		
		content.repaint();
	}
	
	public class AnswerListener implements ActionListener{
		public JButton button;
		
		public AnswerListener(JButton chosenAnsBut) {
			button = chosenAnsBut;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			current.getQuestion().choose(button.getText());
			System.out.println("added to count");
			if(current.getNext() == null) {
				getQuestionPage().frame.setVisible(false);
				//return;
			}else {
				current = current.getNext();
				updateContent();
			}
		}
	}
	public QuestionPage getQuestionPage() {
		return this;
	}
	
}
