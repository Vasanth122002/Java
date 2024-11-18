package javavideosonline;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

public class demo  {
	public static void main(String[] args) throws IOException {
	Hashtable ht = new Hashtable();
	Properties p = new Properties();
	FileInputStream f = new FileInputStream("C:\\Users\\WIN\\eclipse-workspace\\javavideos\\src\\menu.properties");
    p.load(f);
    String str = p.getProperty("nellai");
    System.out.println(str);
    p.setProperty("nellai", "2000");
    FileOutputStream o = new  FileOutputStream("C:\\Users\\WIN\\eclipse-workspace\\javavideos\\src\\menu.properties");
    p.store(o, "UPDATED VALUE");
    System.out.println(str);
	}
}