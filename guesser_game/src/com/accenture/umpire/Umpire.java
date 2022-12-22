package com.accenture.umpire;

import com.accenture.guesser.Guesser;
import com.accenture.player.Player;

public class Umpire {
	int numFromGuesser; 
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum(); 
	}
	
	public void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
	}
	
	public void compare() {
		System.out.println("Number guessed by the guesser: " + numFromGuesser);
		if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
			System.out.println("Player 1, Player 2, Player 3 are the winners");
		 } else if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and Player 2 are the winners");
			} else if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer3) {
				System.out.println("Player 1 and Player 3 are the winners");
			} else if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and Player 3 are the winners");
			} else if (numFromGuesser == numFromPlayer1) {
				System.out.println("Player 1 has won the game");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player 2 has won the game");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 3 has won the game");
			} else {
				System.out.println("Game lost. Try again");
			}
	}
}
