package LuchaLegend;

import java.util.HashMap;

import javax.swing.JFrame;

public class PageViewer {
	public static void main(String[] args) {
		int[] elSantoYears = {1934, 1982};
		int[] elSantoBody = {175, 95};
		int[] elSantoMatches = {640, 491, 143, 6};
		String[] elSantoRoles = {"Singles Wrestler", "Tag Team Wrestler"};
		String[] elSantoMoves = {""};
		Luchador elSanto = new Luchador("El Santo", "Rodolfo Guzman Huerta", "September 23, 1917 - February 5, 1984",
				elSantoYears, elSantoBody, elSantoMatches, "Technical", elSantoRoles, elSantoMoves, "INFORMATION");
		
		int[] blueYears = {1948, 1989};
		int[] blueBody = {169, 77};
		int[] blueMatches = {401, 279, 115, 7};
		String[] blueRoles = {"Singles Wrestler", "Tag Team Wrestler"};
		String[] blueMoves = {""};
		Luchador blueDemon = new Luchador("Blue Demon", "Alejandro Munoz Moreno", "April 24, 1922 - December 16, 2000",
				blueYears, blueBody, blueMatches, "Technical", blueRoles, blueMoves, "INFORMATION");
		
		int[] milMascYears = {1963, 2019};
		int[] milMascBody = {180, 105};
		int[] milMascMatches = {1608, 1294, 222, 92};
		String[] milMascRoles = {"Singles Wrestler", "Tag Team Wrestler"};
		String[] milMascMoves = {""};
		Luchador milMasc = new Luchador("Mil Mascaras", "Aaron Rodriguez Arellano", "July 15, 1942 - Present Day",
				milMascYears, milMascBody, milMascMatches, "Technical", milMascRoles, milMascMoves, "INFORMATION");
		
		int[] hijoYears = {1982, 0};
		int[] hijoBody = {169, 82};
		int[] hijoMatches = {1051, 757, 271, 23};
		String[] hijoRoles = {"Singles Wrestler", "Tag Team Wrestler", "Promoter"};
		String[] hijoMoves = {""};
		Luchador elHijo = new Luchador("El Hijo de Santo", "Jorge Ernesto Guzman Rodriguez", "August 2, 1963 - Present Day", 
				hijoYears, hijoBody, hijoMatches, "Technical", hijoRoles, hijoMoves, "INFORMATION");
		
		int[] reyYears = {1989, 0};
		int[] reyBody = {162, 74};
		int[] reyMatches = {2264, 1543, 655, 66};
		String[] reyRoles = {"Singles Wrestler", "Tag Team Wrestler"};
		String[] reyMoves = {""};
		Luchador reyMyst = new Luchador("Rey Mysterio Jr.", "Oscar Gutierrez", "December 11, 1974 - Present Day", 
				reyYears, reyBody, reyMatches, "Highflyer", reyRoles, reyMoves, "INFORMATION");
		
		int[] fishYears = {1969, 2000};
		int[] fishBody = {175, 96};
		int[] fishMatches = {761, 304, 418, 39};
		String[] fishRoles = {"Singles Wrestler", "Tag Team Wrestler"};
		String[] fishMoves = {""};
		Luchador fishman = new Luchador("Fishman", "Jose Angel Najera Sanchez", "October 6, 1951 - August 4, 2017", 
				fishYears, fishBody, fishMatches, "Technical", fishRoles, fishMoves, "INFORMATION");
		
		int[] misticoYears = {1998, 0};
		int[] misticoBody = {170, 79};
		int[] misticoMatches = {2154, 1550, 589, 15};
		String[] misticoRoles = {""};
		String[] misticoMoves = {""};
		Luchador mistico = new Luchador("Mistico", "Luis Ignacio Urive Alvirde", "December 22, 1982 - Present Day", 
				misticoYears, misticoBody, misticoMatches, "Highflyer", misticoRoles, misticoMoves, "INFORMATION");
		
		int[] pentaYears = {2008,0};
		int[] pentaBody = {180, 91};
		int[] pentaMatches = {1064, 549, 498, 17};
		String[] pentaRoles = {"Singles Wrestler", "Tag Team Wrestler"};
		String[] pentaMoves = {""};
		Luchador penta = new Luchador("Penta El Zero Miedo", "Unknown", "February 26, 1985 - Present Day", 
				pentaYears, pentaBody, pentaMatches, "Allrounder", pentaRoles, pentaMoves, "INFORMATION");
		
		int[] fenixYears = {2005,0};
		int[] fenixBody = {177,75};
		int[] fenixMatches = {922, 555, 355, 12};
		String[] fenixRoles = {"Singles Wrestler", "Tag Team Wrestler"};
		String[] fenixMoves = {""};
		Luchador fenix = new Luchador("Rey Fenix", "INFORMATION", "December 30, 1990 - Present Day", 
				fenixYears, fenixBody, fenixMatches, "HighFlyer", fenixRoles, fenixMoves, "INFORMATION");
		
		int[] tinieYears = {1971,2019};
		int[] tinieBody = {186,115};
		int[] tinieMatches = {247, 177, 63, 7};
		String[] tinieRoles = {"Singles Wrestler", "Tag Team Wrestler"};
		String[] tinieMoves = {"El Abrazo del Oso", "Plancha", "Backbreaker"};
		Luchador tinie = new Luchador("Tinieblas", "Manuel Leal", "December 30, 1990 - Present Day", 
				tinieYears, tinieBody, tinieMatches, "INFORMATION", tinieRoles, tinieMoves, "INFORMATION");
		
		Luchador[] luchadores = {elSanto, blueDemon, milMasc, elHijo, reyMyst, fishman, mistico, penta, fenix, tinie};
		
		HashMap<String, Luchador> a1 = new HashMap<String,Luchador>();
			a1.put("High-Flying", luchadores[4]);//reyMyst
			a1.put("High-Flying", luchadores[6]);//mistico
			a1.put("High-Flying", luchadores[8]);//fenix
			a1.put("Technical", luchadores[3]);//elhijo
			a1.put("PowerHouse", luchadores[2]);//milmasc
			a1.put("Allrounder", luchadores[7]);//penta
		Question q1 = new Question("Which of these wrestling styles do you prefer?", a1);

		HashMap<String, Luchador> a2 = new HashMap<String, Luchador>();
			a2.put("Remain calm and collected.", luchadores[0]);//elsanto
			a2.put("Take risks to gain an advantage.", luchadores[1]);//bluedemon
			a2.put("Take risks to gain an advantage.", luchadores[4]);//reymyst
			a2.put("Use strategy to outsmart your opponent.", luchadores[3]);//elhijo
			a2.put("Use strategy to outsmart your opponent.", luchadores[5]);//fish
			a2.put("Embrace the chaos.", luchadores[8]);//fenix
		Question q2 = new Question("How would you handle pressure in the ring?", a2);

		HashMap<String, Luchador> a3 = new HashMap<String, Luchador>();
			a3.put("Classic silver and blue", luchadores[6]);//mistico
			a3.put("Elaborate and Ornate", luchadores[9]);//tinie
			a3.put("Elaborate and ornate", luchadores[5]);//fish
			a3.put("Minimalistic and sleek", luchadores[1]);//blue
			a3.put("Bold and intimidating", luchadores[7]);//penta
		Question q3 = new Question("Which type of mask do you like the most?", a3);

		HashMap<String, Luchador> a4 = new HashMap<String, Luchador>();
			a4.put("Stay focused and play by the rules.", luchadores[0]);//elsanto
			a4.put("Use quick thinking to counter their cheating tactics.", luchadores[2]);//milmasc
			a4.put("Outsmart them with your expirence and cunning.", luchadores[9]);//tinie
			a4.put("Make them pay with a powerful move.", luchadores[7]);//penta
		Question q4 = new Question("How would you deal with a cheating opponent?", a4);

		HashMap<String, Luchador> a5 = new HashMap<String, Luchador>();
			a5.put("Colorful and flashy", luchadores[8]);//fenix
			a5.put("Elaborate with accessories.", luchadores[9]);//tinie
			a5.put("Sleek and modern", luchadores[6]);//mistico
			a5.put("Traditional with one main color", luchadores[1]);//blue
		Question q5 = new Question("What is your preferred wrestiling attire?", a5);

		HashMap<String, Luchador> a6 = new HashMap<String, Luchador>();
			a6.put("Moonsault", luchadores[4]);//reymyst
			a6.put("Camel Clutch", luchadores[4]);//elhijo
			a6.put("Powerbomb", luchadores[2]);//milmasc
			a6.put("Canadian Destroyer", luchadores[7]);//penta
		Question q6 = new Question("Which wrestling move do you find the most impressive?", a6);

		HashMap<String, Luchador> a7 = new HashMap<String, Luchador>();
			a7.put("Classic instrumental", luchadores[0]);//elsanto
			a7.put("Lively rock", luchadores[5]);//fish
			a7.put("Heavy Metal", luchadores[7]);//penta
			a7.put("Traditional mariachi", luchadores[1]);//blue
			a7.put("Traditional mariachi", luchadores[9]);//tinie
			a7.put("Traditional mariachi", luchadores[6]);//mistico
		Question q7 = new Question("What would be your entrance music?", a7);

		HashMap<String, Luchador> a8 = new HashMap<String, Luchador>();
			a8.put("Use speed and agility to your advantage.", luchadores[4]);//reymyst
			a8.put("Focus on their weaknesses and use technique.", luchadores[3]);//elhijo
			a8.put("Intimitate them with confidence.", luchadores[8]);//fenix
			a8.put("Show off your strength and power", luchadores[2]);//milmasc
		Question q8 = new Question("How would you react when faced with a much larger opponent?", a8);

		HashMap<String, Luchador> a9 = new HashMap<String, Luchador>();
			a9.put("Top Rope Hurricanrana", luchadores[4]);//reymyst
			a9.put("Cross Armbar", luchadores[3]);//elhijo
			a9.put("Tombstone Piledriver", luchadores[1]);//blue
			a9.put("Package PileDriver", luchadores[5]);//fish
		Question q9 = new Question("Which wrestling move do you think is the most dangerous?", a9);

		HashMap<String, Luchador> a10 = new HashMap<String, Luchador>();
			a10.put("Red", luchadores[2]);//milmasc
			a10.put("Red", luchadores[5]);//fish
			a10.put("Silver", luchadores[0]);//elsanto
			a10.put("Green", luchadores[9]);//tinie
			a10.put("Green", luchadores[8]);//fenix
			a10.put("Black", luchadores[6]);//mistico
		Question q10 = new Question("What is your favorite color?", a10);
		
		QuestionList questionList = new QuestionList();
		questionList.add(q10);
		questionList.add(q9);
		questionList.add(q8);
		questionList.add(q7);
		questionList.add(q6);
		questionList.add(q5);
		questionList.add(q4);
		questionList.add(q3);
		questionList.add(q2);
		questionList.add(q1);
	
		QuestionPage questionPage = new QuestionPage(questionList, luchadores);
		
		questionPage.updatePage();
		questionPage.frame.pack();
		questionPage.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		questionPage.frame.setVisible(true);
		while(true) {
		if(!questionPage.frame.isVisible()) {
			Luchador lucha = luchadores[0];
			for(int i = 0; i< luchadores.length; i++) {
				if(luchadores[i].getCount() > lucha.getCount()) {
					lucha = luchadores[i];
				}
			}
			LuchadorPage luchaPage = new LuchadorPage(lucha);
			luchaPage.updatePage();
			luchaPage.frame.pack();
			luchaPage.frame.pack();
			luchaPage.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			luchaPage.frame.setVisible(true);
			break;
		}
		}
	}
}
