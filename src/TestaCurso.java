import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        //Criando o curso
        Curso javaColecoes = new Curso("Collections Framework", "Alicio");

        //Adicionando Aulas
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("ArrayList x LinkeList", 15));
        javaColecoes.adiciona(new Aula("Maps", 24));

        //Imprimindo as aulas
        System.out.println(javaColecoes.getAulas());

        //Criando alunos
        Aluno a1 = new Aluno("Paula Maria", 34672);
        Aluno a2 = new Aluno("Lais Raquel", 5617);
        Aluno a3 = new Aluno("Mauricio Carvalho", 17645);

        //Matriculando alunos no Curso
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com matricula 5617?");
        //Buscando por Matrícula
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println("Aluno: " + aluno);

        //Vendo os Alunos do Curso com a Api do Java 8
        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        //Como protegemos a nossa lista e deixamos somente como leitura,
        //Ao tentar qualquer modificação, como por exemplo uma ordenarnação
        //Vamos tomar uma UnsupportedOperationException

        //List<Aula> aulas = javaColecoes.getAulas();
        //Collections.sort(aulas);

        //A alternativa à isso é criar uma nova lista que recebe um "clone" da original
        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        List<Aula> cloneAulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(cloneAulas);
        System.out.println("Agora é possível ordenar...");
        System.out.println(cloneAulas);

    }


}
