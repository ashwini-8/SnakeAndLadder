package com.workshop.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	// UC1 snake and ladder game played with single player at position 0

	static final int STARTPOSITION = 0;
	static final int PLAYER = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake And Ladder Game");
		System.out.println(rollingDice());
	}

	// UC2 rolling a dice
	static int rollingDice() {
		Random rand = new Random();
		int diceNum = rand.nextInt(6) + 1;
		return diceNum;
	}
}