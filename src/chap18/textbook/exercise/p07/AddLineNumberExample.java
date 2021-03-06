package chap18.textbook.exercise.p07;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		String filePath ="src/chap18/textbook/exercise/p07/AddLineNumberExample.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		int lineNum = 0;
		while((line = br.readLine()) != null) {
			lineNum++;
			System.out.println(lineNum+":"+line);
		}
		
		br.close();fr.close();
	}

}
