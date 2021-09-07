import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
       List<String> palavras = new ArrayList<>();
       palavras.add("alura online");
       palavras.add("casa do código");
       palavras.add("caelum");

//        Collections.sort(palavras, new ComparadorStringPorTamanho());
//        palavras.sort(new ComparadorStringPorTamanho());
        palavras.forEach(new ConsumidorDeString());
//        System.out.println(palavras);
    }
}

class ComparadorStringPorTamanho implements Comparator <String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

class ConsumidorDeString implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}