package checkedexception;

public class TestAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" main started ");
ValidateAmount va = new ValidateAmount();
try {
	va.checkAmount(60000);
	System.out.println(" withdraw cash");
}
catch(Invalid i)
{
	System.err.println(i.getMessage());
}
	}

}
