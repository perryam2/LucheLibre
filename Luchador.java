package LuchaLegend;

public class Luchador {
	private String name;
	private int count = 0;
	
	public Luchador(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void addToCount() {
		this.count = count + 1;
	}
	
}
