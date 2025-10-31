package level1.exercise5;

import java.io.*;


public class SerializeFile {
    public static void main(String[] args) {

        File file = new File(args[0]);

        File[] directory = file.listFiles();


        System.out.println("Current working dir: " + new File(".").getAbsolutePath());

		String outPutPath = new File("resources/serializable.ser").getAbsolutePath();
        try(ObjectOutputStream serializableObject = new ObjectOutputStream(new FileOutputStream(outPutPath))){

            serializableObject.writeObject(directory);
            System.out.println("File serialized with success");
            System.out.println();

        }catch (IOException ie){
            System.out.println("File couldn't read..."+ie.getMessage());
        }


        try(ObjectInputStream saveSerializableObject = new ObjectInputStream((new FileInputStream(outPutPath)))){

            File[] outObject =  (File[]) saveSerializableObject.readObject();

			if(outObject == null){
				System.out.println("Error, the .ser file is null.");
				return;
			}

            for(File f : outObject){
                System.out.println(f.getAbsolutePath());
            }

            System.out.println("File deserializable with success");


        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        }
    }

