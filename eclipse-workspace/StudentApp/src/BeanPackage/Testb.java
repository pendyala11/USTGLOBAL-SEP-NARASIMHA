package BeanPackage;

public class Testb {

	public static void main(String[] args) {
	          
		
		Employee e = new Employee();
		e.setId(1);
		e.setSalary(240000.6778);
		
		Database1 db1 = new Database1();
		db1.save(e);
		
	
}

}
