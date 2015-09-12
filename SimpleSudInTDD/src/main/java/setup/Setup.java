package setup;

import Area.AreaInit;
import commandHandler.CommandContainer;

/**
 * Class responsible for the initial game setup
 *
 * @author Sewq
 *
 */
public class Setup {

	/**
	 * inits the commands available for player
	 */
	public void setupGame() {
		CommandContainer.init();
		AreaInit.init();

	}
}
