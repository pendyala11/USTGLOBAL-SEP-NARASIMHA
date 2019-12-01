package lambdaExpressions;

public class GreetM implements greetMessage {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greetMessage greet =()->{
			System.out.println("happy");
			System.out.println("birthday");
		};
	}

	@Override
	public String greet() {
		return greet;
	}

}
