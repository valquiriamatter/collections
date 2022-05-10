import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

//Testando Performance com 50000 números
//ArrayList x HashSet

public class TesteArrayListXHashSet {

    public static void main(String[] args) {

       testaArrayList();
       testaHashSet();

    }

    public static void testaArrayList() {

        //ArrayList, a inserção é bem rápida e a busca muito lenta!
        Collection<Integer> numeros = new ArrayList<>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto da ArrayList: " + tempoDeExecucao);

    }

    public static void testaHashSet() {

        //HashSet: a inserção ainda é rápida, embora um pouco mais lenta do que a das listas.
        // Mas a busca é muito rápida!
        Collection<Integer> numeros = new HashSet<>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto do HashSet: " + tempoDeExecucao);

    }

}





