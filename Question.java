package LuchaLegend;


import java.util.HashMap;
import java.util.Set;

public class Question {
	private String question;
	private HashMap<String,Luchador> answers;
	
	public Question(String question, HashMap<String,Luchador> answers) {
		this.question = question;
		this.answers = answers;
	}
	
	public String getQuestion(){
		return this.question;
	}
	
	public String[] getAnswers(){
		Set<String> set =this.answers.keySet();
		return (String[]) set.toArray();
	}
	
	public void choose(String chosenAnswer) {
		Luchador luchador = this.answers.get(chosenAnswer);
		luchador.addToCount();
	}
	
}
