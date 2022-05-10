public class Aula implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Aulas {" +
                "titulo='" + titulo + '\'' +
                ", tempo=" + tempo +
                '}';
    }

    @Override
    //Aqui que vai o critério de comparação das aulas, nesse caso o título em ordem alfabética
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.getTitulo());
    }
}
