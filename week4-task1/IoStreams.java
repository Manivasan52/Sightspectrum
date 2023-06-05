package task1;

import java.io.File;
import java.io.IOException;

public class IoStreams {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\SSLTP11395\\Desktop\\mani\\sightspectrum");
		File[]str=file.listFiles();
		for(File s:str)
		{
			if(s.isFile())
			{
				String fileName=s.getName();
				int lastIndex=fileName.lastIndexOf(".");
				String extension=fileName.substring(lastIndex+1);
				if(extension.equals("txt"))
					s.delete();
			}
		}
		file.delete();
File ReName=new File("C:\\Users\\SSLTP11395\\Desktop\\mani\\sightspectrum\\demo.txt");
boolean sucess=file.renameTo(ReName);
System.out.println("scuess"+sucess);
System.out.println("file name:"+file.getName());
		
		try {
	file.createNewFile();
	System.out.println("created text file");
} catch (IOException e) {
	e.printStackTrace();
}
		file.delete();
				file.exists();
		file.mkdirs();
		boolean created=true;
				created=file.exists();
		System.out.println("created "+created);
		if(created==false)
			System.out.println("folder created"+created);
		else
			System.out.println("false"+created);
		file.mkdir();
		if(created==true)
		System.out.println("folder created"+created);
	}

}
