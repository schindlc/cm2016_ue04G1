package at.fhj.swd.confmana.md.manipulate;

public class HeadingHelper {
	public String createHeader1 (String textToHeader){
		if(textToHeader == null){
			throw new IllegalArgumentException();
		}
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("# ").append(textToHeader);
		return sb.toString();
	}
	
	public String createHeader2 (String textToHeader){
		if(textToHeader == null){
			throw new IllegalArgumentException();
		}
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("## ").append(textToHeader);
		return sb.toString();
	}
	
	public String createHeader6 (String textToHeader){
		if(textToHeader == null){
			throw new IllegalArgumentException();
		}
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("###### ").append(textToHeader);
		return sb.toString();
	}
	public String createHeader5 (String textToHeader){
		if(textToHeader == null){
			throw new IllegalArgumentException();
		}
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("##### ").append(textToHeader);
		return sb.toString();
	}
	public String createHeader4 (String textToHeader){
		if(textToHeader == null){
			throw new IllegalArgumentException();
		}
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("#### ").append(textToHeader);
		return sb.toString();
	}

	public String text;

	public String getText() {
		return text;
	}

	public void setText(String Text) {
		this.text = Text;
	}
	
	public String createHeader3(String Text)
	{
		if(Text == null || Text == "")
			throw new IllegalArgumentException("No valid input");
		else
			return Text;
	}
	
	

	private static final String HEADER = "######";
	
	public String createHeader(String string, int i) {
		if(i<0||i>HEADER.length()||string==null) throw new IllegalArgumentException();
		return HEADER.substring(0, i)+(string.length()>0?" "+string.trim():"");
	}

	public String createHeader1(String string) {
		return this.createHeader(string, 1);
	}

	public String createHeader2(String string) {
		return this.createHeader(string, 2);
	}

	public String createHeader3(String string) {
		return this.createHeader(string, 3);
	}

	public String createHeader4(String string) {
		return this.createHeader(string, 4);
	}

	public String createHeader5(String string) {
		return this.createHeader(string, 5);
	}

	public String createHeader6(String string) {
		return this.createHeader(string, 6);
	}
}
