package fileHandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import playerHandler.PlayerProvider;
import playerHandler.PlayerHandler;

/**
 * Class responsible for loading saved game state from a file
 *
 * @author Sewq
 *
 */
public class FileLoader {

	/**
	 * Method that creates a player from the file and sets it to global
	 *
	 * @param fileName
	 *            file name
	 * @throws IOException
	 */
	public void loadFile(final String fileName) throws IOException {

		final BufferedReader reader = new BufferedReader(new FileReader(
				fileName));
		final String name = this.stringSplitter(reader);
		final String prof = this.stringSplitter(reader);
		final String sex = this.stringSplitter(reader);

		this.setPlayer(new PlayerHandler(name, sex, prof));

		reader.close();
	}

	private String stringSplitter(final BufferedReader reader)
			throws IOException {
		return reader.readLine().split("=")[1];
	}

	private void setPlayer(final PlayerHandler player) {
		PlayerProvider.setPlayerInstance(player);
	}

}
