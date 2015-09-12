package commandHandler;

/**
 *
 * @author Sewq
 *
 *         Interface for handling game commands
 */
public interface Command {

	/**
	 *
	 * @param commandArgument
	 *            command argument
	 */
	void execute(String[] commandArguments);
}
