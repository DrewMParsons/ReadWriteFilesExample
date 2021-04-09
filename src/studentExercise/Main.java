package studentExercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	
	//DONE: get input from student: 
  	//DONE: create name,id,courses,gpag/set for above and constructor
  	//DONE: set values to set and retrieve with get
  	//DONE: store data into a file using any JAVA i/o api
  	//DONE: get data from console
	
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		Student student1 = new Student();
		getStudentFromConsoleInput(student1);
		String studentFilePath = createStudentFileFromStudentID(student1.getId());
		if(studentFilePath != null) {
			writeStudentToFile(student1, studentFilePath);
		}
		else {
			System.out.println("You messed something up. Time to go back to school");
		}
		
		
		
	}

	private static void writeStudentToFile(Student student1, String studentFilePath) throws IOException
	{
		
			FileWriter fw = new FileWriter(studentFilePath);
			fw.write("\nStudent Name: "+ student1.getName());
			fw.write("\nStudent ID: "+ student1.getId());
			fw.write("\nStudent course: "+ student1.getCourse());
			fw.write("\nStudent gpa: "+ student1.getGpa());
			System.out.println("Student information added to file");
			fw.close();
	}

	private static String createStudentFileFromStudentID(String studentID)
	{
		try {
		File studentFile = new File("C:\\test\\StudentFile_"+studentID+".txt");
		if(studentFile.createNewFile())
		{
			System.out.println("New student file created: "+studentFile.getName());
			return studentFile.getAbsolutePath();
			
		}else {
			System.out.println("File already exists");
			return studentFile.getAbsolutePath();
		}
		}catch(IOException e) {
			System.out.println(e);
			return null;
		}
		
	}

	private static void getStudentFromConsoleInput(Student s1) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean isValueANumber = false;
		System.out.println("Welcome to the most amazing student file writer ever");
		System.out.println("Please enter the Students full name(first last): \n");
		s1.setName(br.readLine());
		System.out.println("Please enter the Students 6 digit ID number: \n");
		s1.setId(br.readLine());
		System.out.println("Please enter the Students course name: \n");
		s1.setCourse(br.readLine());
		System.out.println("Please enter the Students gpa: \n");
		
		while(!isValueANumber) {
		try {
			s1.setGpa(Double.valueOf(br.readLine()));
			isValueANumber= true;
		}catch(NumberFormatException e) {
			System.out.println("THIS IS NOT A NUMBER. Please enter the Students gpa: \n");
		}
		}
	}

}
