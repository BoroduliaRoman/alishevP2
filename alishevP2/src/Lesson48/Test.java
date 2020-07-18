package Lesson48;

/**
 * @author BR
 */
public class Test {
    /*
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;

    public static void main(String[] args) {
        int animal = DOG;

        switch (animal) {
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
            default:
                System.out.println("It's not an animal");
        }
    }
     */

    public static void main(String[] args) {
        /*
        Animal animal = Animal.CAT;

        switch (animal) {
            case CAT:
                System.out.println("It's a cat!");
                break;
            case DOG:
                System.out.println("It's a dog!");
                break;
        }
         */

        //Season season = Season.SUMMER;

        // Object -> Enum -> Season

        //System.out.println(season.getClass());

//        switch (season) {
//            case SUMMER:
//                System.out.println("It's warm outside");
//                break;
//            case WINTER:
//                System.out.println("It's cold outside");
//                break;
//        }

//        Animal animal = Animal.DOG;
//        System.out.println(animal);
//
//        Season season = Season.WINTER;
//        System.out.println(season.getTemperature());

//        Season season = Season.AUTUMN;
//        Animal animal = Animal.FROG;
//        System.out.println(animal.name());

//        Animal frog = Animal.valueOf("FROG");
//        System.out.println(frog.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
    }
}