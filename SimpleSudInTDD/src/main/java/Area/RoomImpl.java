package Area;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.collect.Maps;

@XmlRootElement
public class RoomImpl implements Room {

	private String roomName;
	private int roomIndex;
	private String terrain;
	private final HashMap<String, Integer> exit = Maps.newHashMap();

	public RoomImpl() {

	}

	public RoomImpl(final String name, final String terrain, final int roomIndex) {
		this.roomName = name;
		this.terrain = terrain;
	}

	@Override
	public void setExit(final String way, final int roomIndex) {
		this.exit.put(way, roomIndex);
	}

	@Override
	public int getRoomIndexComparingToExit(final String exit) {
		return this.exit.get(exit);
	}

	@XmlElement
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

	@XmlElement
	public void setTerrain(final String terrain) {
		this.terrain = terrain;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.roomName, this.roomIndex);
	}

	@Override
	public void showRoomDescription() {
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
