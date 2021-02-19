import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListElementos {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Victor Lucas");
        list.add("Maria Eduarda");
        list.add("Maria Clara");
        list.add("Zurita");
        // Adionando elementos na lista
        list.add(1, "Karla");
        //Ele adiciona um elemento "furando" a fila. Ou seja, o index define a posição que ele vai ocupar.

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("\nO tamanho da lista é : " + list.size());

        System.out.println("\n----------------------------------- \n");

//        list.removeIf(x -> x.charAt(0) == 'M' || x.charAt(0)=='Z' || x.charAt(0) == 'K');

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("\nO tamanho da lista é : " + list.size());

        System.out.println("\n----------------------------------- \n");

        System.out.println(list.indexOf("Victor Lucas"));
        System.out.println(list.indexOf("Victor"));

        System.out.println("\n----------------------------------- \n");

        List<String> resul = list.stream().filter(x -> x.charAt(0)=='K').collect(Collectors.toList());
        System.out.println(resul);

        System.out.println("\n----------------------------------- \n");

        for (String x : resul){
            System.out.println(x);
        }

        System.out.println("\n----------------------------------- \n");

         list.stream().filter(x -> x.charAt(0)=='K').findFirst().orElse(null);



    }
}
