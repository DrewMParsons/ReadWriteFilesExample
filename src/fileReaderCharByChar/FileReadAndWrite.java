package fileReaderCharByChar;

import java.io.FileReader;
import java.io.FileWriter;


public class FileReadAndWrite
{

	public static void main(String[] args)
	{
		try {
		FileReader fr = new FileReader("C:\\test\\TestFile.txt");
		FileWriter fw = new  FileWriter("C:\\test\\TestFile1.txt",true);
		int i  ;
		while((i=fr.read())!=-1) {
			fw.write((char)i);
		}
		System.out.println("done");
		fr.close();
		fw.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		

	}

}
