package commands;

import commandHandler.CommandAbstractImpl;

public class ScoreCommand extends CommandAbstractImpl {

	@Override
	public void execute(final String[] command) {
		System.out.println("Fuck you ! No Score available !");
	}
}
