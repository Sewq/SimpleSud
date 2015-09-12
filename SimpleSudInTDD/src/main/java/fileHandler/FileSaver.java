package fileHandler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import playerHandler.PlayerHandler;

/**
 * Class is responsible for saving the player state to file
 *
 * @author Sewq
 *
 */
public class FileSaver {

	/**
	 * Saves player parameters to file
	 *
	 * @param player
	 *            current playing player
	 * @throws IOException
	 */
	public void saveToFile(final PlayerHandler player) throws IOException {

		// TODO
		final BufferedWriter writer = new BufferedWriter(new FileWriter(
				player.getName(), false));
		writer.write("name=" + player.getName() + "\n");
		writer.write("spec=" + player.getSpec().toString() + "\n");
		writer.write("sex=" + player.getSex());
		writer.flush();
		writer.close();
	}
}
