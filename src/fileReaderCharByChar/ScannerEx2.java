package fileReaderCharByChar;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx2
{

	public static void main(String[] args) throws IOException
	{
		File dataFile = new File("C:\\test\\TestFile.txt");
		FileReader fr = null;
		BufferedReader br = null;
		Scanner sc = null;
		
		Double sum = 0D;
		
		try {
			fr = new FileReader(dataFile);
			br = new BufferedReader(fr);
			sc = new Scanner(br);
			
			while(sc.hasNext()) {
				if(sc.hasNextDouble()){
					sum += sc.nextDouble();
				}else {
					System.out.println(sc.next());
				}
			}
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		System.out.println("Total SUM: "+sum);

	}

}
