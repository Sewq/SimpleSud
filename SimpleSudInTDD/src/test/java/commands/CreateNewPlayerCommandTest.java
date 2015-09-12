package commands;

import static org.junit.Assert.*;

import org.junit.Test;

import commandHandler.Command;

public class CreateNewPlayerCommandTest {

	@Test
	public void testIsInstanceOfCommand() throws Exception {
		CreateNewPlayerCommand createNewPlayer = new CreateNewPlayerCommand();
		assertTrue(createNewPlayer instanceof Command);
	}
}
