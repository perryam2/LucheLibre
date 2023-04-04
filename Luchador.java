package LuchaLegend;

public class Luchador {
	private String name;
	private String realName;
	private String life;//"Birth month, day, year - Death month, day, year"
	private String[] ringYears; //[debut year, retire year]
	private int[] body;//[height in cm, weight in kg]
	private int[] matchRecord;//[total matches, number of wins, number of losses, number of draws]
	private String style; 
	private String[] roles;//ex:[Singles Wrestler, Tag Team Wrestler]
	private String[] moves;
	private String bio;
	private int count = 0;
	
	public Luchador(String name, String realName, String life, String[] ringYears,int[] body, 
			int[] matchRecord, String style, String[] roles, String[] moves, String bio) {
		this.name = name;
		this.realName = realName;
		this.life = life;
		this.ringYears = ringYears;
		this.body = body;
		this.matchRecord = matchRecord;
		this.style = style;
		this.roles = roles;
		this.moves = moves;
		this.bio = bio;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRealName() {
		return this.realName;
	}
	
	public String getLife() {
		return this.life;
	}
	
	public String[] getRingYears() {
		return this.ringYears;
	}
	
	public int[] getbody() {
		return this.body;
	}
	
	public int[] matchRecord() {
		return this.matchRecord;
	}
	
	public String getStyle() {
		return this.style;
	}
	
	public String[] getRoles() {
		return this.roles;
	}
	
	public String[] getMoves() {
		return this.moves;
	}
	
	public String getBio() {
		return this.bio;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void addToCount() {
		this.count = count + 1;
	}
	
}
