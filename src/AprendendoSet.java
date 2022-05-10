import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AprendendoSet {

    public static void main(String[] args) {

        //Criando alunos
        Aluno a1 = new Aluno("Paula Maria", 34672);
        Aluno a2 = new Aluno("Lais Raquel", 5617);
        Aluno a3 = new Aluno("Mauricio Carvalho", 17645);

        //Criando um HashSet de alunos
        Set<Aluno> alunos = new HashSet<>();

        //Adicionando alunos no HashSet
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        //Add um elemento null
        alunos.add(null);

        //Imprimindo
        System.out.println("HashSet de Alunos - observer que não estão na mesma ordem de inserção: ");
        System.out.println(alunos);

        System.out.println("");

        //Criando um LinkedHashSet e Add
        Set<Aluno> alunosLinkedHash = new LinkedHashSet<>();
        alunosLinkedHash.add(a1);
        alunosLinkedHash.add(a2);
        alunosLinkedHash.add(a3);

        //Add um elemento null
        alunosLinkedHash.add(null);

        //Imprimindo
        System.out.println("LinkedHashSet de Alunos - observe que estão na mesma ordem de inserção: ");
        System.out.println(alunosLinkedHash);

        System.out.println("");

        Set<Aluno> alunoTreeSet = new TreeSet<>();

        //Adicionando alunos no HashSet
        alunoTreeSet.add(a1);
        alunoTreeSet.add(a2);
        alunoTreeSet.add(a3);

        //TreeSet não aceita elementos null
        //Ao tentar fazer vamos tomar: java.lang.NullPointerException
        //alunoTreeSet.add(null);

        System.out.println("");

        //Imprimindo
        System.out.println("TreeSet de Alunos - observe que estão na mesma ordem de inserção: " + alunoTreeSet);

        System.out.println("");

        //Imprimindo o tamanho
        System.out.println("O tamanho atual do set é de: " + alunos.size());

        //Tentando add um objeto repetido, retorna um boolean pra dizer se add ou não
        boolean add = alunos.add(a3);
        System.out.println("O tamanho atual do set após tentar add um objeto igual é de: " + alunos.size());
        System.out.println("Foi adicionado ? " + add);

        // Verificando se o aluno existe
        boolean estaMatriculado = alunos.contains(a3);
        // Esse método é muito mais rápido quando executado em um HashSet do que em Uma Lista
        // Porque na lista faz uma busca linear, ou seja, busca elemento por elemento,
        // Já o HashSet utiliza uma tabela de espalhamento para tentar fazer a busca em tempo constante,
        // tornando a busca mais rápida.

        System.out.println("");

        //Percorrendo o Set
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        //Definindo um Set como Vazio
        Set<String> nomes = Collections.emptySet();
        //Tentando add um elemento
        //Recebemos a mesma exceção: UnsupportedOperationException
        //Um conjunto destinado a ser vazio não pode ter um elemento
        //nomes.add("Felipe");

        //Mas para que um conjunto vazio poderia ser útil?
        //Por exemplo, imagina que você precisa representar um curso que foi cancelado pois não teve matriculas.
        //Nesse caso faria sentido devolver um Collections.emptySet()


        //Uma das características mais interessantes de JVM é que ela sabe trabalhar em paralelo.
        //Internamente isso é feito por meio de Threads que funcionam como pequenos processos dentro da JVM.
        //O problema é que as coleções que estamos usando até agora não foram feitas para serem manipuladas em paralelo.
        //No entanto, nada impede que usemos um método da classe Collections para transformar uma coleção comum em uma coleção para threads.
        // É justamente isso que o método faz, retorna um nova coleção que pode ser compartilhada entre threads sem perigos.
        Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);


    }
}
