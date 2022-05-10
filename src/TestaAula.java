import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Manipulando Strings", 19);
        Aula a2 = new Aula("Programação Orientada à Objetos", 22);
        Aula a3 = new Aula("Arraylists", 20);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        //Antes de ordenar
        System.out.println("Lista de Aulas Antes de Ordenar: ");
        System.out.println(aulas);

        System.out.println("");

        //Após ordenar
        Collections.sort(aulas);
        System.out.println("Lista de Aulas Ordenando por Nome da Aula: ");
        System.out.println(aulas);

        System.out.println("");

        //Comparando e orendando por tempo com a API do Java 8

        // Ordene estas aulas utilizando como comparação o retorno do método getTempo de cada Aula
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println("Aulas Ordenandas por Tempo: ");
        System.out.println(aulas);

        //Outra forma de fazer, mais enxuta
        aulas.sort(Comparator.comparing(Aula::getTempo));
    }


}
