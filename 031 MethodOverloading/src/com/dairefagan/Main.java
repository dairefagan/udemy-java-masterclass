package com.dairefagan;

public class Main {

	public static void main(String[] args) {
		
		int newScore = calculateScore("Dáire", 500);
		System.out.println("New score is " + newScore);
		
		calculateScore(75);
		
		calculateScore();
	
		// Challenge:
		
		calcFeetAndInchesToCentimetres(5, 11);
		
		// System.out.println(calcFeetAndInchesToCentimetres(72));
		
		calcFeetAndInchesToCentimetres(-72);
		
	}
	
	public static int calculateScore(String playerName, int score) {
		
		System.out.println("Player " + playerName + " scored " + score + " points." );
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		
		System.out.println("Unnamed player scored " + score + " points." );
		return score * 1000;
	}
	
	public static int calculateScore() {
		
		System.out.println("No player name, no player score.." );
		return 0;
	}
	
	// Challenge:
	
	public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
		
		if ((feet < 0) || ((inches < 0) || (inches > 12))) {
			System.out.println("Invalid feet and/or inches arguments passed.");
			return -1;
			}
		
		double centimetres = ((feet * 12) + inches) * 2.54;
		
		System.out.println(feet + " feet and " + inches + " inches is equivalent to " + centimetres + " centimetres.");
		
		return centimetres;
		
	}
	
	public static double calcFeetAndInchesToCentimetres(double inches) {
			
		if (inches < 0) {
			System.out.println("Invalid inches argument passed.");
			return -1;
			}
		
	
		double feet = (int) inches/12;
		
		inches = (int) inches % 12; 
		
//		Alternatively:
//		
//		inches -= (double) (feet * 12)
		
		return calcFeetAndInchesToCentimetres(feet, inches);
		
	}
	
}
	

	
	
	
	
	
	
	
	
	
	