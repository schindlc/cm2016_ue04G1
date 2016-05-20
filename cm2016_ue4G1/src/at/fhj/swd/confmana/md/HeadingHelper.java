package at.fhj.swd.confmana.md;

public class HeadingHelper {
	public String createHeader1 (String textToHeader){
		if(textToHeader == null){
			throw new IllegalArgumentException();
		}
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("# ").append(textToHeader);
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
}
