package stats;

import java.util.List;

import com.google.common.collect.Lists;

public class BaseStats {

	private int baseStrenght;
	private int baseDexterity;
	private int baseIntelligence;
	private int baseWisdom;
	private int baseCharisma;

	private final List<Integer> stats = Lists.newArrayList();

	public BaseStats(final int str, final int dex, final int intel,
			final int wis, final int charis) {
		this.baseStrenght = str;
		this.baseDexterity = dex;
		this.baseIntelligence = intel;
		this.baseWisdom = wis;
		this.baseCharisma = charis;
	}

	public int getStrenght() {
		return this.baseStrenght;
	}

	public void setStrenght(final int strenght) {
		this.baseStrenght = strenght;
		this.stats.add(strenght);
	}

	public int getDexterity() {
		return this.baseDexterity;
	}

	public void setDexterity(final int dexterity) {
		this.baseDexterity = dexterity;
	}

	public int getIntelligence() {
		return this.baseIntelligence;
	}

	public void setIntelligence(final int intelligence) {
		this.baseIntelligence = intelligence;
	}

	public int getWisdom() {
		return this.baseWisdom;
	}

	public void setWisdom(final int wisdom) {
		this.baseWisdom = wisdom;
	}

	public int getCharisma() {
		return this.baseCharisma;
	}

	public void setCharisma(final int charisma) {
		this.baseCharisma = charisma;
	}
}
