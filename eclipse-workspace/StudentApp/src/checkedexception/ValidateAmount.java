package checkedexception;

public class ValidateAmount  {
void checkAmount(int amount) throws Invalid
{
	if(amount> 50000)
	{
		throw new Invalid();
	}
}
}
