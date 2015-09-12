package commands;

import playerHandler.PlayerProvider;

import commandHandler.CommandAbstractImpl;

/**
 * Command for some tests
 *
 * @author Sewq
 *
 */
public class NameCommand extends CommandAbstractImpl {

	@Override
	public void execute(final String[] commandName) {
		System.out.println(PlayerProvider.getPlayerInstance().getName());
		System.out.println("Dex: "
				+ PlayerProvider.getPlayerInstance().getActualStats().getDexterity());

		System.out.println("Dex: "
				+ PlayerProvider.getPlayerInstance().getActualStats().getBaseStats()
						.getDexterity());

		PlayerProvider.getPlayerInstance().getActualStats().getStatsModificator()
				.setDexterityModificator(30);
		System.out.println("Dex after modificator: "
				+ PlayerProvider.getPlayerInstance().getActualStats().getDexterity());
	}
}
