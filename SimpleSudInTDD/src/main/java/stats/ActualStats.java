package stats;

public class ActualStats {

	private int intelligence;
	private int wisdom;
	private int charisma;

	private final BaseStats baseStats;

	private StatsModificator statsModificator = new StatsModificator();

	public ActualStats(final BaseStats baseStats) {
		this.baseStats = baseStats;
	}

	public StatsModificator getStatsModificator() {
		return this.statsModificator;
	}

	public void setStatsModificator(final StatsModificator statsModificator) {
		this.statsModificator = statsModificator;
	}

	public Integer getStrenght() {
		return this.baseStats.getStrenght()
				+ this.statsModificator.getStrenghtModficator();
	}

	public int getDexterity() {
		return this.baseStats.getDexterity()
				+ this.statsModificator.getDexterityModificator();
	}

	public int getIntelligence() {
		return this.intelligence;
	}

	public void setIntelligence(final int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWisdom() {
		return this.wisdom;
	}

	public void setWisdom(final int wisdom) {
		this.wisdom = wisdom;
	}

	public int getCharisma() {
		return this.charisma;
	}

	public void setCharisma(final int charisma) {
		this.charisma = charisma;
	}

	public BaseStats getBaseStats() {
		return this.baseStats;
	}
}
