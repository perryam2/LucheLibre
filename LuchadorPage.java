package LuchaLegend;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

public class LuchadorPage extends Page {
	JPanel content;
	Font headerText;
	Font bodyText;
	Font bodyBold;
	Font bodyItalic;
	JLabel name = new JLabel();
	JLabel realName = new JLabel();
	JLabel lifeTime = new JLabel();
	JLabel debut = new JLabel();
	JLabel retire = new JLabel();
	JLabel height = new JLabel();
	JLabel weight = new JLabel();
	JLabel matches = new JLabel();
	JLabel wins = new JLabel();
	JLabel losses = new JLabel();
	JLabel draws = new JLabel();
	JLabel style = new JLabel();
	JLabel roles = new JLabel();
	JLabel moves = new JLabel();
	JTextArea bio = new JTextArea();
	
	public LuchadorPage(Luchador luchador) {
		this.content = super.content;
		this.headerText = super.header;
		this.bodyText = super.body;
		this.bodyBold = super.bodyBold;
		this.bodyItalic = super.bodyItalic;
		
		this.name.setText(luchador.getName()); this.name.setFont(headerText);
		this.realName.setText(luchador.getRealName()); this.realName.setFont(bodyBold);
		this.lifeTime.setText(luchador.getLife()); this.lifeTime.setFont(bodyItalic);
		this.debut.setText("Debuted: "+Integer.toString(luchador.getRingYears()[0])); this.debut.setFont(bodyText);
		if(luchador.getRingYears()[1] == 0) {
			this.retire.setText("Currently Active");
		}else {
			this.retire.setText("Retired: "+Integer.toString(luchador.getRingYears()[1]));
		} this.retire.setFont(bodyText);
		this.height.setText("Height: "+Integer.toString(luchador.getbody()[0])+"cm");
		this.weight.setText("Weight: "+Integer.toString(luchador.getbody()[1])+"kg");
		this.matches.setText("Total Fights: "+Integer.toString(luchador.getMatches()[0]));
		this.wins.setText("wins: "+Integer.toString(luchador.getMatches()[0]));
		this.losses.setText("losses: "+Integer.toString(luchador.getMatches()[1]));
		this.draws.setText("draws: "+Integer.toString(luchador.getMatches()[2]));
		this.style.setText("Wrestling Style: "+luchador.getStyle());
		this.roles.setText(null);
		this.moves.setText(null);
		this.bio.setText(luchador.getBio());
		this.bio.setLineWrap(true);
		this.bio.setWrapStyleWord(true);
		this.bio.setEditable(false);
	}

	@Override
	public void updateContent() {
		this.content.setLayout(new GridLayout(5,2));
		this.content.add(name);
		this.content.add(realName);
		this.content.add(lifeTime);
		this.content.add(debut);
		this.content.add(retire);
		this.content.add(height);
		this.content.add(weight);
		this.content.add(matches);
		this.content.add(wins);
		this.content.add(losses);
		this.content.add(draws);
		this.content.add(style);
		//this.content.add(bio);
		
	}

}
