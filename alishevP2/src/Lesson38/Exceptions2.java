package Lesson38;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by BR 04.07.2020
 */
public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
                /*
                try {
                    throw new IOException();
                } catch (IOException exception) {
                    System.out.println("Пользователь ввёл что-то кроме нуля");
                }
                 */

                throw new ScannerException("Пользователь ввёл что-то кроме нуля");
            }
        }
    }
}
