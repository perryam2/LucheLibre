//package LuchaLegend;
//
//import java.util.HashMap;
//
///*this file no longer works with the Luchador class because when this testing was being done only the name was
//*implemented in the construction of Luchador. Its purpose was to ensure that the constructors, Question.choose(),
//* Luchador.addToCount(), Luchador.getName and Luchador.getCount() all worked properly. We have moved past this point.
//*/
//public class QuestionAndLuchadorTest {
//	public static void main(String[] args) {
//		
//		//Each of the following constructed a luchador with the given name and a count of 0.
//		Luchador one = new Luchador("One"); 
//		Luchador two = new Luchador("Two");
//		Luchador three = new Luchador("Three");
//		Luchador four = new Luchador("Four");
//		Luchador five = new Luchador("Five");
//		Luchador six = new Luchador("Six");
//		Luchador seven = new Luchador("Seven");
//		Luchador eight = new Luchador("Eight");
//		
//		//The following constructs a question and the components needed for it
//		HashMap<String, Luchador> ans1 = new HashMap<String, Luchador>();
//			ans1.put("first", one);
//			ans1.put("second", two);
//			ans1.put("third", three);
//			ans1.put("fourth", four);
//		Question q1 = new Question("which one?", ans1);
//		q1.choose("second"); //Simulates the user selecting the answer
//		
//		//The following constructs a question and the components needed for it
//		HashMap<String, Luchador> ans2 = new HashMap<String, Luchador>();
//			ans2.put("fifth", five);
//			ans2.put("sixth", six);
//			ans2.put("seventh", seven);
//			ans2.put("eighth", eight);
//		Question q2 = new Question("which one?", ans2);
//		q2.choose("eighth"); //Simulates the user selecting the answer
//		
//		//The following constructs a question and the components needed for it
//		HashMap<String, Luchador> ans3 = new HashMap<String, Luchador>();
//			ans3.put("first", one);
//			ans3.put("second", two);
//			ans3.put("seventh", seven);
//			ans3.put("eighth", eight);
//		Question q3 = new Question("which one?", ans3);
//		q3.choose("eighth"); //Simulates the user selecting the answer
//		
//		//The following takes all of the luchadores and finds which one has the highest count
//		Luchador[] allLucho = {one, two, three, four, five, six, seven, eight};
//		Luchador most = allLucho[1];
//		for(int i = 0; i < allLucho.length; i++) {
//			if(most.getCount() < allLucho[i].getCount()) {
//				most = allLucho[i];
//			}
//		}
//		
//		//prints the name of the Luchador that had the highest count
//		System.out.println(most.getName());
//		
//		
//	}
//}
