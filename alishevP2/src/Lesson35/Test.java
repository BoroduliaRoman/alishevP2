package Lesson35;

/**
 * Created by BR 30.06.2020
 */
/*
class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}
 */

/*
class OtherAnimal extends Animal {
    public void eat() {
        System.out.println("Other animal is eating...");
    }
}
 */

interface AbleToEat {
    public void eat();
}

/*
class Animal implements AbleToEat {

    @Override
    public void eat() {
        System.out.println("Animal is eating...");
    }
}
 */

public class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };

        ableToEat.eat();

        //AbleToEat ableToEat = new Animal();
        //ableToEat.eat();

        /*
        Animal animal = new Animal();
        animal.eat();

        Animal animal2 = new Animal(){
            public void eat() {
                System.out.println("Other animal is eating...");
            }
        };
         */

        //animal2.eat();

        /*
        OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();
         */
    }
}