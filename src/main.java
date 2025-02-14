import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("Welcome to the Number Guessing Game!\r\n"
				+ "I'm thinking of a number between 1 and 100.\r\n"
				+ "You have 5 chances to guess the correct number.");
		System.out.println("\r\n");
		System.out.println("Please select the difficulty level:\r\n"
				+ "1. Easy (10 chances)\r\n"
				+ "2. Medium (5 chances)\r\n"
				+ "3. Hard (3 chances)");
		System.out.println("Enter your choice: ");
		
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		int chances = 10;
		switch(level) {
		case 1 : chances = 10; break;
		case 2 : chances = 5; break;
		case 3 : chances = 3; break;
		}
		int min = 1,max = 100;
		int answerNumber = (min + (int)(Math.random() * ((max - min) + 1)));
		System.out.println(answerNumber);
		int attempts = 0;
		boolean isWin = false;
		while(attempts < chances ) {
			System.out.println("\r\n");
			System.out.println("Enter your guess: ");
			int guessNumber = sc.nextInt();
			attempts++;
			if(guessNumber > answerNumber) {
				System.out.println("Incorrect! The number is less than " + guessNumber + ".");
			}else if(guessNumber < answerNumber) {
				System.out.println("Incorrect! The number is more than " + guessNumber + ".");
			}else {
				isWin = true;
				break;
			}
		}
		
		if(isWin) {
			System.out.println("Congratulations! You guessed the correct number in "+ attempts +" attempts.");
		}else {
			System.out.println("You are not lucky! You guessed  in "+ attempts +" attempts. out of your chances!");
		}
	}

}
