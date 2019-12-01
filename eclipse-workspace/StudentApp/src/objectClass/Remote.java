package objectClass;

public class Remote {
	 void add(){
		  System.out.println(" add method  ");
	  }
	public static void main(String[] args) {

	Remote r = new Remote();
	class c = r.getClass();
	Object o = c.newInstance();
	Remote q = (Remote)o;
	q.add();
		
	}

}
