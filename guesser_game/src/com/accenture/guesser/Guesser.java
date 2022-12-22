package com.accenture.guesser;

import java.util.Random;

//import java.util.Scanner;

public class Guesser {
	int gnum; 
	
	public int guessNum() {
//		System.out.println("Guesser, kindly guess a number");
//		Scanner scan = new Scanner(System.in);
//		gnum = scan.nextInt();
//		gnum = (int) (Math.random()*11);
		Random rand = new Random();
		gnum = rand.nextInt(1,11);
		return gnum; 
	}
}
