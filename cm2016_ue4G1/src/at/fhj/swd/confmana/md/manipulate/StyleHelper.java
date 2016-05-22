package at.fhj.swd.confmana.md.manipulate;

public class StyleHelper {

	public static String makeItalic(String textLineToMakeItalic){
		if (textLineToMakeItalic == null) {
			throw new IllegalArgumentException();
		} else if (textLineToMakeItalic.trim().length() > 0) {
			return "_" + textLineToMakeItalic.trim() + "_";
		} else {
			return textLineToMakeItalic;
		}
	}
	
	public static String makeStrikeThrough(String textLineToStrikeThrough){
		if (textLineToStrikeThrough == null) {
			throw new IllegalArgumentException();
		} else if (textLineToStrikeThrough.trim().length() > 0) {
			return "~~" + textLineToStrikeThrough.trim() + "~~";
		}
		return textLineToStrikeThrough;
	}
}
