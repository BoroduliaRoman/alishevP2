package Lesson45;

import java.io.*;

/**
 * @author BR
 */
public class WriteObject {
    public static void main(String[] args) {
        /*
        //Person person1 = new Person(1, "Bob");
        //Person person2 = new Person(2, "Mike");
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"),
                new Person(3, "Tom")};
         */

        Person person1 = new Person(1, "Mike");

        String separator = File.separator;
        String path = "D:" + separator +"JavaProjects" + separator + "alishevP2" + separator + "src" + separator
                + "Lesson45" + separator + "people.bin";

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {

            //FileOutputStream fos = new  FileOutputStream(path);
            //ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);

            /*
            oos.writeInt(people.length);

            for (Person person : people) {
                oos.writeObject(person);
            }

            //oos.writeObject(person1);
            //oos.writeObject(person2);
             */

            //oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}