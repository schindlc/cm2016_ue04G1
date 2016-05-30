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
	
}
