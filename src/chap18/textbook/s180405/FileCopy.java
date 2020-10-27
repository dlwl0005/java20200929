package chap18.textbook.s180405;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) throws Exception{
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		FileWriter fw = new FileWriter(des);
		FileReader fr = new FileReader(src);
		int data;
		while ((data = fr.read()) != -1) {
			fw.write(data);
		}
		
		fw.close();
		fr.close();
 }

}
