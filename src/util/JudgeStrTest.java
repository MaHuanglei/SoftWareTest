package util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JudgeStrTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStrJudge() {
		//fail("Not yet implemented");
		SomeTool tool = new SomeTool();
		assertEquals(true, tool.strJudge("0123456"));
		assertEquals(false, tool.strJudge("1.256"));
		assertEquals(false, tool.strJudge("jshd"));
	}

}
