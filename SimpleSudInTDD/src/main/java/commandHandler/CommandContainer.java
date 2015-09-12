package commandHandler;

import java.util.Map;

import moveCommands.WayCommand;

import com.google.common.collect.Maps;
import commands.CreateNewPlayerCommand;
import commands.ExitCommand;
import commands.LoadCommand;
import commands.LookCommand;
import commands.NameCommand;
import commands.SaveCommand;
import commands.ScoreCommand;

/**
 *
 * @author Sewq
 *
 *         Container for all game commands
 */
public class CommandContainer {

	private static Map<String, Command> commands = Maps.newHashMap();

	/**
	 * Sets the initial state of all available commands in game
	 */
	public static void init() {
		commands.put("exit", new ExitCommand());
		commands.put("new", new CreateNewPlayerCommand());
		commands.put("save", new SaveCommand());
		commands.put("load", new LoadCommand());
		commands.put("name", new NameCommand());
		commands.put("score", new ScoreCommand());
		commands.put("look", new LookCommand());
		commands.put("n", new WayCommand());
		commands.put("s", new WayCommand());
		commands.put("w", new WayCommand());
		commands.put("e", new WayCommand());
	}

	/**
	 * method responsible for returning map which contains game commands
	 *
	 * @return commands
	 */
	public static Map<String, Command> getCommands() {
		return commands;
	}
}