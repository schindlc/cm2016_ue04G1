package at.fhj.swd.confmana.md.manipulate;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {

	public static String createTaskList(List<String> itemList) {
		String itemTask = "";
		
		for(String item : itemList){
			itemTask += "- [ ] "+item + "\n";
		} 
		return itemTask;
	}

	public static String createNestedList(List<String> listItems, int intendlevel) {
		StringBuffer sb = new StringBuffer();
		int n = 2 * intendlevel;

		if (listItems == null) {
			throw new IllegalArgumentException();
		}
		if (intendlevel < 0) {
			throw new IllegalArgumentException();
		}
		for (String item : listItems) {
			for (int i = 0; i <= n; i++) {
				if (i == 0) {
					sb.append("");
				} else {
					sb.append(" ");
				}

			}
			sb.append("* ").append(item).append("\n");
		}
		return sb.toString();
		}

	public String makeListNested(String markdownListString, int intendLevel){
		if (markdownListString == null) {
			throw new IllegalArgumentException();
		}
		if (intendLevel < 0 ) {
			throw new IllegalArgumentException();
		}
		StringBuffer sb = new StringBuffer();
		String[] StringArray = markdownListString.split("\n");
		for (int i = 0; i<StringArray.length;i++){
			for (int j=0; j<intendLevel;j++){
				sb.append("  ");
			}
			sb.append(StringArray[i]).append("\n");

		}
		return sb.toString();
	}


	public String createOrderedList(List<String> listItems){
		String orderedList = "";
		System.out.println("Test");
		if(listItems == null) {
			orderedList = "";
		} else {
			for(int i = 0; i < listItems.size(); i++) {
				orderedList += "1. ";
				orderedList += listItems.get(i);
				orderedList += "\n";
			}
		}
		System.out.println(orderedList);
		return orderedList;
	}
	
//	public String createNestedList(ArrayList<String> itemList, int i) {
//		return this.makeListNested(this.createUnOrderedList(itemList), i);
//	}

	public String createUnOrderedList(ArrayList<String> itemList) {
		return this.buildList(itemList, "*");
	}

	public String createOrderedList(ArrayList<String> itemList) {
		return this.buildList(itemList, "1.");
	}

	public String createTaskList(ArrayList<String> itemList) {
		return this.buildList(itemList, "- [ ]");
	}

	private String buildList(ArrayList<String> itemList, String bullet){
		if(itemList==null) throw new IllegalArgumentException();
		String result = "";
		for(String s:itemList){ result += bullet+" "+s+"\n";}
		return result;
	}
}

