
public class App {
	public static void main(String[] args) {
/*what kind of exceptions are there in java?
 * Thread.sleep(111) throws a checked example that must be handled
 * unchecked exceptions or runtime exceptions do not have to be handled
 * int value = 7; 
 * value = value/0;
 * still compiles so does not have to be handled
 * Null pointer Exceptions is when there is a variable that is not referencing anything
 * 
 */
		//example of null pointer exception
		String text = null;
  System.out.println(text.length());
		//runtime exception, not forced to handle it
		
		String[] texts = {"one", "two", "Three"};
		try {
			System.out.println(texts[3]);
		}
		//exception that catches fundamental flaws
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		
		
	}
}
