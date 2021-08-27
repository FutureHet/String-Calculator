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
 	
}
