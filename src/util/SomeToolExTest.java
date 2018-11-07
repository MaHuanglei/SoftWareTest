package util;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeToolExTest {

	@Test
	public void testStrcompare() {
		//fail("Not yet implemented");
		SomeToolEx tool = new SomeToolEx();
		assertEquals("str1 > str2", tool.strcompare("123","0123"));
		assertEquals("str1 = str2", tool.strcompare("123","123"));
		assertEquals("str1 < str2", tool.strcompare("0123","123"));
	}
}
