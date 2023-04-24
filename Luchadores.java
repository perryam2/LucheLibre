package LuchaLegend;

import java.util.ArrayList;

public class Luchadores {
	ArrayList<Luchador> luchadores = new ArrayList<Luchador>(10);
	
	int[] elSantoYears = {1934, 1982};
	int[] elSantoBody = {175, 95};
	int[] elSantoMatches = {640, 491, 143, 6};
	String[] elSantoRoles = {"Singles Wrestler", "Tag Team Wrestler"};
	String[] elSantoMoves = {""};
	Luchador elSanto = new Luchador("El Santo", "Rodolfo Guzman Huerta", "September 23, 1917 - February 5, 1984",
			elSantoYears, elSantoBody, elSantoMatches, null, elSantoRoles, elSantoMoves, null);
	
	int[] blueYears = {1948, 1989};
	int[] blueBody = {169, 77};
	int[] blueMatches = {401, 279, 115, 7};
	String[] blueRoles = {"Singles Wrestler", "Tag Team Wrestler"};
	String[] blueMoves = {""};
	Luchador blueDemon = new Luchador("Blue Demon", "Alejandro Munoz Moreno", "April 24, 1922 - December 16, 2000",
			blueYears, blueBody, blueMatches, null, blueRoles, blueMoves, null);
	
	int[] milMascYears = {1963, 2019};
	int[] milMascBody = {180, 105};
	int[] milMascMatches = {1608, 1294, 222, 92};
	String[] milMascRoles = {"Singles Wrestler", "Tag Team Wrestler"};
	String[] milMascMoves = {""};
	Luchador milMasc = new Luchador("Mil Mascaras", "Aaron Rodriguez Arellano", "July 15, 1942 - Present Day",
			milMascYears, milMascBody, milMascMatches, null, milMascRoles, milMascMoves, null);
	
	int[] hijoYears = {1982, 0};
	int[] hijoBody = {169, 82};
	int[] hijoMatches = {1051, 757, 271, 23};
	String[] hijoRoles = {"Singles Wrestler", "Tag Team Wrestler", "Promoter"};
	String[] hijoMoves = {""};
	Luchador elHijo = new Luchador("El Hijo de Santo", "Jorge Ernesto Guzman Rodriguez", "August 2, 1963 - Present Day", 
			hijoYears, hijoBody, hijoMatches, null, hijoRoles, hijoMoves, null);
	
	int[] reyYears = {1989, 0};
	int[] reyBody = {162, 74};
	int[] reyMatches = {2264, 1543, 655, 66};
	String[] reyRoles = {"Singles Wrestler", "Tag Team Wrestler"};
	String[] reyMoves = {""};
	Luchador reyMyst = new Luchador("Rey Mysterio Jr.", "Oscar Gutierrez", "December 11, 1974 - Present Day", 
			reyYears, reyBody, reyMatches, null, reyRoles, reyMoves, null);
	
	int[] fishYears = {1969, 2000};
	int[] fishBody = {175, 96};
	int[] fishMatches = {761, 304, 418, 39};
	String[] fishRoles = {"Singles Wrestler", "Tag Team Wrestler"};
	String[] fishMoves = {""};
	Luchador fishman = new Luchador("Fishman", "Jose Angel Najera Sanchez", "October 6, 1951 - August 4, 2017", 
			fishYears, fishBody, fishMatches, null, fishRoles, fishMoves, null);
	
	int[] misticoYears = {1998, 0};
	int[] misticoBody = {170, 79};
	int[] misticoMatches = {2154, 1550, 589, 15};
	String[] misticoRoles = {""};
	String[] misticoMoves = {""};
	Luchador mistico = new Luchador("Mistico", "Luis Ignacio Urive Alvirde", "December 22, 1982 - Present Day", 
			misticoYears, misticoBody, misticoMatches, null, misticoRoles, misticoMoves, null);
	
	int[] pentaYears = {0,0};
	int[] pentaBody = {0,0};
	int[] pentaMatches = {0,0,0,0};
	String[] pentaRoles = {""};
	String[] pentaMoves = {""};
	Luchador penta = new Luchador("Penta El Zero Miedo", "Unknown", "February 26, 1985 - Present Day", 
			pentaYears, pentaBody, pentaMatches, null, pentaRoles, pentaMoves, null);
	
	int[] tinieYears = {0,0};
	int[] tinieBody = {0,0};
	int[] tinieMatches = {0,0,0,0};
	String[] tinieRoles = {""};
	String[] tinieMoves = {""};
	Luchador tinie = new Luchador("Rey Fenix", null, "December 30, 1990 - Present Day", 
			tinieYears, tinieBody, tinieMatches, null, tinieRoles, tinieMoves, null);
	
	public Luchadores(){
		luchadores.add(elSanto);
		luchadores.add(blueDemon);
		luchadores.add(milMasc);
		luchadores.add(elHijo);
		luchadores.add(reyMyst);
		luchadores.add(fishman);
		luchadores.add(mistico);
		luchadores.add(penta);
		luchadores.add(tinie);
	}
	
	public ArrayList<Luchador> getLuchadores(){
		return luchadores;
	}
	
}
