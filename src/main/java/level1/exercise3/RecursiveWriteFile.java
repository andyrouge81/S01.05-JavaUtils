package level1.exercise3;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class RecursiveWriteFile {

    public static void main(String[] args)  {
        int level = 0;
        File files = new File(args[0]);

        Comparator<File> comparation = new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());

            }
        };
		File outPutPath = new File("resources/outPutList.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outPutPath))) {


            RecursiveWriteFile.recursiveDirectoryList(files, comparation, level + 1, writer);

            System.out.println("The file has been created in the path: "+new File(".").getCanonicalPath());

        } catch (IOException io) {

            System.out.println("Error writing the file..."+io.getMessage());

        }

    }


    public static void recursiveDirectoryList(File directories, Comparator<File> comparator, int level, BufferedWriter writer) throws IOException {

            if (directories.exists() && directories.isDirectory()) {
                File[] files = directories.listFiles();

                if (files == null) return;
                List<File> listComplete = new ArrayList<>(Arrays.asList(files));


                Collections.sort(listComplete, comparator);

                for (File fileType : listComplete) {

                    Date lastdate = new Date(fileType.lastModified());
                    if (fileType.isDirectory()) {

                        writer.write("  ".repeat(level)+" D: "+fileType.getName()+" "+lastdate);
                        writer.newLine();


                        recursiveDirectoryList(fileType, comparator, level+1, writer);

                    } else if (fileType.isFile()) {

                        writer.write("  ".repeat(level)+" F: "+fileType.getName()+" "+lastdate);
                        writer.newLine();

                    }
                }
            }
	}
}

