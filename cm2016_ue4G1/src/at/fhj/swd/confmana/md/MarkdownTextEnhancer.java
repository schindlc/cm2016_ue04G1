package at.fhj.swd.confmana.md;

import java.util.List;

import at.fhj.swd.confmana.md.manipulate.createHeader;
import at.fhj.swd.confmana.md.manipulate.LinkHelper;
import at.fhj.swd.confmana.md.manipulate.ListHelper;
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
	public static String createMdLink(String linkDescription, String url){
		// insert meaning full code
		return null;
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
	
	public static String createNestedList(List<String>listItems, int intendLevel){
		// insert meaning full code
				return null;
	}
	
	public static String makeListNested(String markdownListString, int intendLevel){
		// insert meaning full code
				return null;
	}

	public static String createTaskList(List<String>listItems){
		// insert meaning full code
				return null;
	}
	
	// Quoting operations
	public static String quoteTextLine(String textLineToQuote){
		// insert meaning full code
				return null;
	}
	
	public static String quoteCodeLine(String codeLineToQuote){
		// insert meaning full code
				return null;
	}
	
	public static String quoteCodeBlock(String codeBlockToQuote){
		// insert meaning full code
				return null;
	}
	
	// Header operations
	public static String createHeader1(String textToHeader){
		// insert meaning full code
				return null;
	}
	
	public static String createHeader2(String textToHeader){
		// insert meaning full code
				return null;
	}
	
	public static String createHeader3(String textToHeader){
				return "### " + textToHeader;
	}
	
	public static String createHeader4(String textToHeader){
		// insert meaning full code
				return null;
	}
	
	public static String createHeader5(String textToHeader){
		// insert meaning full code
				return null;
	}
	
	public static String createHeader6(String textToHeader){
		// insert meaning full code
				return null;
	}
	
	// Style operations
	
	public static String makeBold(String textLineToMakeBold){
		// insert meaning full code
				return null;
	}
	
	public static String makeItalic(String textLineToMakeItalic){
		// insert meaning full code
				return null;
	}
	
	public static String makeStrikeThrough(String textLineToStrikeThrough){
		// insert meaning full code
				return null;
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
