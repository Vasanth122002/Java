package RealCodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class FileOperation {
	public void fileop() throws IOException {
//File file = new File("C:\\Users\\WIN\\Vasanth\\vasanthm.txt");
//File newfile = new File("C:\\Users\\WIN\\Vasanth\\v.txt");
//boolean present = file.exists();
//if(present == false) {
//	boolean created = file.createNewFile();
//}
//file.delete();
//file.renameTo(newfile);
//System.out.println(newfile.getName());
//System.out.println(newfile.canRead());
//System.out.println(newfile.canExecute());
//System.out.println(newfile.canWrite());
//System.out.println(newfile.getAbsolutePath());
//System.out.println(newfile.getParent());
//System.out.println(newfile.getPath());
//System.out.println(newfile.getTotalSpace());
//System.out.println(newfile.lastModified());
//File allfiles = new File("C:\\Users\\WIN");
//File []filelist = allfiles.listFiles();
//String []listoffiles = allfiles.list();
//for(int i=0;i<listoffiles.length;i++ ) {System.out.println(listoffiles[i]);}
//for(File f :filelist  ) {
//	if(f.isFile())
//	System.out.println(f);
//	}
//File f = new File("C:\\Users\\WIN\\Desktop");
//File[]fa = f.listFiles();
//for(File fi : fa) { 
//	String filename = fi.getName();
//	int index = filename.lastIndexOf('.');
//	String extension = filename.substring(index+1);
//	if(extension.equals("txt")) {
//	 System.out.println(filename);
//	 System.out.println(fi.length());
//	}
//	}   
		File fil = new File("C:\\Users\\WIN\\Desktop\\vasa.txt");
		fil.createNewFile();
		File file = new File("C:\\Users\\WIN\\Desktop\\vasanth.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file,true);// true means append to the file.
		writer.write("hi this is vasanth");
		writer.flush();
		writer.close();
		FileReader reader = new FileReader(file);
		int out = 0;
//		while(out != -1) {
//		 out = reader.read();
//		 System.out.print((char)out);
//		}
	char[] ch = new char[(int)file.length()];
	reader.read(ch);
	for(char c : ch)System.out.print(c);
	InputStream input = new FileInputStream("C:\\Users\\WIN\\Desktop\\vasanth.txt");
	OutputStream output = new FileOutputStream("C:\\Users\\WIN\\Desktop\\vasa.txt");
	int content = input.read();
	while(content != -1) {
		output.write(content);
		content = input.read();
	}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOperation obj = new FileOperation();
		obj.fileop();
	}

}
