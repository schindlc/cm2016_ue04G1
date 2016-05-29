package at.fhj.swd.confmana.md;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MarkdownTextEnhancerTest {

	private ArrayList<String> itemList;
	
	@Before
	public void setup(){
		itemList = new ArrayList<String>();
		itemList.add("item1");
		itemList.add("item2");
		itemList.add("item3");
	}
	
	@Test
	public void testCreateMdLink() {
		String expected = "[link description](linkUrl)";
		assertEquals(expected, MarkdownTextEnhancer.createMdLink("link description", "linkUrl"));
	}

	@Test
	public void testCreateOrderedList() {
		String expected = "1. item1\n1. item2\n1. item3\n"; // yes that's markdown!
		assertEquals(expected, MarkdownTextEnhancer.createOrderedList(itemList));
		assertEquals("", MarkdownTextEnhancer.createOrderedList(new ArrayList<String>()));
	}
	
	
	@Test
	public void testCreateUnOrderedList() {
		String expected = "* item1\n* item2\n* item3\n";
		assertEquals(expected, MarkdownTextEnhancer.createUnOrderedList(itemList));
		assertEquals("",MarkdownTextEnhancer.createUnOrderedList(new ArrayList<String>()));
	}
	
	@Test
	public void testCreateNestedList() {
		String expected = "  * item1\n  * item2\n  * item3\n";
		assertEquals(expected,MarkdownTextEnhancer.createNestedList(itemList, 1));
		expected = "    * item1\n    * item2\n    * item3\n";
		assertEquals(expected,MarkdownTextEnhancer.createNestedList(itemList, 2));
		expected = "* item1\n* item2\n* item3\n";
		assertEquals(expected,MarkdownTextEnhancer.createNestedList(itemList, 0));
	}

	@Test
	public void testMakeNestedList() {
		String expected = "    * item1\n    * item2\n    * item3\n";
		assertEquals(expected, MarkdownTextEnhancer.makeListNested("* item1\n* item2\n* item3\n",2));
		expected = "    1. item1\n    1. item2\n    1. item3\n";
		assertEquals(expected, MarkdownTextEnhancer.makeListNested("1. item1\n1. item2\n1. item3\n", 2));
		expected = "* item1\n* item2\n* item3\n";
		assertEquals(expected, MarkdownTextEnhancer.makeListNested("* item1\n* item2\n* item3\n", 0));
	}

	@Test
	public void testCreateTaskList() {
		String expected = "- [ ] item1\n- [ ] item2\n- [ ] item3\n";
		assertEquals(expected, MarkdownTextEnhancer.createTaskList(itemList));
	}

	@Test
	public void testQuoteTextLine() {
		String expected = "> This text line should be quoted in the style of a text email.\n";
		assertEquals(expected, MarkdownTextEnhancer.quoteTextLine("This text line should be quoted in the style of a text email."));
		expected = "";
		assertEquals(expected, MarkdownTextEnhancer.quoteTextLine(""));
		expected = "  ";
		assertEquals(expected, MarkdownTextEnhancer.quoteTextLine("  "));
		
	}

	@Test
	public void testQuoteCodeLine() {
		String expected = "`public void empty(){}`";
		assertEquals(expected,MarkdownTextEnhancer.quoteCodeLine("public void empty(){}"));
		expected ="";
		assertEquals(expected,MarkdownTextEnhancer.quoteCodeLine(""));
		expected ="  ";
		assertEquals(expected,MarkdownTextEnhancer.quoteCodeLine("  "));
		
	}

	@Test
	public void testQuoteCodeBlock() {
		String expected = "```\npublic void empty(){\n//empty as is\n}\n```";
		assertEquals(expected,MarkdownTextEnhancer.quoteCodeBlock("public void empty(){\n//empty as is\n}"));
		expected ="```\n```";
		assertEquals(expected,MarkdownTextEnhancer.quoteCodeBlock(""));
	}

	@Test
	public void testCreateHeader1() {
		String expected = "# heading";
		assertEquals(expected, MarkdownTextEnhancer.createHeader1("heading"));
	}

	@Test
	public void testCreateHeader2() {
		String expected = "## heading";
		assertEquals(expected, MarkdownTextEnhancer.createHeader2("heading"));
	}

	@Test
	public void testCreateHeader3() {
		String expected = "### heading";
		assertEquals(expected, MarkdownTextEnhancer.createHeader3("heading"));
	}

	@Test
	public void testCreateHeader4() {
		String expected = "#### heading";
		assertEquals(expected, MarkdownTextEnhancer.createHeader4("heading"));
	}

	@Test
	public void testCreateHeader5() {
		String expected = "##### heading";
		assertEquals(expected, MarkdownTextEnhancer.createHeader5("heading"));
	}

	@Test
	public void testCreateHeader6() {
		String expected = "###### heading";
		assertEquals(expected, MarkdownTextEnhancer.createHeader6("heading"));
	}


	@Test
	public void testMakeBold() {
		String expected = "**this is bold text.**";
		assertEquals(expected, MarkdownTextEnhancer.makeBold("this is bold text."));
		assertEquals(expected, MarkdownTextEnhancer.makeBold(" this is bold text. "));
		expected = "";
		assertEquals(expected, MarkdownTextEnhancer.makeBold(""));
		expected = "   ";
		assertEquals(expected, MarkdownTextEnhancer.makeBold("   "));
	}

	@Test
	public void testMakeItalic() {
		String expected = "_This text is italicized._";
		assertEquals(expected, MarkdownTextEnhancer.makeItalic("This text is italicized."));
		assertEquals(expected, MarkdownTextEnhancer.makeItalic(" This text is italicized. "));
		expected = "";
		assertEquals(expected, MarkdownTextEnhancer.makeItalic(""));
		expected = "  ";
		assertEquals(expected, MarkdownTextEnhancer.makeItalic("  "));
	}

	@Test
	public void testMakeStrikeThrough() {
		String expected = "~~This text was a mistake.~~";
		assertEquals(expected,MarkdownTextEnhancer.makeStrikeThrough("This text was a mistake."));
		assertEquals(expected,MarkdownTextEnhancer.makeStrikeThrough(" This text was a mistake. "));
		expected = "";
		assertEquals(expected,MarkdownTextEnhancer.makeStrikeThrough(""));
		expected = "    ";
		assertEquals(expected,MarkdownTextEnhancer.makeStrikeThrough("    "));
	}
	

	@Test
	public void testReverseString() {
		fail("Not yet implemented");
	}

	@Test
	public void testCapitalizeString() {
		fail("Not yet implemented");
	}

	@Test
	public void testRot13() {
		fail("Not yet implemented");
	}

}
