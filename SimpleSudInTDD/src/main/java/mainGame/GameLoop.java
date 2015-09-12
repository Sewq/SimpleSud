package mainGame;

import gameMenu.GameMenu;

import java.util.Scanner;

import setup.Setup;

import commandHandler.CommandExecutorHandler;

/**
 * Class provides the main game loop
 *
 * @author Sewq
 *
 */
public class GameLoop {

	public static void main(final String args[]) {

		setup();
		Scanner input = null;

		try {
			input = new Scanner(System.in);
			final CommandExecutorHandler commandsContainerHandler = new CommandExecutorHandler();
			GameMenu.showMenu();

			while (true) {
				final String[] gameCommand = input.nextLine().split(" ");
				commandsContainerHandler
						.provideInfoForCommandExecute(gameCommand);
			}
		} finally {
			input.close();
		}
	}

	private static void setup() {
		final Setup gameSetup = new Setup();
		gameSetup.setupGame();
	}
}
