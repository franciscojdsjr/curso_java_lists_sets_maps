import java.util.List;

public class TestaCurso {

    private static List<Aula> aulas;

    public static void main(String[] args) {

        Curso javaColocoes = new Curso("Dominando as coleções do java", "Francisc Júnior");

        List<Aula> aulas = javaColocoes.getAulas();
        System.out.println(aulas);

        aulas.add(new Aula("Trabalhando com ArrayList", 21));

        System.out.println(aulas);
    }

}
