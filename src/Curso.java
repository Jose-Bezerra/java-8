import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

class ExemploCursos {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("Javascript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

//        cursos.sort(Comparator.comparing(curso -> curso.getAlunos()));  lamba
        cursos.sort(Comparator.comparing(Curso::getAlunos)); //method reference
        cursos.forEach(curso -> System.out.printf("%10s : %d%n",curso.getNome(), curso.getAlunos()));
        System.out.println("--------");

        int sum = cursos.stream()
                .filter(curso -> curso.getAlunos() > 100)
                .mapToInt(Curso::getAlunos)
                .sum();

        System.out.println(sum);

         cursos.stream()
                .filter(curso -> curso.getAlunos() > 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        List<Curso> resultado = cursos.stream()
                .filter(curso -> curso.getAlunos() > 100)
                .collect(Collectors.toList());

        resultado.stream()
                .forEach(System.out::println);

    }
}
