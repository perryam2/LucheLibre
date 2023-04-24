package LuchaLegend;

import java.util.ArrayList;
import java.util.HashMap;

public class Questions {
	ArrayList<Question> questions = new ArrayList<Question>();
	
	HashMap<String, Luchador> a1 = new HashMap<String,Luchador>();
		//TODO: add answers
	Question q1 = new Question("Which of these wrestling styles do you prefer?", a1);
	
	HashMap<String, Luchador> a2 = new HashMap<String, Luchador>();
		//TODO: add answers
	Question q2 = new Question("How would you handle presure in the ring?", a2);
	
	HashMap<String, Luchador> a3 = new HashMap<String, Luchador>();
		//TODO: add answers
	Question q3 = new Question("Which type of mask do you like the most?", a3);
	
	HashMap<String, Luchador> a4 = new HashMap<String, Luchador>();
		//TODO: add answers
	Question q4 = new Question("How would you deal with a cheating opponent?", a4);
	
	HashMap<String, Luchador> a5 = new HashMap<String, Luchador>();
		//TODO: add answers
	Question q5 = new Question("What is your preferred wrestiling attire?", a5);
	
	HashMap<String, Luchador> a6 = new HashMap<String, Luchador>();
		//TODO: add answers
	Question q6 = new Question("Which wrestling move do you find the most impressive?", a6);
	
	HashMap<String, Luchador> a7 = new HashMap<String, Luchador>();
		//TODO: add answers
	Question q7 = new Question("What would be your entrance music?", a7);
	
	HashMap<String, Luchador> a8 = new HashMap<String, Luchador>();
		//TODO: add answers
	Question q8 = new Question("How would you react when faced with a much larger opponent?", a8);
	
	HashMap<String, Luchador> a9 = new HashMap<String, Luchador>();
		//TODO: add answers
	Question q9 = new Question("Which wrestling move do you think is the most dangerous?", a9);
	
	HashMap<String, Luchador> a10 = new HashMap<String, Luchador>();
		//TODO: add answers
	Question q10 = new Question("What is your favorite color?", a10);
	
	public Questions() {
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);
		questions.add(q5);
		questions.add(q6);
		questions.add(q7);
		questions.add(q8);
		questions.add(q9);
		questions.add(q10);
	}
	
	public ArrayList<Question> getQuestions(){
		return questions;
	}
}
