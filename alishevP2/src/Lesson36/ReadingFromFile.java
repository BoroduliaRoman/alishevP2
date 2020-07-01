package Lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by BR 01.07.2020
 */
public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "D:" + separator +"JavaProjects" + separator + "alishevP2" + separator + "src" + separator
               + "Lesson36" + separator + "test.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        /*
        String input = scanner.nextLine();
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
         */

        scanner.close();
    }
}
