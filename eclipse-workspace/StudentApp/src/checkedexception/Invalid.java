package checkedexception;

public class Invalid extends Exception{
private String message ="Daily limit is 50000";
@Override
public String getMessage() {
	return message;
}

}
