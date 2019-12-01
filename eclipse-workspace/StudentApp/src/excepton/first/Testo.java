package excepton.first;

public class Testo {

	public static void main(String[] args) {
		Paytm p = new Paytm();
		try
		{
			p.book();
		}
		catch(Exception A)
		{
			System.out.println(A);
		}
		finally
		{
			System.out.println(" executing finally  ");
		}
		System.out.println(" main ended ");
	}
}