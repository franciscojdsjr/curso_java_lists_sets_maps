
import java.util.List;

public class TestaCurso {

    private static List<Aula> aulas;

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do java", "Francisco Júnior");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        System.out.println(javaColecoes.getAulas());

    }

}
