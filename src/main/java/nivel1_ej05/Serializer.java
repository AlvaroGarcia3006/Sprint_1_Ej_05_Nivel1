package nivel1_ej05;

import java.io.Serializable;
import java.util.Arrays;

public class Serializer implements Serializable {
    String[] list;

    public Serializer(String[] list) {
        this.list = list;
    }
    public String[] getList() {
        return list;
    }
    public void setList(String[] list) {
        this.list = list;
    }
    @Override
    public String toString() {
        return "Serializer{" +
                "list=" + Arrays.toString(list) +
                '}';
    }

}
