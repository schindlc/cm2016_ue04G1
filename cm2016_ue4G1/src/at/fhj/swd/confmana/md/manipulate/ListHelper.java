package at.fhj.swd.confmana.md.manipulate;

import java.util.List;

public class ListHelper {
	public String createNestedList(List<String> listItems, int intendlevel){
		StringBuffer sb = new StringBuffer();
		int n = 2* intendlevel;
		
		for(String item : listItems){
			for (int i = 0; i <= n; i++) {
				sb.append(" ");
			}
			sb.append("*").append(item).append("\n");
		}
		return sb.toString();
	}
}