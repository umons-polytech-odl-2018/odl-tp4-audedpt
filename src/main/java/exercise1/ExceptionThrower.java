package exercise1;
import	java.lang.RuntimeException;


public class ExceptionThrower {
	void throwACustomExceptionWhenValueIs42(int value)
	throws MyException
	{
		if (value == 42){
			throw new MyException();
		}
	}
}
