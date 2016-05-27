package at.fhj.swd.confmana.md.manipulate;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import at.fhj.swd.confmana.md.HeadingHelper;

public class HeadingHelperTest {
	private HeadingHelper headingHelper;
	
	@Before
	public void setUp() throws Exception {
		headingHelper = new HeadingHelper();
	}

	//@Test
//	public void testCreateHeader() {
//		String expected = "# This is a simple header";
//		assertEquals(expected, headingHelper.createHeader("This is a simple header", 1));
//		assertEquals(expected, headingHelper.createHeader(" This is a simple header ", 1));
//		expected = "## This is a header level 2";
//		assertEquals(expected, headingHelper.createHeader("This is a header level 2", 2));
//		expected = "### This is a header level 3";
//		assertEquals(expected, headingHelper.createHeader("This is a header level 3", 3));
//		expected = "#### This is a header level 4";
//		assertEquals(expected, headingHelper.createHeader("This is a header level 4", 4));
//		expected = "##### This is a header level 5";
//		assertEquals(expected, headingHelper.createHeader("This is a header level 5", 5));
//		expected = "###### This is a header level 6";
//		assertEquals(expected, headingHelper.createHeader("This is a header level 6", 6));
//		expected = "# ";
//		assertEquals(expected, headingHelper.createHeader(" ", 1));
//		expected = "##";
//		assertEquals(expected, headingHelper.createHeader("", 2));
//		expected = "###";
//		assertEquals(expected, headingHelper.createHeader("", 3));
//		expected = "####";
//		assertEquals(expected, headingHelper.createHeader("", 4));
//		expected = "#####";
//		assertEquals(expected, headingHelper.createHeader("", 5));
//		expected = "######";
//		assertEquals(expected, headingHelper.createHeader("", 6));
//	}

//	@Test(expected= IllegalArgumentException.class)
//	public void testCreateHeaderNull() {
//		headingHelper.createHeader(null, 1);
//	}
//
//	@Test(expected= IllegalArgumentException.class)
//	public void testCreateHeaderNegHeaderLevel() {
//		headingHelper.createHeader("This is a simple header", -1);
//	}
//
//	@Test(expected= IllegalArgumentException.class)
//	public void testCreateHeaderLevelTooBig() {
//		headingHelper.createHeader("This is a simple header", 7);
//	}
	
	@Test
	public void testCreateHeader1(){
		String expected = "# heading";
		assertEquals(expected, headingHelper.createHeader1("heading"));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCreateHeader1Null(){
		headingHelper.createHeader1(null);
	}
	
//	@Test
//	public void testCreateHeader2(){
//		String expected = "## heading";
//		assertEquals(expected, headingHelper.createHeader2("heading"));
//	}
//	
//	@Test(expected=IllegalArgumentException.class)
//	public void testCreateHeader2Null(){
//		headingHelper.createHeader2(null);
//	}
//
//	@Test
//	public void testCreateHeader3(){
//		String expected = "### heading";
//		assertEquals(expected, headingHelper.createHeader3("heading"));
//	}
//
//	@Test(expected=IllegalArgumentException.class)
//	public void testCreateHeader3Null(){
//		headingHelper.createHeader3(null);
//	}
//	
//	@Test
//	public void testCreateHeader4(){
//		String expected = "#### heading";
//		assertEquals(expected, headingHelper.createHeader4("heading"));
//	}
//
//	@Test(expected=IllegalArgumentException.class)
//	public void testCreateHeader4Null(){
//		headingHelper.createHeader4(null);
//	}
//	
//	@Test
//	public void testCreateHeader5(){
//		String expected = "##### heading";
//		assertEquals(expected, headingHelper.createHeader5("heading"));
//	}
//
//	@Test(expected=IllegalArgumentException.class)
//	public void testCreateHeader5Null(){
//		headingHelper.createHeader5(null);
//	}
//	
//	@Test
//	public void testCreateHeader6(){
//		String expected = "###### heading";
//		assertEquals(expected, headingHelper.createHeader6("heading"));
//	}
//
//	@Test(expected=IllegalArgumentException.class)
//	public void testCreateHeader6Null(){
//		headingHelper.createHeader6(null);
//	}
	
}
