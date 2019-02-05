/**
 * 
 * @author Ashton O'Connor per.3a
 * 
 */
/**
	 * +1 for declaring header
	 * 

	 *  
	 * @param minLen
	 * @param maxLen
	 * @param symbol
	 *        
	 * +1 for declaring private variables
	 */

public class CodeWordChecker implements StringChecker {  
	
	
	private int minLength;
	private int maxLength;
	private String notAllowed;
	
	
	
	
	/**
	 * +1 for declaring CodeWordChecker headers
	 * +2 for initializing variables in both constructors
	 * @param str
	 * @return
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public CodeWordChecker (int minLen, int maxLen, String symbol) {
		minLength = minLen;
		maxLength = maxLen;
		notAllowed = symbol;
	}
	
	public CodeWordChecker (String symbol) {
		minLength = 6;
		maxLength = 20;
		notAllowed = symbol;
	}
	
	
	/**
	 * +1 for declaring header 
	 * +1 for str.length() >= minLength && str.length() <= maxLength
	 * +1 for str.indexOf(notAllowed)
	 * +1  == -1; which returns true or false
	 */
	public boolean isValid (String str) {
		
		System.out.println(str.length() >= minLength && str.length() <= maxLength && str.indexOf(notAllowed) == -1);
		return str.length() >= minLength && str.length() <= maxLength && str.indexOf(notAllowed) == -1;
		
	}
	
	
	
	
}
