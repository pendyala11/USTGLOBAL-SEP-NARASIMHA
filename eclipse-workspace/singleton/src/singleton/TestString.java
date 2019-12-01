package singleton;

public class TestString {

	public static void main(String[] args) {
		MyString ms = new MyString(12,"renu");
		
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);

	}

}
