package objectClass;

public class Student {
 int id;
 String name;
 double percentage;
public Student(int id, String name, double percentage) {
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
}
 @Override
 public int hashCode() {
	 return id;
 }
 @Override
 public String toString() {
	 return "  Name is " + name + " id is " + id + " percentage is " + percentage ;
 }
}
