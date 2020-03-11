package com.dairefagan;

public class Main {

  public static void main(String[] args) {

    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    // Now utilising the value returned by the method:

    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your final score was " + highScore);

    score = 10_000;
    levelCompleted = 8;
    bonus = 200;

    highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your final score was " + highScore);

    // Challenge:

    System.out.println("Score position is " + calculateHighScorePosition(1000) + ".");

    int position = calculateHighScorePosition(1500);
    displayHighScorePosition("Dáire", position);

    position = calculateHighScorePosition(900);
    displayHighScorePosition("Alice", position);

    position = calculateHighScorePosition(400);
    displayHighScorePosition("Bob", position);

    position = calculateHighScorePosition(50);
    displayHighScorePosition("Eve", position);

  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 2000;
      return finalScore;
    }

    return -1;
  }

  // Challenge:

  public static void displayHighScorePosition(String name, int position) {

    System.out
        .println(name + " managed to get into position " + position + " on the high score table.");
  }

  public static int calculateHighScorePosition(int score) {

    if (score >= 1000) {
      return 1;
    } else if (score >= 500 && score < 1000) {
      return 2;
    } else if (score >= 100 && score < 500) {
      return 3;
    } else {
      return 4;
    }
  }

}