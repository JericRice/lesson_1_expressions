// Methods In Java

package lesson_two;

public class Methods {
	
	public static void main(String[] args) {
		
		calculateScore(true, 800, 5, 100); // uses method defined variables (arguments)
		
		calculateScore(true, 10000, 8, 200); 
		
		calculateScore(false, 10000, 8, 200); 

		

	} 
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { // defined variables
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000; // can change this and 
			System.out.println("You final score was " + finalScore);
			return finalScore;
		}
		
		return -1;
	}
}
