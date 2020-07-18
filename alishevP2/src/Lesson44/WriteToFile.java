package Lesson44;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author BR
 */
public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "D:" + separator +"JavaProjects" + separator + "alishevP2" + separator + "src" + separator
                + "Lesson44" + separator + "testFile.txt";

        File file = new File(path);
        PrintWriter printWriter = new PrintWriter(file);

        //System.out.println(System.in);
        printWriter.println("Test row 1");
        printWriter.println("Test row 2");

        printWriter.close();
    }
}