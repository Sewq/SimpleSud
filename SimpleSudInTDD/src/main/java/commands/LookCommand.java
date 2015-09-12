package commands;

import playerHandler.PlayerHandler;
import playerHandler.PlayerProvider;
import Area.Area;
import Area.AreaProvider;

import commandHandler.Command;

public class LookCommand implements Command {

	@Override
	public void execute(final String[] commandArguments) {
		if (PlayerProvider.getPlayerInstance() == null) {
			System.out.println("huh?");
		} else {
			final PlayerHandler player = PlayerProvider.getPlayerInstance();
			final Area area = AreaProvider.areas.get(player.getAreaIndex());
			area.getRoom(player.getRoomIndex()).show();
		}
	}

}
