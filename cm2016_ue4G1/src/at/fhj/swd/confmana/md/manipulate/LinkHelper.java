package at.fhj.swd.confmana.md.manipulate;

public class LinkHelper {
	/**
	 * Create Markdown Link
	 * @param desc	Link Description
	 * @param url	URL
	 * @return String markdown syntax
	 *         {@link IllegalArgumentException} if either 'desc' or 'url' is null.
	 */
	public String createMdLink(String desc, String url) {
		if(desc == null) {
			throw new IllegalArgumentException("Description missing!");
		}
		if(url == null) {
			throw new IllegalArgumentException("URL missing!");
		}
		return "[" + desc + "](" + url + ")";
	}
}
