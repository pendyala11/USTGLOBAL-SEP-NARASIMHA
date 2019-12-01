package exception;

public class Validator {

	
	public void verify(int i) {
		// TODO Auto-generated method stub
		if(age<18) {
			throw new UncheckedException();
		}
	}

}
