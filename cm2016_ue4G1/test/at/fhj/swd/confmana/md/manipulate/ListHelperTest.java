package at.fhj.swd.confmana.md.manipulate;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ListHelperTest {

	private ListHelper listHelper;
	private ArrayList<String> itemList;
	
	@Before
	public void setup(){
		listHelper = new ListHelper();
		itemList = new ArrayList<String>();
		itemList.add("item1");
		itemList.add("item2");
		itemList.add("item3");
	}
	
	
	@Test
	public void testCreateUnOrderedList() {
		String expected = "* item1\n* item2\n* item3\n";
		assertEquals(expected, listHelper.createUnOrderedList(itemList));
		assertEquals("",listHelper.createUnOrderedList(new ArrayList<String>()));
	}


	@Test (expected = IllegalArgumentException.class)
	public void testCreateUnOrderedListNull() {
		listHelper.createUnOrderedList(null);
	}
	
	
	@Test
	public void testCreateOrderedList() {
		String expected = "1. item1\n1. item2\n1. item3\n"; // yes that's markdown!
		assertEquals(expected, listHelper.createOrderedList(itemList));
		assertEquals("", listHelper.createOrderedList(new ArrayList<String>()));

	}

	@Test(expected=IllegalArgumentException.class)
	public void testCreateOrderedListNull() {
		listHelper.createOrderedList(null);
	}
	
	
	@Test
	public void testCreateNestedList() {
		String expected = "  * item1\n  * item2\n  * item3\n";
		assertEquals(expected,listHelper.createNestedList(itemList, 1));
		expected = "    * item1\n    * item2\n    * item3\n";
		assertEquals(expected,listHelper.createNestedList(itemList, 2));
		expected = "* item1\n* item2\n* item3\n";
		assertEquals(expected,listHelper.createNestedList(itemList, 0));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCreateNestedListIllegalIntendation(){
		listHelper.createNestedList(itemList, -1);
	}

	
	@Test(expected=IllegalArgumentException.class)
	public void testCreateNestedListNull() {
		listHelper.createNestedList(null, 1);
	}

	@Test
	public void testMakeNestedList() {
		String expected = "    * item1\n    * item2\n    * item3\n";
		assertEquals(expected, listHelper.makeListNested(listHelper.createUnOrderedList(itemList),2));
		expected = "    1. item1\n    1. item2\n    1. item3\n";
		assertEquals(expected, listHelper.makeListNested(listHelper.createOrderedList(itemList), 2));
		expected = "* item1\n* item2\n* item3\n";
		assertEquals(expected, listHelper.makeListNested(listHelper.createUnOrderedList(itemList), 0));
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMakeListNestedNull(){
		listHelper.makeListNested(null, 2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMakeListNestedIllegalIntend(){
		listHelper.makeListNested("* item", -1000);
	}
	
	
	@Test
	public void testCreateTaskList() {
		String expected = "- [ ] item1\n- [ ] item2\n- [ ] item3\n";
		assertEquals(expected, listHelper.createTaskList(itemList));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCreateTaskListNull() {
		listHelper.createTaskList(null);
	}
	
}
