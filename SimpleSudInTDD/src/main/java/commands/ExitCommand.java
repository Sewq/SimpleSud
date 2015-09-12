package commands;

import java.util.Scanner;

import commandHandler.CommandAbstractImpl;

/**
 * Command responsible for exit and save the game
 *
 */
public class ExitCommand extends CommandAbstractImpl {
	private static final String YES_ANSWER = "Y";

	@Override
	public void execute(final String[] commandArguments) {
		System.out.println("Do you really want to save and exit the game? Y/N");
		final Scanner input = new Scanner(System.in);
		if (this.shouldGameBeClosed(input)) {
			this.saveCharacterState(commandArguments);
			this.saveAndExit();
			input.close();
			return;
		}
		input.close();
	}

	private boolean shouldGameBeClosed(final Scanner input) {
		if (YES_ANSWER.equalsIgnoreCase(input.nextLine())) {
			return true;
		} else {
			System.out.println("Enjoy the game!");
			return false;
		}
	}

	private void saveAndExit() {
		System.out.println("Bye!");
		System.exit(0);
	}

	private void saveCharacterState(final String[] commandArguments) {
		final SaveCommand saveCommand = new SaveCommand();
		saveCommand.execute(commandArguments);
	}
}
