package LuchaLegend;

import javax.swing.JFrame;

public class test_file_2 {
	
	public static int[] luchoYears = {2023, 0};
	public static int[] luchoBody = {20, 20};
	public static int[] luchoMatches = {0, 0, 0};
	public static String[] luchoRoles = {"dancer"};
	public static String[] luchoMoves = {"dance", "jive"};
	public static Luchador lucho = new Luchador("Lucho Juan", "Juan Dos", "April 17, 2023 - Present Day",
				luchoYears, luchoBody, luchoMatches, "Stylish!", luchoRoles, luchoMoves, 
				"Lucho Juan is not really a luchador. He's a tiny dancer. Lucho Juan is just a placeholder for "
				+ "the real luchadores that will be used in the final product. Lorem ipsum dolor sit amet, "
				+ "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna "
				+ "aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip "
				+ "ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "
				+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt "
				+ "in culpa qui officia deserunt mollit anim id est laborum.");
	public static void main(String[] args) {
		LuchadorPage luchoPage = new LuchadorPage(lucho);
		luchoPage.updatePage();
		luchoPage.frame.pack();
		luchoPage.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		luchoPage.frame.setVisible(true);
	}
}
