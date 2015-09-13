package Area;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * Provides an container for all the areas
 *
 * @author Sewq
 *
 */
public class AreaProvider {

	private static Map<Integer, Area> areas = Maps.newHashMap();

	public static Map<Integer, Area> getAreas() {
		return areas;
	}

	public static void setPlayerInstance(final Map<Integer, Area> areas) {
		AreaProvider.areas = areas;
	}
}
