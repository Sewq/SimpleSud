package profession;

import java.util.Random;

import stats.BaseStats;

/**
 * Class that provides a specialisation for player - Mage
 *
 * @author Sewq
 *
 */
public class Mage implements Specialisation {

	private BaseStats stats;

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
		return "Mage";
	}
}
