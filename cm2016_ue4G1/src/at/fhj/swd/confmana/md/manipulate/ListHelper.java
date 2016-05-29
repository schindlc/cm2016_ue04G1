package at.fhj.swd.confmana.md.manipulate;

import java.util.List;

public class ListHelper {

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
	
}
