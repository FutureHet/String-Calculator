public class AdditionOfNumbers{
	public static int Sum(String inputString) {

		int sum = 0;
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
			
			sum += extractedNumber;

			if(stringEnded == 1) {
				break;
			}
		}

		return sum;
	}
}