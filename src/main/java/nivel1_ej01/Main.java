package nivel1_ej01;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\alvar\\IdeaProjects\\Sp1_ej05_GarciaAlvaro\\src\\main\\java");
        String[] list = dir.list();
        Arrays.sort(list);
        for (String l : list){
            System.out.println(l);
        }
    }
}
