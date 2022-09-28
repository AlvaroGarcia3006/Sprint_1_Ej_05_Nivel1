package nivel1_ej04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\alvar\\IdeaProjects\\Sp1_ej05_GarciaAlvaro\\src\\main\\java\\nivel1_ej04");
        File[] list = dir.listFiles();
        for (File f: list) {
            if(f.getName().endsWith(".txt")){
                System.out.println(f.getName());
                try {
                    Scanner sc = new Scanner(f);
                    while(sc.hasNextLine()){
                        System.out.println(sc.nextLine());
                    }
                    System.out.println("\nEl archivo ha sido leído con exito.");
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
