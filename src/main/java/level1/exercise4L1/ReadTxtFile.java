package level1.exercise4L1;

import java.io.*;

public class ReadTxtFile {

    public static void main(String[] args) {

        File file = new File(args[0]);

		readTxt(file);

    }


    public static void readTxt(File fileNew){

        if(fileNew.canRead() && fileNew.isFile() && fileNew.getName().endsWith(".txt")){

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
}
