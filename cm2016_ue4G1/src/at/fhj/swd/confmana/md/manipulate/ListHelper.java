package at.fhj.swd.confmana.md.manipulate;

import java.util.List;

public class ListHelper {

	@SuppressWarnings("null")
	public static String createTaskList(List<String> itemList) {
		String itemTask = "";
		
		for(String item : itemList){
			itemTask += "- [ ] "+item + "\n";
		} 
		return itemTask;
	}
	
}
