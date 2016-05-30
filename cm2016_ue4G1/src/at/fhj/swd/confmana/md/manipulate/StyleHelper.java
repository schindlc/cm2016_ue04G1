package at.fhj.swd.confmana.md.manipulate;

public class StyleHelper {
	public String makeBold(String text) {		
		if(text == null) {
			throw new IllegalArgumentException("Null object is not allowed.");
		}
		
		String newString = text.trim();
		if(newString.length() == 0) {
			return text;
		}
		
		return "**" + newString + "**";
	}
}
