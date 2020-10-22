package overloading;

public class Student {
	private String name;
	private String id;
	private double grade;
	public Student(String name, String id, double grade) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	public Student(String name, String id) {
		//super(name,id,grade);
		super();
		this.name = name;
		this.id = id;
	}
	public Student(String id) {
		super();
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String display()
	{
		return("name:"+name+"id:"+id+"grade"+grade);
	}
	public String display(int year)
	{
		this.display();
		return("year:"+year);
	}
}
