package fileutils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputReader {

	private File file;
	private Scanner reader;

	public InputReader(File file) {
		this.file = file;		
	}

	public int[] convertStrings() {

		int[] returnable = new int[6];
		for (int i = 0; i < readStrings().length; i++) {
			returnable[i] = Integer.parseInt(readStrings()[i]);
		}
		return returnable;
	}

	private String[] readStrings() { // считать строки, разбить их, занести в массив
		
		try {
			reader = new Scanner(file, "UTF-8");
		} catch (FileNotFoundException e) {
			System.out.println("No input file found!");
			e.printStackTrace();
		}
										
		String[] tempStringArray = new String[6]; // временный массив считанных строк
													
		String s1 = reader.nextLine();
		String s2 = reader.nextLine();
		
		String[] str1 = s1.split("\\s+");
		String[] str2 = s2.split("\\s+");

		tempStringArray[0] = str1[0];
		tempStringArray[1] = str1[1];
		tempStringArray[2] = str1[2];
		tempStringArray[3] = str2[0];
		tempStringArray[4] = str2[1];
		tempStringArray[5] = str2[2];

		reader.close();
		return tempStringArray;
		
	}

}
