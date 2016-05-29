package at.fhj.swd.confmana.md.manipulate;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class QuotingHelperTest {

	private QuotingHelper quotingHelper;
	
	@Before
	public void setUp() throws Exception {
		quotingHelper = new QuotingHelper();
		
	}

	@Test
	public void testQuoteTextLine() {
		String expected = "> This text line should be quoted in the style of a text email.\n";
		assertEquals(expected, quotingHelper.quoteTextLine("This text line should be quoted in the style of a text email."));
		expected = "";
		assertEquals(expected, quotingHelper.quoteTextLine(""));
		expected = "  ";
		assertEquals(expected, quotingHelper.quoteTextLine("  "));
		
	}

	@Test(expected=IllegalArgumentException.class)
	public void testQuoteTextLineNull() {
		quotingHelper.quoteTextLine(null);
	}
	

	@Test
	public void testQuoteCodeLine() {
		String expected = "`public void empty(somevar){somecode}`";
		assertEquals(expected,quotingHelper.quoteCodeLine("public void empty(somevar){somecode}"));
		expected ="";
		assertEquals(expected,quotingHelper.quoteCodeLine(""));
		expected ="  ";
		assertEquals(expected,quotingHelper.quoteCodeLine("  "));
		
	}

	@Test(expected=IllegalArgumentException.class)
	public void testQuoteCodeLineNull() {
		quotingHelper.quoteCodeLine(null);
	}

	@Test
	public void testQuoteCodeBlock() {
		String expected = "```\npublic void empty(){\n//empty as is\n}\n```";
		assertEquals(expected,quotingHelper.quoteCodeBlock("public void empty(){\n//empty as is\n}"));
		expected ="```\n```";
		assertEquals(expected,quotingHelper.quoteCodeBlock(""));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testQuoteCodeBlockNull() {
		quotingHelper.quoteCodeBlock(null);
	}

}
