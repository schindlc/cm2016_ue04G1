package at.fhj.swd.confmana.md.manipulate;

public class StyleHelper {

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
