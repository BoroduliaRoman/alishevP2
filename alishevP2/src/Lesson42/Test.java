package Lesson42;

/**
 * @author BR
 */
public class Test {
    public static void main(String[] args) {
        /*
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        // animal1          ->          {1}
        // animal2          ->          {1}

        Animal animal1 = new Animal(1);
        //Animal animal2 = new Animal(2);
        Animal animal2 = animal1;

        System.out.println(animal1 == animal2);

        //Object object = new Object();
        //object.equals();
         */

        /*
        String string1 = "Hello";
        String string2 = "Hello";

        System.out.println(string1 == string2);
         */

        String a = "hello";
        String b = "hello123".substring(0, 5);

        System.out.println(b);
        System.out.println(a == b);
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object object) {
        Animal otherAnimal = (Animal) object;
        return this.id == otherAnimal.id;
    }
}