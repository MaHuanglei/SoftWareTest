package util;

import static org.junit.Assert.*;

import org.junit.Test;

public class JustTest {

	@Test
	public void testStrJust() {
		//fail("Not yet implemented");
		SomeTool tool = new SomeTool();
		assertEquals("Yes", tool.strJust("0123456"));
		assertEquals("No", tool.strJust("1.256"));
		assertEquals("No", tool.strJust("jshd"));
	}

}
