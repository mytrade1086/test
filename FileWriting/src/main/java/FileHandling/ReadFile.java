package FileHandling;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;

import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		File fl = new File("H:\\TstArea\\filetoread.txt");

		FileReader fr = new FileReader(fl);

		BufferedReader br = new BufferedReader(fr);

		System.out.println(br.readLine());
		
		String line=null;
				
				while (line!=br.readLine()) {
					
					System.out.println(br.readLine());
					
					
				}
				
			
	

	}

}
