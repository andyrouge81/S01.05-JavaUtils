package level2.exercise1L2.main;

import level2.exercise1L2.configLoader.ConfigLoader;
import level2.exercise1L2.directoryWriter.DirectoryWriter;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		if(args.length < 1){
			System.out.println("Please enter an argument with config.properties file.");
			return;
		}

		ConfigLoader config = new ConfigLoader(args[0]);

		String directoryPath = config.getDirectory();
		String outPutPath = config.getFile();

		System.out.println("Reading for the directory: "+directoryPath);
		System.out.println("Writing to file: "+outPutPath);

		File inputDirectory = new File(directoryPath);
		File outPutFile = new File(outPutPath);

		DirectoryWriter writer = new DirectoryWriter();
		writer.writeDirectory(inputDirectory,outPutFile);

		System.out.println("Success.");
	}
}
