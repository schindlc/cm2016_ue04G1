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


	private MiscHelper mh;
	
	public StyleHelper(){
		this.mh = new MiscHelper();
	}
	
	public String makeBold(String string) {
		return this.mh.quoteBy(string!=null?string.trim():null, "**", "**", string);
	}

	public String makeItalic(String string) {
		return this.mh.quoteBy(string!=null?string.trim():null, "_", "_", string);
	}

	public String makeStrikeThrough(String string) {
		return this.mh.quoteBy(string!=null?string.trim():null, "~~", "~~", string);
	}
}
