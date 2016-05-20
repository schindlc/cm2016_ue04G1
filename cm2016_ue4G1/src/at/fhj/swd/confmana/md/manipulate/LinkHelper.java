package at.fhj.swd.confmana.md.manipulate;

public class LinkHelper {

	public String createMdLink(String desc, String url) {
		if(desc==null||url==null) throw new IllegalArgumentException();
		return "["+desc+"]("+url+")";
	}

}
