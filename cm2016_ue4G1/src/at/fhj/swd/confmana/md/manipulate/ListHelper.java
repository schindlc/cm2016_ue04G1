package at.fhj.swd.confmana.md.manipulate;

import java.util.List;

public class ListHelper {

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
}