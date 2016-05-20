package at.fhj.swd.confmana.md.manipulate;

import java.util.ArrayList;

public class ListHelper {

	public Object createNestedList(ArrayList<String> itemList, int i) {
		return this.makeListNested(this.createUnOrderedList(itemList), i);
	}

	public String createUnOrderedList(ArrayList<String> itemList) {
		return this.buildList(itemList, "*");
	}

	public String createOrderedList(ArrayList<String> itemList) {
		return this.buildList(itemList, "1.");
	}

	public String createTaskList(ArrayList<String> itemList) {
		return this.buildList(itemList, "- [ ]");
	}

	public String makeListNested(String string, int i) {
		if(i<0||string==null) throw new IllegalArgumentException();
		String pad = i>0?String.format("%1$" + i*2 + "s", " "):"";
		return pad+string.replaceAll("\n", "\n"+pad).trim()+"\n";
	}

	private String buildList(ArrayList<String> itemList, String bullet){
		if(itemList==null) throw new IllegalArgumentException();
		String result = "";
		for(String s:itemList){ result += bullet+" "+s+"\n";}
		return result;
	}
}
