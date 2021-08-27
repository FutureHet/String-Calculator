import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertEquals;

@Test

public class StringCalculatorTest {
	
	StringCalculator stringCalculator;
	
	@BeforeTest
	public void init() {
 		stringCalculator = new StringCalculator();
 	}

 	public void emptyString() {
 		// Equals Empty String with 0
 		assertEquals(stringCalculator.Add(""), 0);
 	}
 	
 	public void singleNumber() {
 		// Only single number contains 
 		assertEquals(stringCalculator.Add("1"), 1);
 		assertEquals(stringCalculator.Add("2"), 2);
 	}
 	
 	public void twoNumber() {
 		// String contains two numbers with ',' seperated
 		assertEquals(stringCalculator.Add("1,2"), 3);
 		assertEquals(stringCalculator.Add("2,3"), 5);	
 	}
 	
 	public void multipleNumbers() {
 		// String contains more than two numbers with ',' seperated
 		assertEquals(stringCalculator.Add("1,2,3"), 6);
 		assertEquals(stringCalculator.Add("2,3,4,5,6"), 20);	
 	}
 	
 	public void multipleNumbersWithNewLineDelimeter() {
 		// String contains more than two numbers with ',' and '\n' seperated
 		assertEquals(stringCalculator.Add("1\n2,3"), 6);
 		assertEquals(stringCalculator.Add("2,3\n4,5\n6"), 20);	
 	}
}
