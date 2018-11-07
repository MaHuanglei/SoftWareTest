package test1_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrcmpTest {

	@Test
	public void testStrcompare() {
		//fail("Not yet implemented");
		SomeTool tool = new SomeTool();
		assertEquals("str1 > str2", tool.strcompare("123","0123"));
		assertEquals("str1 = str2", tool.strcompare("123","123"));
		assertEquals("str1 < str2", tool.strcompare("0123","123"));
	}

}
