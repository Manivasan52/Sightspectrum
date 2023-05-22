package task3;
class myCustomException extends Exception
{
	
}
public class CustomException {
public static void main(String[] args) {
	try
	{
		throw new myCustomException();
		}
	catch(myCustomException e)
	{
		System.out.println("caught the exception");
		System.out.println(e.getMessage());
	}
	System.out.println("end of the code");
}
}
