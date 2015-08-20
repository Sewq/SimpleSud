package mainGame;

import java.util.Scanner;

public class GameLoop {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String gameCommand = input.nextLine();

		while (!gameCommand.equals("exit")) {
			gameCommand = input.nextLine();

		}
	}
}
