package level1.exercise4;

import java.io.*;

public class ReadTxtFile {

    public static void main(String[] args) {

		if(args.length == 0){
			System.out.println("You enter an argument.");
			return;
		}
        File file = new File(args[0]);
		if (!file.isDirectory()){
			System.out.println("No such directory");
		}

		readTxt(file);

    }


    public static void readTxt(File fileNew){

		if(!fileNew.exists() ){
			System.out.println("Error, not file found");
			return;
		}

        if(!fileNew.canRead()){
			System.out.println("Error, file cannot access...");
		}


		if(!fileNew.getName().endsWith(".txt")) {
			System.out.println("Error. Wrong extension file.");
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(fileNew))){

			String readingFile;

			while((readingFile = reader.readLine()) != null){

				System.out.println(readingFile);

			}

		}catch (IOException e) {

			System.out.println("Error reading file..."+e.getMessage());

		}
    }
}
