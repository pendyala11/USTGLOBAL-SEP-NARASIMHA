package exception;

public class TestAge {

	public static void main(String[] args) {
		System.out.println(" main started ");
		Validator v = new Validator();
		try
		{
		v.verify(20);
		}
		catch(UncheckedException ue) {
			
		}
	}

}
