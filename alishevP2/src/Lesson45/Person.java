package Lesson45;

import java.io.Serializable;

/**
 * @author BR
 */
public class Person implements Serializable {


    private static final long serialVersionUID = 1822570514525218635L;
    //private static final long serialVersionUID = 4858727808971345641L;
    private int id;
    private String personName;
    private int age;
    private byte type;



    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return personName;
    }

    public String toString() {
        return id + " : " + personName;
    }
}