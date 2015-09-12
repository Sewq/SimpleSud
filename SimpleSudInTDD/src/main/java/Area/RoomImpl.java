package Area;

import java.util.Map;
import java.util.Objects;

import com.google.common.collect.Maps;

public class RoomImpl implements Room {

	public static final String ANSI_RED = "\u001B[31m";
	private String roomName;
	private int roomIndex;
	private String terrain;

	private final Map<String, Integer> exit = Maps.newHashMap();

	public RoomImpl(final String name, final String terrain,
			final int roomIndex, final String way, final int roomIndexx) {
		this.roomName = name;
		this.terrain = terrain;
		this.roomIndex = roomIndex;
		this.setExits(way, roomIndexx);
	}

	@Override
	public void setExits(final String way, final int roomIndex) {
		this.exit.put(way, roomIndex);
	}

	@Override
	public int getExit(final String exit) {
		return this.exit.get(exit);
	}

	@Override
	public Map<String, Integer> getAvailableWaysToGo() {
		return this.exit;
	}

	@Override
	public String getRoomName() {
		return this.roomName;
	}

	public void setRoomName(final String roomName) {
		this.roomName = roomName;
	}

	@Override
	public int getRoomIndex() {
		return this.roomIndex;
	}

	public void setRoomIndex(final int roomIndex) {
		this.roomIndex = roomIndex;
	}

	@Override
	public String getTerrain() {
		return this.terrain;
	}

	public void setTerrain(final String terrain) {
		this.terrain = terrain;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.roomName, this.roomIndex);
	}

	@Override
	public void show() {
		System.out.println("Nice room nr " + this.roomIndex
				+ " with a beautyful name " + this.roomName + "\n\n\n");
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof Room) {
			final RoomImpl other = (RoomImpl) obj;
			return Objects.equals(this.roomName, other.roomName)
					&& this.roomIndex == other.roomIndex;
		} else {
			return false;
		}
	}

}
