package commandHandler;

/**
 *
 * @author Sewq
 *
 *         Implementation of Command interface
 */
public class CommandAbstractImpl implements Command {

	/**
	 * default action for non-existing command with argument
	 *
	 */
	@Override
	public void execute(final String[] command) {
		System.out.println("Huh?");
	}

}
