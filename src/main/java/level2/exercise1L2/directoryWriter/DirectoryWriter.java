package level2.exercise1L2.directoryWriter;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DirectoryWriter {

	public void writeDirectory(File directory, File outFile){

		Comparator<File> comparation = new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				return o1.getName().compareTo(o2.getName());

			}
		};

		if(!directory.exists() || !directory.isDirectory()){
			System.out.println("No such directory.");
			return;
		}

		try(BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))){

			DirectoryWriter.recursiveDirectoryList(directory, comparation,  1, writer);

		}catch (IOException e){
			System.out.println("Error writing file..."+e.getMessage());
		}
	}




	public static void recursiveDirectoryList(File directories, Comparator<File> comparator, int level, BufferedWriter writer) throws IOException {


		if (directories.exists() && directories.isDirectory()) {
			File[] file1 = directories.listFiles();

			if (file1 == null) return;


			List<File> listComplete = new ArrayList<>(Arrays.asList(file1));
			Collections.sort(listComplete, comparator);

			for (File fileType : listComplete) {
				Date lastdate = new Date(fileType.lastModified());

				if (fileType.isDirectory()) {

					writer.write("  ".repeat(level)+ "D:" +fileType.getName()+" "+lastdate);
					writer.newLine();

					recursiveDirectoryList(fileType, comparator, level+1, writer);

				} else if (fileType.isFile()) {

					writer.write("  ".repeat(level)+" F : "+fileType.getName()+" "+lastdate);
					writer.newLine();

				}
			}
		}
	}
}
