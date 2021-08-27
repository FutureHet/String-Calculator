public class AdditionOfNumbers{
	public static int Sum(String inputString) throws NegativeNumberException {

		int sum = 0;
		String negativeNumbers = "";
		int indexOfDel = inputString.indexOf(',');

		while(indexOfDel != -1 || inputString.length()!=0) {
		
			int extractedNumber, stringEnded = 0;
		
			if(indexOfDel == -1)  {
		
				extractedNumber = Integer.parseInt(inputString);
				stringEnded = 1;
		
			} else {
		
				String startingNumber = inputString.substring(0, indexOfDel);
				inputString = inputString.substring(indexOfDel+1);
				indexOfDel = inputString.indexOf(',');	
				extractedNumber = Integer.parseInt(startingNumber);
		
			}
			
			if(extractedNumber < 0) {
				if(negativeNumbers.length() != 0) {
					negativeNumbers = negativeNumbers + ", " + extractedNumber;
				} else {
					negativeNumbers += extractedNumber;
				}
			} else if (extractedNumber <= 1000) {
				sum += extractedNumber; 
			}

			
			if(stringEnded == 1) {
				break;
			}
		}

		return sum;
	}
}