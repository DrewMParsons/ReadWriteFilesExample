package fileReaderCharByChar;

import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterDemoOne
{

	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new  FileWriter("C:\\test\\TestFile.txt",true);
			fw.write("new stuff added on Thursday morning\r");
			fw.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
