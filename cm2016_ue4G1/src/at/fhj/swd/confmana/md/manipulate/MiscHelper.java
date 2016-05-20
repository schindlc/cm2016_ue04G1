package at.fhj.swd.confmana.md.manipulate;

public class MiscHelper {
	public String reverseString(String textToinverse){
		return null;
	}
	
	public String CapitalizeString(String textToCapoitalize){
		return null;
	}
	
	public String rot13(String textToRot13){
		return null;
	}
	
	protected String quoteBy(String string, String start, String stop){
		return this.quoteBy(string, start, stop, string);
	}
	protected String quoteBy(String string, String start, String stop, String empty){
		if(string==null) throw new IllegalArgumentException();
		return string.trim().length()>0?start+string+stop:empty;
	}
}
