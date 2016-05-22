package at.fhj.swd.confmana.md.manipulate;

public class QuotingHelper {

	
	//Stefan Moder quoteCodeLine
	public static String quoteCodeLine(String line) {
		if (line == null) {
			throw new IllegalArgumentException();
		}
		if (line.trim().length() > 0) {
			return "`" + line + "`";
		} else {
			return line;
		}
	}
}
