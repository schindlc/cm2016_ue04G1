package at.fhj.swd.confmana.md.manipulate;

public class HeadingHelper {
	
	public HeadingHelper()
	{	
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
