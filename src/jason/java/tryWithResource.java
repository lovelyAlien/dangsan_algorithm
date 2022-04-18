package jason.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class tryWithResource {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File("input.txt"));
             PrintWriter pw = new PrintWriter(new File("output.txt"))) {
            System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
