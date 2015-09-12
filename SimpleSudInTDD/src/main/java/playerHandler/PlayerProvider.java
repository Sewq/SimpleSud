package playerHandler;

/**
 * Sets the current player to global for availiability
 *
 * @author Sewq
 *
 */
public class PlayerProvider {

	private static PlayerHandler player;

	public static PlayerHandler getPlayerInstance() {
		return player;
	}

	public static void setPlayerInstance(final PlayerHandler createdPlayer) {
		player = createdPlayer;
	}
}
