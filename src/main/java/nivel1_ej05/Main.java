package nivel1_ej05;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Serializer listSer = createSer();
        createFile(listSer);
        System.out.println(readFile());
    }
    //creación de un objeto Serializer
    public static Serializer createSer(){
        File dir = new File("C:\\Users\\alvar\\IdeaProjects\\Sp1_ej05_GarciaAlvaro\\src\\main\\java");
        Serializer listSer = new Serializer(dir.list());
        return listSer;
    }
    //Serialización del objeto creado
    public static void createFile(Serializer listSer){
        try {
            ObjectOutputStream cFile = new ObjectOutputStream(new FileOutputStream("C:\\Users\\alvar\\IdeaProjects\\Sp1_ej05_GarciaAlvaro\\src\\main\\java\\nivel1_ej05\\ObjetoSer\\listSer.ser"));
            cFile.writeObject(listSer);
            cFile.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //Transformación del archivo .ser para ser mostrado por pantalla
    public  static  Serializer  readFile() {
        Serializer rSer;
        try {
            ObjectInputStream rFile = new ObjectInputStream(new FileInputStream("C:\\Users\\alvar\\IdeaProjects\\Sp1_ej05_GarciaAlvaro\\src\\main\\java\\nivel1_ej05\\ObjetoSer\\listSer.ser"));
            rSer = (Serializer) rFile.readObject();
            rFile.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return rSer;
    }
}
