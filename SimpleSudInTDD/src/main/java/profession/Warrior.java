package profession;

import java.util.Random;

import stats.BaseStats;

/**
 * Class that provides a specialisation for player - Warrior
 *
 * @author Sewq
 *
 */
public class Warrior implements Specialisation {

	BaseStats stats;

	/**
	 * Sets the base stats together with player creation
	 */
	@Override
	public void drawStats() {
		final Random rand = new Random();
		this.stats = new BaseStats(rand.nextInt(10) + 10,
				rand.nextInt(10) + 10, rand.nextInt(10) + 10,
				rand.nextInt(10) + 10, rand.nextInt(10) + 10);
	}

	@Override
	public BaseStats getBaseStats() {
		return this.stats;
	}

	@Override
	public String toString() {
		return "Warrior";
	}

}
