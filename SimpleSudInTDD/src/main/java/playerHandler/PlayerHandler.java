package playerHandler;

import profession.ProfessionHandler;
import profession.Specialisation;
import stats.ActualStats;

/**
 * Class handles all the player data
 *
 * @author Sewq
 *
 */
public class PlayerHandler {

	private final String name;
	private final String sex;
	private int roomIndex;
	private int areaIndex;
	private Specialisation spec;
	private final ActualStats actualStats;

	/**
	 * Creates a player
	 *
	 * @param name
	 *            player name
	 * @param sex
	 *            player sex
	 * @param prof
	 *            player profession
	 */
	public PlayerHandler(final String name, final String sex, final String prof) {
		this.name = name;
		this.sex = sex;
		this.roomIndex = 1;
		this.areaIndex = 1;
		this.setSpec(prof);
		this.actualStats = new ActualStats(this.spec.getBaseStats());
	}

	public Specialisation getSpec() {
		return this.spec;
	}

	public int getRoomIndex() {
		return this.roomIndex;
	}

	public int getAreaIndex() {
		return this.areaIndex;
	}

	public String getName() {
		return this.name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setRoomIndex(final int roomIndex) {
		this.roomIndex = roomIndex;
	}

	public void setAreaIndex(final int areaIndex) {
		this.areaIndex = areaIndex;
	}

	public void setSpec(final String prof) {
		this.spec = ProfessionHandler.getProfesion().get(prof.toLowerCase());
		this.spec.drawStats();
	}

	public ActualStats getActualStats() {
		return this.actualStats;
	}
}
