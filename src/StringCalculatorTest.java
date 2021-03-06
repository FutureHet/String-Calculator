import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
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
 		try {
			assertEquals(stringCalculator.Add(""), 0);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
 	}
 	
 	public void singleNumber() throws NegativeNumberException {
 		// Only single number contains 
 		assertEquals(stringCalculator.Add("1"), 1);
 		assertEquals(stringCalculator.Add("2"), 2);
 	}
 	
 	public void twoNumber() throws NegativeNumberException {
 		// String contains two numbers with ',' separated
 		assertEquals(stringCalculator.Add("1,2"), 3);
 		assertEquals(stringCalculator.Add("2,3"), 5);	
 	}
 	
 	public void multipleNumbers() throws NegativeNumberException {
 		// String contains more than two numbers with ',' separated
 		assertEquals(stringCalculator.Add("1,2,3"), 6);
 		assertEquals(stringCalculator.Add("2,3,4,5,6"), 20);	
 	}
 	
 	public void multipleNumbersWithNewLineDelimiter() throws NegativeNumberException {
 		// String contains more than two numbers with ',' and '\n' separated
 		assertEquals(stringCalculator.Add("1\n2,3"), 6);
 		assertEquals(stringCalculator.Add("2,3\n4,5\n6"), 20);	
 	}
 	
 	public void differentDelimiters() throws NegativeNumberException {
 		// Supports any delimiters which is given between "//" and "\n"
 		assertEquals(stringCalculator.Add("//;\n1;2;3"), 6);
 		assertEquals(stringCalculator.Add("//?\n2?3?4?5?6"), 20);	
 	 }
 	
 	public void negativeNumber() {
 		// Throws exception when negative number is given
 		try {
			stringCalculator.Add("-1,2,3");
		} catch (NegativeNumberException e) {
			assertEquals(e.getMessage(), "non-negative number expected but get : -1");
		}

 		try {
 			stringCalculator.Add("//?\n-2?3?4?5?6");
		} catch (NegativeNumberException e) {
			assertEquals(e.getMessage(), "non-negative number expected but get : -2");
		}
 	}
 	
 	public void multipleNegativeNumber() {
 		// Throws exception when negative number is given
 		try {
			stringCalculator.Add("-1,2,-3");
		} catch (NegativeNumberException e) {
			assertEquals(e.getMessage(), "non-negative number expected but get : -1, -3");
		}

 		try {
 			stringCalculator.Add("//?\n-2?3?-4?-5?-6");
		} catch (NegativeNumberException e) {
			assertEquals(e.getMessage(), "non-negative number expected but get : -2, -4, -5, -6");
		}
 	}
 	
 	public void numberGreaterThanThousand() throws NegativeNumberException {
 		// If any number present in the string is greater than 1000 then it should not be added to total sum
 		assertEquals(stringCalculator.Add("1,2,10000,3"), 6);
 	}
 	
 	public void singleDelimiterOfVariousLength() throws NegativeNumberException {
 		// Delimiter can have various length
 		assertEquals(stringCalculator.Add("//[***]\n1***2"), 3);
 		assertEquals(stringCalculator.Add("//[??]\n1??2??3"), 6);
 	}
 	
 	public void multipleDelimiterOfVariousLength() throws NegativeNumberException {
 		// Delimiter can have various length
 		assertEquals(stringCalculator.Add("//[***][\\]\n1***2\\3"), 6);
 		assertEquals(stringCalculator.Add("//[??][@@@]\n1??2??3@@@2"), 8);
 	}
 	
 	@AfterTest
 	public void numberOfTimesAddCalled() {
 		// Number of times Add called
 		assertEquals(stringCalculator.GetCalledCount(), 20);
 	}
}
