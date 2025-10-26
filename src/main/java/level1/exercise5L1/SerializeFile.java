package level1.exercise5L1;

import java.io.*;


public class SerializeFile {
    public static void main(String[] args) {

        File file = new File(args[0]);

            File[] directory = file.listFiles();


        System.out.println("Current working dir: " + new File(".").getAbsolutePath());


        try(ObjectOutputStream serializableObject = new ObjectOutputStream(new FileOutputStream("./resources/serializable.ser"))){

            serializableObject.writeObject(directory);
            System.out.println("File serialized with success");
            System.out.println();

        }catch (IOException ie){
            System.out.println("File couldn't read..."+ie.getMessage());
        }


        try(ObjectInputStream saveSerializableObject = new ObjectInputStream((new FileInputStream("./resources/serializable.ser")))){

            File[] outObject =  (File[]) saveSerializableObject.readObject();

            for(File f: outObject){
                System.out.println(f);
            }

            System.out.println("File deserializable with success");


        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
