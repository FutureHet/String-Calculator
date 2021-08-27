public class NegativeNumberException extends Exception {

   public NegativeNumberException(String message) {
      super(message);
   }

   public static NegativeNumberException ThrowExceptionCall(int negativeNumber) {
   	return new NegativeNumberException("non-negative number expected but get : " + negativeNumber);
   }
}
