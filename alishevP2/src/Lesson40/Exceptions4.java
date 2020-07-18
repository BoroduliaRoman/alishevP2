package Lesson40;


import java.io.IOException;
import java.text.ParseException;

/**
 * Created by BR 08.07.2020
 */
public class Exceptions4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
