package Collections;

class Student implements Comparable<Student>{

	int id;
	String name;
	int Percentage;
	
	public Student(int id, String name, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.Percentage = percentage;
	}

	@Override
	public int compareTo(Student s) {
		String p =this.name;
		String q = s.name;
		return p.compareTo(q);
	}
}
