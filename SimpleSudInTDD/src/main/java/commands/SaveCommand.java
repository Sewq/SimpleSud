package commands;

import java.io.IOException;

import playerHandler.PlayerProvider;
import playerHandler.PlayerHandler;

import commandHandler.CommandAbstractImpl;

import fileHandler.FileSaver;

/**
 * Class responsible for handling saveCommand
 *
 * @author Sewq
 *
 */

public class SaveCommand extends CommandAbstractImpl {

	@Override
	public void execute(final String commandName[]) {
		final PlayerHandler player = PlayerProvider.getPlayerInstance();

		if (player != null) {
			try {
				this.saveToFile(player);
				System.out.println("File saved!");
			} catch (final IOException e) {
				System.out.println("Can't write to file");
			}
		} else {
			System.out.println("Create a player first!");
		}
	}

	private void saveToFile(final PlayerHandler player) throws IOException {
		final FileSaver fileSaver = new FileSaver();
		fileSaver.saveToFile(player);
	}
}
