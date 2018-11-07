package test1_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeToolTest {

	@Test
	public void testStrcat() {
		//fail("Not yet implemented");
		SomeTool tool = new SomeTool();
		String str1="ma",str2="huanglei";
		String string = "mahuanglei";
		assertEquals(string, tool.strcat(str1, str2));
	}

	@Test
	public void testStrcmp() {
		//fail("Not yet implemented");
		SomeTool tool = new SomeTool();
		String str1="ma",str2="mb";
		assertEquals(-1, tool.strcmp(str1, str2));
		assertEquals(1, tool.strcmp(str2, str1));
	}

	@Test
	public void testStrsub() {
		//fail("Not yet implemented");
		SomeTool tool = new SomeTool();
		String str1="mahuanglei";
		assertEquals("huanglei", tool.strsub(str1, 2, 10));
		assertEquals("huang", tool.strsub(str1, 2, 7));
		assertEquals("mahuanglei", tool.strsub(str1, 0, 10));
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
