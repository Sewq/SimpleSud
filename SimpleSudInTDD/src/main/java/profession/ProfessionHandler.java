package profession;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * Class that provides all available specialisations available for player
 *
 * @author Sewq
 *
 */
public class ProfessionHandler {
	private static final String MAGE = "mage";
	private static final String WARRIOR = "warrior";

	private static Map<String, Specialisation> professionContainer = Maps
			.newHashMap();

	public static Map<String, Specialisation> getProfesion() {
		fillProfessions();
		return professionContainer;
	}

	private static void fillProfessions() {
		professionContainer.put(MAGE, new Mage());
		professionContainer.put(WARRIOR, new Warrior());
	}
}
