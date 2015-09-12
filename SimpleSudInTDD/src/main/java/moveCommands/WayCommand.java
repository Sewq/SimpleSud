package moveCommands;

import playerHandler.PlayerHandler;
import playerHandler.PlayerProvider;
import Area.Area;
import Area.AreaProvider;
import Area.Room;

import commandHandler.Command;

public class WayCommand implements Command {

	@Override
	public void execute(final String[] commandArguments) {

		final PlayerHandler player = PlayerProvider.getPlayerInstance();
		final Area area = AreaProvider.areas.get(player.getAreaIndex());
		final Room room = area.getRoom(player.getRoomIndex());

		if (isNorthWayAvailable(commandArguments, room)) {
			player.setRoomIndex(room.getExit(commandArguments[0]));
		} else {
			System.out.println("You can't go this way!");
		}

	}

	private boolean isNorthWayAvailable(final String[] commandArguments,
			final Room room) {
		return room.getAvailableWaysToGo().containsKey(commandArguments[0]);
	}

}
