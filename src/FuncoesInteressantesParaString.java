
public class FuncoesInteressantesParaString {
    //Deixa em minúsculo
    public static String toLowerCase(String s) {
        return "toLowerCase = " + s.toLowerCase();
    }
    //Deixa em maiúsculo;
    public static String toUpperCase(String s) {
        return "toLowerCase = " + s.toUpperCase();
    }

    //Remove os espaços no início e fim
    public static String trim(String s){
        return "trim ="+s.trim();
    }

    //Substitui a por b
    public static String replace(String a, String b){
        String x = a+b;
        return x.replace(a,b);
    }
}
