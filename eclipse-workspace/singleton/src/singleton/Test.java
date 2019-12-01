package singleton;

public class Test {
public static void main(String[] args) {
	MySingleton ms = new MySingleton.getDbConnection();
	ms.s = "hello";
	System.out.println(" hashcode of ms "+ms.hashCode());
	MySingleton mx = new MySingleton.getDbConnection();
	mx.s =" hi ";
	System.out.println(" hashcode of mx "+mx.hashCode());
}
}
