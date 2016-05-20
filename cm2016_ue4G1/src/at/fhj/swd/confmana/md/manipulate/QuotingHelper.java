package at.fhj.swd.confmana.md.manipulate;

public class QuotingHelper {

	
	//Stefan Moder quoteCodeLine
	public static String quoteCodeLine(String line) {
		if (line == null) {
			throw new IllegalArgumentException();
		}
		if (line.contains("(){}")) {
			return "`" + line + "`";
		} else {
			return line;
		}
	}
}
