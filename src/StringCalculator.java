public class StringCalculator {

	public int Add(String inputString) {
		
		int sum = 0;
		
		if(inputString.length() == 0) {
			
			sum = 0;
			return 0;
			
		} else {
			
			String proccessedString = InputPreprocessing.Preprocessing(inputString); 
			sum = AdditionOfNumbers.Sum(proccessedString);
		}
		
		return sum;
	}
}
