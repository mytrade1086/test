package FileHandling;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

 public class FileWritertest {

	public static void main(String[] args) throws IOException {
		
		
		File fl=new File("H:\\TstArea\\filewriter.txt");
		
		FileWriter fw=new FileWriter(fl,false);
		
		BufferedWriter bfw=new BufferedWriter(fw);
		
		bfw.write("sumit");
		bfw.newLine();
		bfw.write("neha");
		bfw.close();
		
		
		
		
	}

}
