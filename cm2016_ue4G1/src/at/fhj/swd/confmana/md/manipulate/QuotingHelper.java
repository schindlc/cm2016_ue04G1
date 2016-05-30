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

	public String quoteTextLine(String quoteTextLine){
		if(quoteTextLine == null){
			throw new IllegalArgumentException();
		}
		if(quoteTextLine.trim().length()==0){
			return quoteTextLine;
	
			
		}
		return "> "+ quoteTextLine + "\n"; 
	}


	private MiscHelper mh;
	
	public QuotingHelper(){
		this.mh = new MiscHelper();
	}
	
	public String quoteCodeBlock(String string) {
		return this.mh.quoteBy(string, "```\n", "\n```", "```\n```");
	}

	public String quoteCodeLine(String string) {
		return this.mh.quoteBy(string, "`", "`");
	}

	public String quoteTextLine(String string) {
		return this.mh.quoteBy(string, "> ", "\n");
	}
}
