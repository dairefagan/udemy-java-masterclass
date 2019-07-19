package com.dairefagan;

public class Main {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		// Method calls using existing variables:
		
		calculateScore(gameOver, score, levelCompleted, bonus);
		
		score = 10_000;
		levelCompleted = 8;
		bonus = 200;
		
		calculateScore(gameOver, score, levelCompleted, bonus);
		
		// Method calls using values:
		
		calculateScore(true, 800, 5, 100);
	
		calculateScore(true, 10_000, 8, 200);
		
	}
	
	// Method returning int (although unused in main), void if no value to be returned:
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
	
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("Your final score was " + finalScore);
			return finalScore;
		}
		
		// Must still return something if gameOver is false:
		
		return -1;
	}

}
