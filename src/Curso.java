import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new LinkedHashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    //Método get() tradicional, que permite modificar a lista
    // public List<Aula> getAulas() {
    //    return aulas;
    // }

    //Método get() que retorna somente uma lista para leitura
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    //Método get() que retorna somente uma lista para leitura
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    //Esse método get() usa a Api do Java 8, onde toda coleção tem um método que se chama stream.
    //Ao invocarmos esse método, nós pediremos os inteiros porque trabalhamos com o tempo - que é um inteiro.
    //Ele se chamará mapToInt e passaremos para ele qual campo inteiro queremos (Aula::getTempo).
    //No final, nós somaremos esses valores chamando o método sum().
    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    //Buscando por Matrícula e Jogando uma Exception caso não encontre
    public Aluno buscaMatriculado(int numero) {
        for (Aluno aluno : alunos) {
            if (aluno.getNumeroMatricula() == numero) {
                return aluno;
            }
        }
        throw new NoSuchElementException("Matricula " + numero + " não encontrada");
    }

    //Matriculando: Add na Lista e no Map
    public void matricula(Aluno aluno) {
        // adiciona no Set de alunos
        this.alunos.add(aluno);
        // cria a relação no Map
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                "tempo total='" + this.getTempoTotal() + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                '}';
    }
}
