package at.fhj.swd.confmana.md.manipulate;

public class QuotingHelper {
	public String quoteTextLine(String quoteTextLine){
		if(quoteTextLine == null){
			throw new IllegalArgumentException();
		}
		if(quoteTextLine.trim().length()==0){
			return quoteTextLine;
	
			
		}
		return "> "+ quoteTextLine + "\n"; 
	}
}
