package commands;

public class ExitCommand implements Command {
	
	public String commandName = "exit";

	public void execute() {
		System.exit(0);
	}

}
