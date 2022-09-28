package nivel1_ej03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File dirTxt = createTxt();
        File dir = new File("C:\\Users\\alvar\\IdeaProjects\\Sp1_ej05_GarciaAlvaro\\src\\main\\java");
        File[] list = dir.listFiles();
        Arrays.sort(list);
        String content;
        for (File l : list){
            writer(dirTxt, l.getName());
            if(l.isDirectory()){
                content = " (D)"+"\n";
                writer(dirTxt, content);
                DirList(l);
            }else {
                content = " (F)"+"\n";
                writer(dirTxt, content);
            }
        }
    }
    //Recorrer y añadir directorios.
    public static void DirList(File files){
        File dirTxt = createTxt();
        File[] list = files.listFiles();
        Arrays.sort(list);
        String str = "";
        for (File f : list) {
            if (f.isDirectory()){
                str = "\t"+f.getName()+ " (D)"+"\n";
                writer(dirTxt, str);
                DirList(f);
            }else{
                str = "\t"+f.getName()+" (F)"+"\n";
                writer(dirTxt, str);
            }
        }
    }
    //Crear el archivo txt si no existe.
    public static File createTxt(){
        String dir = "C:\\Users\\alvar\\IdeaProjects\\Sp1_ej05_GarciaAlvaro\\src\\main\\java\\nivel1_ej03\\Directorios.txt";
        File dirTxt = new File(dir);
        if(!dirTxt.exists()){
            try {
                dirTxt.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return dirTxt;
    }
    //Escribir datos en el archivo txt.
    public static void writer(File dirTxt, String content){
        try {
            FileWriter fw = new FileWriter(dirTxt, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(content);
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}