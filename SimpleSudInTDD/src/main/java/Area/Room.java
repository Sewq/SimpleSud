package Area;

import java.util.Map;

public interface Room {

	String getRoomName();

	void setExits(final String way, final int roomIndex);

	int getRoomIndex();

	void show();

	int getExit(final String exit);

	Map<String, Integer> getAvailableWaysToGo();

	String getTerrain();
}
