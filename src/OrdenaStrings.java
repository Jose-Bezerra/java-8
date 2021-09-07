import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        Function<String, Integer> funcao = s -> s.length(); //lambda é uma experssão do dia dia
        //mas é uma instância de uma interface funcional chamada Function
        Function<String, Integer> funcao1 = String :: length; //referência ao método - reference method

        Comparator<String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);
        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        palavras.forEach(System.out::println);


    }
}


