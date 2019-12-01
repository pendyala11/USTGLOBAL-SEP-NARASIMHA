package exception;

public class UncheckedException  extends RuntimeException{
private String message="Invalid Age";
@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}
