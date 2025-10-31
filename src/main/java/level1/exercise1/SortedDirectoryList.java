package level1.exercise1;


import java.io.File;

import java.util.*;


public class SortedDirectoryList {


    public static void main(String[] args){

        File files = new File(args[0]);


        Comparator<File> comparation = new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());

            }
        };

        if(files.isDirectory() && files.exists()){
            List<File> directories = new ArrayList<>(Arrays.asList(files.listFiles()));

            if(directories != null){
                Collections.sort(directories, comparation);
            }else{
                System.out.println("Directory not found.");
            }

            for(File f : directories){
                System.out.println(f.getName());
            }
        }

    }
}


