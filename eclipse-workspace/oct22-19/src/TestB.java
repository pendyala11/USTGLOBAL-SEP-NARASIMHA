
public class TestB {
	static int a =25;
	int x;
	public static void add() {
		//only fianl access modifer is supported for local modifier
	final int a=10;
		int b=20;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		add();
		TestB t = new TestB();
		System.out.println(t.x);
		System.out.println(a);
	}
		

}
