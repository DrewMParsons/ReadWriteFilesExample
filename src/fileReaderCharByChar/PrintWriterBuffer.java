package fileReaderCharByChar;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterBuffer 
{

	public static void main(String[] args) 
	{
		FileReader fr = null;
		BufferedReader br= null;
		PrintWriter pw= null;
		try
		{
			fr = new FileReader("C:\\test\\TestFile.txt");
			br =  new BufferedReader(fr);
			pw = new PrintWriter("C:\\\\test\\printWriter.txt");
			String textLine;
			while((textLine =br.readLine())!=null) {
				
				//Print handles the data and converts to a string
				//numbers are printed as numbers, not treated as ASCII val of a character
				pw.println(textLine);
				//write handles 1 character at a time(as int ASCII val)
				//pw.write(textLine);
			}
			
			
			
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
				br.close();
				pw.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
