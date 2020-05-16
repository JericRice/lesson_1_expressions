// Code Blocks And The If Then Else Control Statements


package lesson_one;

public class Lesson3 {
	
	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
//		if (score < 5000 && score > 1000) {
//			System.out.println("Your score was okay at " + score + " points");
//		} else if (score < 1000) {
//			System.out.println("Did not reach high enough score. Your score was " + score);
//		} else {
//			System.out.println("Success");
//		}
		
		if (gameOver) {
			int finalScore = score +(levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
		/*
		 * you can reuse variable names in scope as long as you don't redefine them but, this destroys the original 
		 * This is not an elegant solution. Duplication is too error prone in complex systems. 
		 */
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if (gameOver) {
			int finalScore = score +(levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
	}

}
