package BeanPackage;

public class TestA {

	public static void main(String[] args) {
		BeanClass c = new BeanClass();
		c.setId(12);
		c.setName("shivagami");
        c.setRollNo(123);
        
        Database db = new Database();
        db.receive(c);
	}
}
