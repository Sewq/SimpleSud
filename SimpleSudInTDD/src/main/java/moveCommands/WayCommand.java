package moveCommands;

import playerHandler.PlayerHandler;
import playerHandler.PlayerProvider;
import Area.Area;
import Area.AreaProvider;
import Area.Room;

import commandHandler.Command;

public class WayCommand implements Command {

	private static final int COMMAND = 0;

	@Override
	public void execute(final String[] commandArguments) {

		final PlayerHandler player = PlayerProvider.getPlayerInstance();
		final Area area = AreaProvider.getAreas().get(player.getAreaIndex());
		final Room room = area.getRoom(player.getRoomIndex());
		final String argument = commandArguments[COMMAND];

		if (isDirectionAvailable(argument, room)) {
			player.setRoomIndex(room.getRoomIndexComparingToExit(argument));
		} else {
			System.out.println("You can't go this way!");
		}

	}

	private boolean isDirectionAvailable(final String argument, final Room room) {
		return room.getAvailableWaysToGo().containsKey(argument);
	}

}
