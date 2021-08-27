public class StringCalculator {

	public int Add(String inputString) {
		
		int sum = 0;
		
		if(inputString.length() == 0) {
			
			sum = 0;
			return 0;
			
		} else {
			
			
			int indexOfDel = inputString.indexOf(',');
			
			if(indexOfDel == -1) {
			
				sum = Integer.parseInt(inputString);
			
			} else {
				
				sum = AdditionOfNumbers.Sum(inputString);
				
			}

		}
		
		return sum;
	}
}
