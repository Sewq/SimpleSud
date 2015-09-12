package commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import commandHandler.Command;

public class ScoreCommandTest {

	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {

		System.setErr(new PrintStream(this.errContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
		System.setErr(null);
	}

	@Test
	public void testIsBoardCommandInstanceOfCommand() throws Exception {
		final ScoreCommand command = new ScoreCommand();
		assertTrue(command instanceof Command);
	}

	// TODO more testa
	@Test
	public void testExecuteShouldShowPlayerName() throws Exception {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		final ScoreCommand command = new ScoreCommand();
		final String[] commandName = { "board" };
		command.execute(commandName);
		assertEquals("Sewq\ncos\n", outContent.toString());
	}
}
