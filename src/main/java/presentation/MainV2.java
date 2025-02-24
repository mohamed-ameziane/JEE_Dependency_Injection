package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("config.txt"));
            String daoClassName = sc.nextLine();
            System.out.println(daoClassName);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        }
    }
}
