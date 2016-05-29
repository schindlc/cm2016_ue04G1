package at.fhj.swd.confmana.md;

import java.util.List;

import at.fhj.swd.confmana.md.manipulate.ListHelper;
//import at.fhj.swd.confmana.md.manipulate.HeadingHelper;
//import at.fhj.swd.confmana.md.manipulate.LinkHelper;
//import at.fhj.swd.confmana.md.manipulate.ListHelper;
import at.fhj.swd.confmana.md.manipulate.MiscHelper;
import at.fhj.swd.confmana.md.manipulate.QuotingHelper;
import at.fhj.swd.confmana.md.manipulate.StyleHelper;


/**
 * The purpose of this class is to ease the creation of markdown documents
 * It provides certain static methods which can be called to format a string
 * as a markdown which will then be rendered as such. 
 * @author cschindler
 *
 */
public class MarkdownTextEnhancer {

	// Members must be instantiated
	
	private static HeadingHelper headingHelper;
	private static createHeader headingHelper;
	private static LinkHelper linkHelper;
	private static ListHelper listHelper;
	private static MiscHelper miscHelper;
	private static QuotingHelper quotingHelper;
	private static StyleHelper styleHelper;
	
	// Link operation
	
	/**
	 * please add a meaningful documentation for this method
	 * @param linkDescription ... what is this?
	 * @param url ... what is that?
	 * @return ... what is returned?
	 */
	public static String createMdLink(String linkDescription, String url) {
		return linkHelper.createMdLink(linkDescription, url);
	}
	
	// List operations
	
	public static String createOrderedList(List<String> listItems){
		// insert meaning full code
				return null;
	}
	
	public static String createUnOrderedList(List<String> listItems){
		// insert meaning full code
				return null;
	}

	public static String createNestedList(List<String> listItems, int intendLevel) {
		ListHelper lh = new ListHelper();
			return lh.toString();
	}
	
	public static String makeListNested(String markdownListString, int intendLevel){
		// insert meaning full code
				return null;
	}

	public static String createTaskList(List<String>listItems){
		// insert meaning full code
		if(listItems == null){
			throw new IllegalArgumentException();
		}else{
			return ListHelper.createTaskList(listItems);
		}
	}
	
	// Quoting operations
	public static String quoteTextLine(String quoteTextLine){
			return quoteTextLine;
	}
	
	public static String quoteCodeLine(String codeLineToQuote){
		return QuotingHelper.quoteCodeLine(codeLineToQuote);
	}
	
	public static String quoteCodeBlock(String codeBlockToQuote){
		// insert meaning full code
				return null;
	}
	
	// Header operations
	public static String createHeader1(String textToHeader){
		// insert meaning full code
	if(headingHelper == null){
		headingHelper = new HeadingHelper();
	}
		
				return headingHelper.createHeader1(textToHeader);
	}
	
	public static String createHeader2(String textToHeader){
		// insert meaning full code
				return null;
	}
	
	public static String createHeader3(String textToHeader){
				return "### " + textToHeader;
	}
	
	public static String createHeader4(String textToHeader){
		if(headingHelper == null){
			headingHelper = new HeadingHelper();
		}
			
					return headingHelper.createHeader4(textToHeader);
	}
	
	public static String createHeader5(String textToHeader){
		if(headingHelper == null){
			headingHelper = new HeadingHelper();
		}
			
					return headingHelper.createHeader5(textToHeader);
	}
	
	public static String createHeader6(String textToHeader){
		if(headingHelper == null){
			headingHelper = new HeadingHelper();
		}
			
					return headingHelper.createHeader6(textToHeader);
	}
	
	// Style operations
	
	public static String makeBold(String textLineToMakeBold){
		// insert meaning full code
				return null;
	}
	
	public static String makeItalic(String textLineToMakeItalic){
		return StyleHelper.makeItalic(textLineToMakeItalic);
	}
	
	public static String makeStrikeThrough(String textLineToStrikeThrough){
		return StyleHelper.makeStrikeThrough(textLineToStrikeThrough);
	}
	
	// Misc operations
	
	public static String reverseString(String textToinverse){
		return null;
	}
	
	public static String CapitalizeString(String textToCapoitalize){
		return null;
	}
	
	public static String rot13(String textToRot13){
		return null;
	}
	
	
}
