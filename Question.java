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
	
	public String getQuestionText(){
		return this.question;
	}
	
	public String[] getAnswers(){
		Set<String> set =this.answers.keySet();
		String[] arrayOfString = new String[set.size()];
		int index = 0;
		for (String str : set)
			arrayOfString[index++] = str;
		return arrayOfString;
	}
	
	public void choose(String chosenAnswer) {
		this.answers.get(chosenAnswer).addToCount();
	}
	
}
