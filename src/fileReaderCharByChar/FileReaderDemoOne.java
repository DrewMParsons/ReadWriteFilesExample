package fileReaderCharByChar;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemoOne
{

	public static void main(String[] args)
	{
		
		try
		{
			FileReader fr = new FileReader("C:\\test\\TestFile.txt");
			//use  read to  return a char in  ASCII form
			//System.out.println(fr.read());
			//System.out.println((char)fr.read());
			
			//create loop to read all char from file (read returns -1 for end of stream)
			
			//you need to create the var here bcs the read function will read and move on to next value,  so without it
			//you will only get every  other character       
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			
			fr.close();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
