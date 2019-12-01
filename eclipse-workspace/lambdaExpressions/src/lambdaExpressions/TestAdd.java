package lambdaExpressions;

public class TestAdd implements AddInterface {

	public int add(int a, int b) {
		// TODO Auto-generated method stub
return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAdd t1 = new TestAdd();
		int sum = t1.add(12, 20);
				System.out.println("sum is "+sum);
	}

}
