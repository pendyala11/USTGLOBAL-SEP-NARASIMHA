package lambdaExpressions;

public class TestMultiply {

	public static void main(String[] args) {
		multipleinterface multiply =(a,b)->a*b;
int product =multiply.multiply(20,10);
System.out.println("product is "+product);
	}

}
