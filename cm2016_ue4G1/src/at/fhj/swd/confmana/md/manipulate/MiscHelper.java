package at.fhj.swd.confmana.md.manipulate;

public class MiscHelper {
	public String reverseString(String textToinverse){
		String result="";
		for(char c: textToinverse.toCharArray()){
			result = c+result;
		}
		return result;
	}
	
	public String CapitalizeString(String textToCapoitalize){
		String result="";
		for(char c: textToCapoitalize.toCharArray()){
			result += Character.toUpperCase(c);
		}
		return result;
	}
	
	public String rot13(String textToRot13){
		String result="";
		for(char c: textToRot13.toCharArray()){
			/*
			 * snippet from http://introcs.cs.princeton.edu/java/31datatype/Rot13.java.html
			 */
            if (c >= 'a' && c <= 'm') c += 13;
            else if (c >= 'A' && c <= 'M') c += 13;
            else if (c >= 'n' && c <= 'z') c -= 13;
            else if (c >= 'N' && c <= 'Z') c -= 13;
            /*
             * snippet end ;)
             */
            
			result += c;
		}
		return result;
	}
	
	protected String quoteBy(String string, String start, String stop){
		return this.quoteBy(string, start, stop, string);
	}
	protected String quoteBy(String string, String start, String stop, String empty){
		if(string==null) throw new IllegalArgumentException();
		return string.trim().length()>0?start+string+stop:empty;
	}
}
