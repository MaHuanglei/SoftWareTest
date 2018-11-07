package test1_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class JudgeStrTest {

	@Test
	public void testStrJudge() {
		//fail("Not yet implemented");
		SomeTool tool = new SomeTool();
		assertEquals(true, tool.strJudge("0123456"));
		assertEquals(false, tool.strJudge("1.256"));
		assertEquals(false, tool.strJudge("jshd"));
	}

}
