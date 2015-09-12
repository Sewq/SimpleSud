package commands;

import java.io.IOException;

import com.google.common.base.Strings;
import commandHandler.CommandAbstractImpl;

import fileHandler.FileLoader;

/**
 *
 * @author Sewq
 *
 */
public class LoadCommand extends CommandAbstractImpl {
	public final static int FIRST_COMMAND_ARGUMENT = 1;

	private int loadCounter = 0;

	/**
	 * Loads player state from file
	 *
	 */
	@Override
	public void execute(final String[] commandArguments) {
		try {
			final String fileName = commandArguments[FIRST_COMMAND_ARGUMENT];
			if (!Strings.isNullOrEmpty(fileName) && this.loadCounter == 0) {
				this.processLoading(fileName);
			} else {
				this.printErrorMessage();
			}
		} catch (final ArrayIndexOutOfBoundsException e) {
			System.out.println("This command needs an argument !");
		}
	}

	private void printErrorMessage() {
		if (this.loadCounter > 0) {
			System.out.println("You can load a game only at the beginning");
		} else {
			System.out.println("No such player save.");
		}
	}

	private void processLoading(final String fileName) {
		try {
			this.loadFile(fileName);
			this.loadCounter++;
			System.out.println("File loaded succesfull");
		} catch (final IOException e) {
			System.out.println("No such player save.");
		}
	}

	private void loadFile(final String fileName) throws IOException {
		final FileLoader fileLoader = new FileLoader();
		fileLoader.loadFile(fileName);
	}
}
