package javaBasics;

import java.util.Scanner;
import java.util.Random;

public class WhackAMole {
	int score;
	int molesLeft;
	int attemptsLeft;
	char[][] moleGrid;

	WhackAMole(int numAttempts, int gridDimension) {
		this.attemptsLeft = numAttempts;
		this.moleGrid = new char[gridDimension][gridDimension];
		for (int i = 0; i < gridDimension; i++)
			for (int j = 0; j < gridDimension; j++) {
				this.moleGrid[i][j] = '*';
			}
	}

	boolean place(int x, int y) {
		return false;
	}

	void whack(int x, int y) {
	}

	void printGridToUser() {
	}

	void printGrid() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhackAMole wm = new WhackAMole(50, 10);
		int x, y;
		Scanner sc = new Scanner(System.in);

		while (wm.attemptsLeft > 0) {
			System.out.println("Enter X coordinate");
			x = sc.nextInt();
			System.out.println("Enter Y coordinate");
			y = sc.nextInt();
			if (x == -1 || y == -1)
				return;
			else {

			}
		}

	}

}
