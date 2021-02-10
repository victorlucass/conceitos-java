import java.util.ArrayList;
import java.util.List;

public class ListElementos {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Victor Lucas");
        list.add("Maria Eduarda");
        list.add("Maria Clara");
        list.add("Zurita");
        // Adionando elementos na lista
        list.add(1, "Karla"); //Ele adiciona um elemento "furando" a fila. Ou seja, o index define a posição que ele vai ocupar.
        for (String x : list){
            System.out.println(x);
        }

    }
}
