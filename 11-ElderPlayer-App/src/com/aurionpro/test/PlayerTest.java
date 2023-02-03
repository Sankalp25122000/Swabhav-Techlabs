package com.aurionpro.test;

import com.aurionpro.model.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player players[] = new Player[4];
		players[0] = new Player("Sankalp", 34, "India");
		players[1] = new Player("Tejas", 47, "India");
		players[2] = new Player("Sameer", 25, "England");
		players[3] = new Player("Amogh", 45, "Pakistan");

		for (Player x : players) {
			System.out.println(x);
		}
		Player elderPlayer = Player.getElderPlayer(players);
		System.out.println();
		printPlayer(elderPlayer);

	}

	private static void printPlayer(Player elderPlayer) {
		System.out.print("Eldest Player is "+elderPlayer);
		

	}

}
