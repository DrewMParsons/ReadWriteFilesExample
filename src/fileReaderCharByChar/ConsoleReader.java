package fileReaderCharByChar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: \n");
		String name =br.readLine();
		System.out.println("hello "+ name);
				
				
		

	}

}
