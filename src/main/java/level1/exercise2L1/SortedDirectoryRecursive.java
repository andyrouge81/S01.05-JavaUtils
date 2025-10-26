package level1.exercise2L1;

import java.io.File;
import java.util.*;

public class SortedDirectoryRecursive {

    public static void main(String[] args) {
        int level =1;
        File files = new File(args[0]);

        Comparator<File> comparation = new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());

            }
        };

        if(files.isDirectory() || files.exists()){
            List<File> directories = new ArrayList<>(Arrays.asList(files.listFiles()));

            if(directories != null){
                Collections.sort(directories, comparation);
            }else{
                System.out.println("The directory doesn't match");
            }

            for(File f : directories){
                System.out.println(f.getName());
            }
        }

        SortedDirectoryRecursive.recursiveDirectoryList(files, comparation, level +1);
    }


    public static void recursiveDirectoryList(File directories, Comparator<File> comparator, int level) {

        if (directories.exists() && directories.isDirectory()) {
            File[] files = directories.listFiles();

            if (files == null) return;
            List<File> listComplete = new ArrayList<>(Arrays.asList(files));


            Collections.sort(listComplete, comparator);

            for (File fileType : listComplete) {

                    Date lastdate = new Date(fileType.lastModified());
                    if (fileType.isDirectory()) {

                        System.out.println("  ".repeat(level)+" D : "+fileType.getName()+" "+lastdate);
                        recursiveDirectoryList(fileType, comparator, level+1);
                    }

                    if (fileType.isFile()) {

                        System.out.println("  ".repeat(level)+" F : "+fileType.getName()+" "+lastdate);

                    }

                }

            }

        }
    }


