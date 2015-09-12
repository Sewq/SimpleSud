package commands;

import java.util.Scanner;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import playerHandler.PlayerProvider;
import playerHandler.PlayerHandler;

import commandHandler.CommandAbstractImpl;

public class CreateNewPlayerCommand extends CommandAbstractImpl {

	private final static String SEX_MALE = "male";
	private final static String SEX_FEMALE = "female";

	private final Scanner input = new Scanner(System.in);
	private String prof;
	private String name;
	private String sex;
	private int counter = 0;

	/**
	 * Executes the command with given arguments
	 */
	@Override
	public void execute(final String[] commandArguments) {
		if (this.counter != 0) {
			System.out
					.println("You need to exit your current game to create a new character and start over.");
		} else {
			this.counter++;
			this.characterInputs();
			this.createAndSetPlayer();
		}
	}

	private void characterInputs() {
		System.out.println("Name: ");
		this.name = this.input.nextLine();

		System.out.println("Sex: [Male/Female] ");
		this.sex = this.input.nextLine();

		while (!this.isSexAvailable()) {

			System.out.println("Thats not a proper sex! You can't be "
					+ this.sex);
			this.sex = this.input.nextLine();
		}

		System.out.println("Proffesion: [Mage/Warrior] ");
		this.prof = this.input.nextLine();
	}

	private boolean isSexAvailable() {
		return this.sex.equalsIgnoreCase(SEX_MALE)
				|| this.sex.equalsIgnoreCase(SEX_FEMALE);
	}

	private void createAndSetPlayer() {
		final PlayerHandler newPlayer = new PlayerHandler(this.name, this.sex,
				this.prof);
		System.out.println("New player created!");
		this.setPlayer(newPlayer);
	}

	private void setPlayer(final PlayerHandler newPlayer) {
		PlayerProvider.setPlayerInstance(newPlayer);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.input).append(this.prof)
				.append(this.name).append(this.sex).toHashCode();
	}

}
