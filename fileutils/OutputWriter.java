package fileutils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import logic.Calculator;

public class OutputWriter {


	public void writeToFile(Calculator calc, File file) {
		try {
			FileWriter writer = new FileWriter(file);
			writer.write(calc.calculateSumLost());
			writer.close();
		} catch (IOException e) {
			System.out.println("Unexcpected exception!");
			e.printStackTrace();
		}
	}

}
