package Lesson39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by BR 06.07.2020
 */
public class Exceptions3 {
    public static void main(String[] args) {
        // Checked Exceptions (Compile time exceptions) = исключительные случаи в работе программы
        // Unchecked (Runtime exceptions) = ошибка в работе программы

        /*
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("asdf");
        }
         */

        //int a = 1 / 0;

        //String name = null;
        //name.length();

        //int[] arr = new int[2];
        //System.out.println(arr[2]);

        /*
        try {
            int[] arr = new int[2];
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        System.out.println(arr[2]);
         */
    }
}