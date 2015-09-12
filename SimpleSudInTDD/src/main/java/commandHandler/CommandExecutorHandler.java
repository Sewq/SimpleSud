package commandHandler;

import java.util.Map;

import com.google.common.base.Strings;

public class CommandExecutorHandler {

	public static final int COMMAND_NAME = 0;

	Map<String, Command> commands = CommandContainer.getCommands();

	/**
	 * Method is responsible for providing info for the command to be executed
	 *
	 * @param command
	 *            array which contains commandName and command arguments
	 */
	public void provideInfoForCommandExecute(final String[] command) {
		try {
			final String commandName = command[COMMAND_NAME].toLowerCase();

			if (command.length > 0 && this.isArgumentPresent(commandName)) {
				this.commands.get(commandName).execute(command);
			} else {
				this.missingCommandMessage();
			}
		} catch (final ArrayIndexOutOfBoundsException e) {
			this.missingCommandMessage();
		}
	}

	private boolean isArgumentPresent(final String gameCommand) {
		return !Strings.isNullOrEmpty(gameCommand)
				&& this.commands.containsKey(gameCommand);
	}

	private void missingCommandMessage() {
		System.out.println("Huh?");
	}
}
