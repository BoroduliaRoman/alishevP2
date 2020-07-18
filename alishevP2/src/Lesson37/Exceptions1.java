package Lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by BR 03.07.2020
 */
public class Exceptions1 {
    public static void main(String[] args) {
        /*
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("После Scanner");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }

        System.out.println("После блока try catch");

         */

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }
    }

    public static void readFile() throws FileNotFoundException {
        String separator = File.separator;
        String path = "D:" + separator +"JavaProjects" + separator + "alishevP2" + separator + "src" + separator
                + "Lesson37" + separator + "test1.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
    }
}
