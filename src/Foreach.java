public class Foreach {
    public static void main(String[] args) {
        String[] nomes = new String[] {"Maria Eduarda", "Victor Lucas", "Alana"};

        for (String nome : nomes){
            System.out.println(nome);
        }

        Integer[]numeros = new Integer[] {1,2,3,4,5};

        Integer soma = 0;

        for (Integer x : numeros){
            System.out.println(x);
            soma+=x;
        }

        System.out.println(soma);
    }
}
