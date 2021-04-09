package studentExercise;



public class Student
{
	//Instance Variables
	private String name;
	private String id;
	private String course;
	private double gpa;
	
	//Constructors
	public Student()
	{
		super();
	}
	
	
	public Student(String name, String id, String course, double gpa)
	{
		super();
		this.name = name;
		this.id = id;
		this.course = course;
		this.gpa = gpa;
	}

	

	//Getters & Setters
	protected String getName()
	{
		return name;
	}

	protected void setName(String name)
	{
		this.name = name;
	}

	protected String getId()
	{
		return id;
	}

	protected void setId(String id)
	{
		this.id = id;
	}

	protected String getCourse()
	{
		return course;
	}

	protected void setCourse(String course)
	{
		this.course = course;
	}

	protected double getGpa()
	{
		return gpa;
	}

	protected void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	
	
	
	
	

}
