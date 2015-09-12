package stats;

public class StatsModificator {

	private static final int INITIAL_STAT_MODIFICATOR = 0;

	private int dexterityModificator = INITIAL_STAT_MODIFICATOR;
	private int intelligenceModificator = INITIAL_STAT_MODIFICATOR;
	private int wisdomModificator = INITIAL_STAT_MODIFICATOR;
	private int charismaModificator = INITIAL_STAT_MODIFICATOR;
	private int strenghtModficator = INITIAL_STAT_MODIFICATOR;

	public int getDexterityModificator() {
		return this.dexterityModificator;
	}

	public void setDexterityModificator(final int dexterityModificator) {
		this.dexterityModificator = dexterityModificator;
	}

	public int getIntelligenceModificator() {
		return this.intelligenceModificator;
	}

	public void setIntelligenceModificator(final int intelligenceModificator) {
		this.intelligenceModificator = intelligenceModificator;
	}

	public int getWisdomModificator() {
		return this.wisdomModificator;
	}

	public void setWisdomModificator(final int wisdomModificator) {
		this.wisdomModificator = wisdomModificator;
	}

	public int getCharismaModificator() {
		return this.charismaModificator;
	}

	public void setCharismaModificator(final int charismaModificator) {
		this.charismaModificator = charismaModificator;
	}

	public int getStrenghtModficator() {
		return this.strenghtModficator;
	}

	public void setStrenghtModficator(final int strenghtModficator) {
		this.strenghtModficator = strenghtModficator;
	}
}
