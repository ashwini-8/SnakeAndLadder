package com.workshop.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	// UC1 snake and ladder game played with single player at position 0
	static final int STARTPOSITION = 0;
	static final int PLAYER = 1;
	static Random random = new Random();

	public static void main(String[] args) {
		System.out.println("Welcome to Snake And Ladder Game");
		int diceNum = rollingDice();
		System.out.println(diceNum);
		checkPosition(diceNum);
	}

	// UC2 rolling a dice
	static int rollingDice() {
		int diceNum = random.nextInt(6) + 1;
		return diceNum;
	}

	// UC3 action no play,ladder,snake
	static void checkPosition(int diceNum) {
		int action = random.nextInt(3);
		System.out.println(action);
		int currentPosition = 0;

		switch (action) {
		case 0:
			currentPosition = currentPosition;
			System.out.println(currentPosition);
			break;
		case 1:
			currentPosition = currentPosition + diceNum;
			System.out.println(currentPosition);
			break;
		case 2:
			if (currentPosition == 0) {
				currentPosition = currentPosition;
			} else {
				currentPosition = currentPosition - diceNum;
			}
			System.out.println(currentPosition);
			break;

		}
	}
}