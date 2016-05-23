package at.fhj.swd.confmana.md.manipulate;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StyleHelperTest {

	private StyleHelper styleHelper;
	
	@Before
	public void setUp() throws Exception {
		styleHelper = new StyleHelper();
	}
/*
	@Test
	public void testMakeBold() {
		String expected = "**this is bold text.**";
		assertEquals(expected, styleHelper.makeBold("this is bold text."));
		assertEquals(expected, styleHelper.makeBold(" this is bold text. "));
		expected = "";
		assertEquals(expected, styleHelper.makeBold(""));
		expected = "   ";
		assertEquals(expected, styleHelper.makeBold("   "));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testMakeBoldNull() {
		styleHelper.makeBold(null);
	}
	*/
	@Test
	public void testMakeItalic() {
		String expected = "_This text is italicized._";
		assertEquals(expected, styleHelper.makeItalic("This text is italicized."));
		assertEquals(expected, styleHelper.makeItalic(" This text is italicized. "));
		expected = "";
		assertEquals(expected, styleHelper.makeItalic(""));
		expected = "  ";
		assertEquals(expected, styleHelper.makeItalic("  "));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMakeItalicNull() {
		styleHelper.makeItalic(null);
	}
	
	@Test
	public void testMakeStrikeThrough() {
		String expected = "~~This text was a mistake.~~";
		assertEquals(expected,styleHelper.makeStrikeThrough("This text was a mistake."));
		assertEquals(expected,styleHelper.makeStrikeThrough(" This text was a mistake. "));
		expected = "";
		assertEquals(expected,styleHelper.makeStrikeThrough(""));
		expected = "    ";
		assertEquals(expected,styleHelper.makeStrikeThrough("    "));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testMakeStrikeThroughNull() {
		styleHelper.makeStrikeThrough(null);
	}
}
