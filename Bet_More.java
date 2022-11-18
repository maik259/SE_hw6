package task2;

import java.util.Scanner;

public class Bet_More {

	public static int shuffle() {							//i did not write a class for this mechanism, as it would be kinda overkill
		return (int) Math.floor(Math.random() * 100);		 
	}

	public static String declareWinner(Player a, Player b) throws InterruptedException {	//compares value of held card and declares winner
		System.out.println("Your card: " + b.getHeldCard());
		Thread.sleep(1000);
		System.out.println("Computer's card: " + a.getHeldCard());
		return a.getHeldCard() > b.getHeldCard() ? "The computer wins!" : "You win!";
	}

	public static void main(String[] args) throws InterruptedException {
		final Player computer = new Player(shuffle());
		Player player_2 = new Player(0);
		int revCount = 5;
		Scanner s = new Scanner(System.in);

		while (revCount > 0) {
			player_2.setHeldCard(shuffle());
			System.out.println("Your card: " + player_2.getHeldCard());
			Thread.sleep(1500);
			System.out.println("Do you want to draw a new Card?\nYou can draw " + revCount + " more time(s).\n[y/n]");
			String answer = s.next();
			revCount--;
			Thread.sleep(1000);
			
			if (revCount == 0 && answer.equals("y")) {				//break condition 1: no more draws left
				player_2.setHeldCard(shuffle());
				break;
			}
			if (!answer.equals("y")) {								//break condition 2: user does not want to draw new card
				break;
			}
		}
		System.out.println(declareWinner(computer, player_2));

	}
}
