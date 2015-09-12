package gameMenu;

import java.util.Map;

import commandHandler.Command;
import commandHandler.CommandContainer;

/**
 * Class is responsible for showint the initial game menu
 *
 * @author Sewq
 *
 */
public class GameMenu {

	/**
	 * Prints game menu
	 *
	 */
	public static void showMenu() {
		System.out.println("To create your hero type 'new'");
		System.out
				.println("To load your previous game type 'load <hero hame>'");
		System.out.println("Available commands: ");
		final Map<String, Command> commands = CommandContainer.getCommands();

		for (final String command : commands.keySet()) {
			System.out.print(command + ", ");
		}
	}
}
