package at.fhj.swd.confmana.md.manipulate;

public class QuotingHelper {

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
