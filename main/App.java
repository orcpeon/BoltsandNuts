package main;

import java.io.File;

import entities.ItemCreator;
import fileutils.InputReader;
import fileutils.OutputWriter;
import logic.Calculator;

public class App {

	public static void main(String[] args) {

		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");
		InputReader inReader = new InputReader(inputFile);
		ItemCreator creator = new ItemCreator(inReader);
		Calculator calc = new Calculator(creator.createItems());
		OutputWriter ouWriter = new OutputWriter();
		ouWriter.writeToFile(calc, outputFile);
		
	}

}
