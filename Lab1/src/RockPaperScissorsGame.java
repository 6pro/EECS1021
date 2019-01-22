import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/* 
		 1- Prompt the names of two players.
         2- For each round, prompt what each player plays (R for rock, P for paper, and S for scissors) and determine
            which player wins the round. At most 3 runs will be played.
         3- Your program must announce the game winner (i.e., the player who wins more rounds), as soon as it can be
            determined. It is also possible that a game is a tie, when both players win the same number of round(s).
		 * 
		 */
		

		int player1Score = 0, player2Score = 0;
		
		System.out.println("Enter the name of player 1:");
		String player1 = input.nextLine();
		System.out.println("Enter the name of player 2:");
		String player2 = input.nextLine(); 
//ROUND 1	 
		System.out.println("============");
		System.out.println("Round 1:");
		System.out.println("============");
		
		System.out.println("What does " + player1 + " play?: (R, P, or S)");
		String Player1Turn = input.nextLine();
		System.out.println("What does " + player2 + " play?: (R, P, or S)");
		String Player2Turn = input.nextLine();
		if (Player1Turn.equals("R") && Player2Turn.equals("S")) {
			player1Score += 1;
		} else if  (Player1Turn.equals("P") && Player2Turn.equals("R")) {
			player1Score += 1;
		} else if  (Player1Turn.equals("S") && Player2Turn.equals("P")) {
			player1Score += 1;
		} else if (Player2Turn.equals("R") && Player1Turn.equals("S")) {
			player2Score += 1;
		} else if  (Player2Turn.equals("P") && Player1Turn.equals("R")) {
			player2Score += 1;
		} else if  (Player2Turn.equals("S") && Player1Turn.equals("P")) {
			player2Score += 1;
		}
//ROUND 2
        System.out.println("============");
		System.out.println("Round 2:");
		System.out.println("============");
		
		System.out.println("What does " + player1 + " play?: (R, P, or S)");
		Player1Turn = input.nextLine();
		System.out.println("What does " + player2 + " play?: (R, P, or S)");
		Player2Turn = input.nextLine();
		if (Player1Turn.equals("R") && Player2Turn.equals("S")) {
			player1Score += 1;
		} else if  (Player1Turn.equals("P") && Player2Turn.equals("R")) {
			player1Score += 1;
		} else if  (Player1Turn.equals("S") && Player2Turn.equals("P")) {
			player1Score += 1;
		} else if (Player2Turn.equals("R") && Player1Turn.equals("S")) {
			player2Score += 1;
		} else if  (Player2Turn.equals("P") && Player1Turn.equals("R")) {
			player2Score += 1;
		} else if  (Player2Turn.equals("S") && Player1Turn.equals("P")) {
			player2Score += 1;
		}
//ROUND 3		
		if (player1Score == player2Score) {
			System.out.println("============");
			System.out.println("Round 3:");
			System.out.println("============");
			System.out.println("What does " + player1 + " play?: (R, P, or S)");
			Player1Turn = input.nextLine();
			System.out.println("What does " + player2 + " play?: (R, P, or S)");
			Player2Turn = input.nextLine();
			if (Player1Turn.equals("R") && Player2Turn.equals("S")) {
				player1Score += 1;
			} else if  (Player1Turn.equals("P") && Player2Turn.equals("R")) {
				player1Score += 1;
			} else if  (Player1Turn.equals("S") && Player2Turn.equals("P")) {
				player1Score += 1;
			} else if (Player2Turn.equals("R") && Player1Turn.equals("S")) {
				player2Score += 1;
			} else if  (Player2Turn.equals("P") && Player1Turn.equals("R")) {
				player2Score += 1;
			} else if  (Player2Turn.equals("S") && Player1Turn.equals("P")) {
				player2Score += 1;
			}
		}
		if (player1Score == player2Score) {
				System.out.println("Game Over: a tie between " + player1 + " and " + player2 );}
		else if (player1Score > player2Score){
			System.out.println("Game Over: " + player1 + " wins!");
		} 
		else if (player2Score > player1Score){
			System.out.println("Game Over: " + player2 + " wins!");}
		
		
		
		
		input.close();
	}
}