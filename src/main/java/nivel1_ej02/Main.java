package nivel1_ej02;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\alvar\\IdeaProjects\\Sp1_ej05_GarciaAlvaro\\src\\main\\java");
        File[] list = dir.listFiles();
        Arrays.sort(list);
        for (File l : list){
            System.out.print(l.getName());
            if(l.isDirectory()){
                System.out.print(" (D)"+"\n");
                DirList(l);
            }else {
                System.out.print(" (F)"+"\n");
            }
        }
    }
    public static void DirList(File files){
       File[] list = files.listFiles();
       Arrays.sort(list);
       for (File f : list) {
            if (f.isDirectory()){
                System.out.println("\t"+f.getName()+ " (D)");
                DirList(f);
            }else{
                System.out.println("\t"+f.getName()+" (F)");
            }
       }
    }
}
