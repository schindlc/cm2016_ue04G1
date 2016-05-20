package at.fhj.swd.confmana.md.manipulate;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkHelperTest {

	private LinkHelper linkHelper;
	
	@Before
	public void setup(){
		linkHelper = new LinkHelper();
	}
	
	@Test
	public void testCreateMdLink() {
		String expected = "[link description](linkUrl)";
		assertEquals(expected, linkHelper.createMdLink("link description", "linkUrl"));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCreateMdLinkNULLDescription() {
		linkHelper.createMdLink(null, "link url");
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCreateMdLinkNullUrl() {
		linkHelper.createMdLink("link description", null);
	}

}
