package StartArea;

import java.util.Map;

import Area.Area;
import Area.AreaProvider;
import Area.Room;
import Area.RoomImpl;

import com.google.common.collect.Maps;

public class StartArea implements Area {

	private final int areaIndex;
	private final Map<Integer, Room> roomsInAreaMap = Maps.newHashMap();

	public StartArea() {
		this.areaIndex = 1;
		AreaProvider.areas.put(this.areaIndex, this);
		this.addRoomsToArea();
	}

	public int getArea() {
		return this.areaIndex;
	}

	@Override
	public Room getRoom(final int room) {
		return this.roomsInAreaMap.get(room);
	}

	public void addRoomsToArea() {
		final Room room1 = new RoomImpl("StartRoom", "Woods", 1, "n", 2);

		final Room room2 = new RoomImpl("northRoom", "smth", 2, "s", 1);
		room2.setExits("e", 3);

		final Room room3 = new RoomImpl("gowno", "smtrh", 3, "w", 2);

		this.roomsInAreaMap.put(room1.getRoomIndex(), room1);
		this.roomsInAreaMap.put(room2.getRoomIndex(), room2);
		this.roomsInAreaMap.put(room3.getRoomIndex(), room3);
	}
}
