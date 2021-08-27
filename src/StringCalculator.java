public class StringCalculator {

	private int NUMBER_OF_TIMES_CALLED = 0;

	public int Add(String inputString) throws NegativeNumberException {
		
		int sum = 0;
		NUMBER_OF_TIMES_CALLED++;
		
		if(inputString.length() == 0) {
			
			sum = 0;
			return 0;
			
		} else {
			
			String proccessedString = InputPreprocessing.Preprocessing(inputString); 
			sum = AdditionOfNumbers.Sum(proccessedString);
		}
		
		return sum;
	}
	
	public int GetCalledCount() {
		System.out.println(NUMBER_OF_TIMES_CALLED);
		return NUMBER_OF_TIMES_CALLED;
	}
}
