package com.aurionpro.test;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		char[][] gameBoard = { { '_', '|', '_', '|', '_' }, { '_', '|', '_', '|', '_' }, { ' ', '|', ' ', '|', ' ' }

		};
		printBoard(gameBoard);
		boolean gameOver = false;
		while (!gameOver) {
			player1Move(gameBoard);
			gameOver = isGameOver(gameBoard);
			if (gameOver) {
				break;
			}

			player2Move(gameBoard);
			gameOver = isGameOver(gameBoard);
			if (gameOver) {
				break;
			}
		}

	}

	public static void printBoard(char[][] gameboard) {
		for (char[] row : gameboard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public static void updateBoard(int position, int player, char[][] gameBoard) {
		char character;

		if (player == 1) {
			character = 'X';

		} else {
			character = 'O';
		}

		switch (position) {
		case 1:
			gameBoard[0][0] = character;
			printBoard(gameBoard);
			break;
		case 2:
			gameBoard[0][2] = character;
			printBoard(gameBoard);
			break;
		case 3:
			gameBoard[0][4] = character;
			printBoard(gameBoard);
			break;
		case 4:
			gameBoard[1][0] = character;
			printBoard(gameBoard);
			break;
		case 5:
			gameBoard[1][2] = character;
			printBoard(gameBoard);
			break;
		case 6:
			gameBoard[1][4] = character;
			printBoard(gameBoard);
			break;
		case 7:
			gameBoard[2][0] = character;
			printBoard(gameBoard);
			break;
		case 8:
			gameBoard[2][2] = character;
			printBoard(gameBoard);
			break;
		case 9:
			gameBoard[2][4] = character;
			printBoard(gameBoard);
			break;
		default:
			break;
		}
	}

	public static void player1Move(char[][] gameBoard) {
		System.out.println("Player 'X' enter your move [1-9] : ");
		Scanner input = new Scanner(System.in);

		int move = input.nextInt();
		boolean result = isValidMove(move, gameBoard);
		while (!result) {
			System.out.println("Sorry! Invalid Move. Try again...");
			move = input.nextInt();
			result = isValidMove(move, gameBoard);
		}
		System.out.println("Player moved at postion " + move);
		updateBoard(move, 1, gameBoard);
	}

	public static void player2Move(char[][] gameBoard) {
		System.out.println("Player 'O' enter your move [1-9] : ");
		Scanner input = new Scanner(System.in);

		int move = input.nextInt();
		boolean result = isValidMove(move, gameBoard);
		while (!result) {
			System.out.println("Sorry! Invalid Move. Try again");
			move = input.nextInt();
			result = isValidMove(move, gameBoard);
		}
		System.out.println("Player moved at postion " + move);
		updateBoard(move, 2, gameBoard);

	}

	public static boolean isValidMove(int move, char[][] gameBoard) {
		switch (move) {
		case 1:
			if (gameBoard[0][0] == '_') {
				return true;
			} else {
				return false;
			}
		case 2:
			if (gameBoard[0][2] == '_') {
				return true;
			} else {
				return false;
			}
		case 3:
			if (gameBoard[0][4] == '_') {
				return true;
			} else {
				return false;
			}
		case 4:
			if (gameBoard[1][0] == '_') {
				return true;
			} else {
				return false;
			}
		case 5:
			if (gameBoard[1][2] == '_') {
				return true;
			} else {
				return false;
			}
		case 6:
			if (gameBoard[1][4] == '_') {
				return true;
			} else {
				return false;
			}
		case 7:
			if (gameBoard[2][0] == ' ') {
				return true;
			} else {
				return false;
			}
		case 8:
			if (gameBoard[2][2] == ' ') {
				return true;
			} else {
				return false;
			}
		case 9:
			if (gameBoard[2][4] == ' ') {
				return true;
			} else {
				return false;
			}
		default:
			return false;
		}
	}

	public static boolean isGameOver(char[][] gameBoard) {
		// Horizontal
		if (gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') {
			System.out.println("player1 wins");
			return true;
		}
		if (gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') {
			System.out.println("player2 wins");
			return true;
		}
		if (gameBoard[1][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[1][4] == 'X') {
			System.out.println("player1 wins");
			return true;
		}
		if (gameBoard[1][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[1][4] == 'O') {
			System.out.println("player2 wins");
			return true;
		}
		if (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') {
			System.out.println("player1 wins");
			return true;
		}
		if (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') {
			System.out.println("player2 wins");
			return true;
		}
		// Vertical
		if (gameBoard[0][0] == 'X' && gameBoard[1][0] == 'X' && gameBoard[2][0] == 'X') {
			System.out.println("player1 wins");
			return true;
		}
		if (gameBoard[0][0] == 'O' && gameBoard[1][0] == 'O' && gameBoard[2][0] == 'O') {
			System.out.println("player2 wins");
			return true;
		}
		if (gameBoard[0][2] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][2] == 'X') {
			System.out.println("player1 wins");
			return true;
		}
		if (gameBoard[0][2] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][2] == 'O') {
			System.out.println("player2 wins");
			return true;
		}
		if (gameBoard[0][4] == 'X' && gameBoard[1][4] == 'X' && gameBoard[2][4] == 'X') {
			System.out.println("player1 wins");
			return true;
		}
		if (gameBoard[0][4] == 'O' && gameBoard[1][4] == 'O' && gameBoard[2][4] == 'O') {
			System.out.println("player2 wins");
			return true;
		}
		// Diagonals
		if (gameBoard[0][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][4] == 'X') {
			System.out.println("player1 wins");
			return true;
		}
		if (gameBoard[0][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][4] == 'O') {
			System.out.println("player2 wins");
			return true;
		}
		if (gameBoard[2][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[0][4] == 'X') {
			System.out.println("player1 wins");
			return true;
		}
		if (gameBoard[2][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[0][4] == 'O') {
			System.out.println("player2 wins");
			return true;
		}
		if (gameBoard[0][0] != '_' && gameBoard[0][2] != '_' && gameBoard[0][4] != '_' && gameBoard[1][0] != '_'
				&& gameBoard[1][2] != '_' && gameBoard[1][4] != '_' && gameBoard[2][0] != '_' && gameBoard[2][2] != '_'
				&& gameBoard[2][4] != '_') {
			System.out.println("It's a tie");
			return true;
		}
		return false;

	}

}
