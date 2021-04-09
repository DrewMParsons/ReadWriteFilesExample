package channelDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import javax.imageio.stream.IIOByteBuffer;

public class FileChannelDemo
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\test\\TestFile2.txt");
		FileChannel fileChannel = fis.getChannel();
		long fileSize = fileChannel.size();
		ByteBuffer buffer = ByteBuffer.allocate((int)fileSize);
	
		//read data to buffer, and return int of amount bytes read
		int bytesRead = fileChannel.read(buffer);
		String s= "";
		if(bytesRead !=0) {
			buffer.flip();
			buffer.clear();             
			while(buffer.hasRemaining()) {
				//System.out.print((char)buffer.get());
				s = String.valueOf((char)buffer.get());
			}
			System.out.println(s);
		}
	
		
		
		

	}

	
	
	
	
	
	
	//Just some info on creating a file channel
	private static void extracted() throws FileNotFoundException, IOException
	{
		// need to open a filechannel before using it
		//cannot open directly, but via InputStream/outputStream,RandomAccessFIle, file,Path, etc
		FileInputStream fis = new FileInputStream("data.txt");
		FileChannel inChannel = fis.getChannel();
		
		//to read from filechannel,u call read() after creating a buffer
		ByteBuffer buff = ByteBuffer.allocate(48);
		//returns how many bytes were written in to buffer. -1 is end of file
		int bytesRead = inChannel.read(buff);
	}

}
