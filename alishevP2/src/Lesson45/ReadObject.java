package Lesson45;

import java.io.*;
import java.util.Arrays;

/**
 * @author BR
 */
public class ReadObject {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "D:" + separator +"JavaProjects" + separator + "alishevP2" + separator + "src" + separator
                + "Lesson45" + separator + "people.bin";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){

            /*
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);


            //Person person1 = (Person) ois.readObject();
            //Person person2 = (Person) ois.readObject();

            int personCount = ois.readInt();
            Person[] people = new Person[personCount];

            for (int i = 0; i < personCount; i++) {
                people[i] = (Person) ois.readObject();
            }

            //System.out.println(person1);
            //System.out.println(person2);
             */

            Person person1 = (Person) ois.readObject();

            System.out.println(person1);

            //ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}