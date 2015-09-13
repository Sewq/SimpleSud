package Area;

import java.util.Map;

/**
 * Interface responsible for handling all room actions
 *
 * @author Sewq
 *
 */
public interface Room {

	/**
	 *
	 * @return room name
	 */
	String getRoomName();

	/**
	 * Method for setting the room exits and links
	 *
	 * @param way
	 *            the way player can go
	 * @param roomIndex
	 *            room index
	 */
	void setExit(final String way, final int roomIndex);

	/**
	 *
	 * @return room index
	 */
	int getRoomIndex();

	/**
	 * Prints the whole room description
	 */
	void showRoomDescription();

	/**
	 * returns room index for given way
	 *
	 * @param way
	 *            way which exit belongs
	 * @return room index
	 */
	int getRoomIndexComparingToExit(final String way);

	/**
	 *
	 * @return map with available exits for actual room
	 */
	Map<String, Integer> getAvailableWaysToGo();

	/**
	 *
	 * @return room terrain
	 */
	String getTerrain();
}
