package at.fhj.swd.confmana.md.manipulate;

import java.util.List;

public class ListHelper {
	public String createOrderedList(List<String> listItems){
		StringBuffer sb = new StringBuffer();
		for (String item : listItems){
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

}
