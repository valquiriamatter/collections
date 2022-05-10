import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AprendendoMap {

    public static void main(String[] args) {

        // E o tipo pode ser: classes, wrappers ou tipos de coleção
        // Type: é o tipo do objeto a ser usado, ou seja qual implementação

        //Map<E> mapa = new Type();

        //Declarando de um Map
        Map<Integer, String> mapa = new HashMap();

        //Declarando um Map com a implementação de HashTable
        Map<Integer, String> mapaHashTable= new Hashtable<>();

        //Declarando um Map com a implementação de LinkedHashMap
        Map<Integer, String> mapaLinkedHashMap= new LinkedHashMap<>();

        //Declarando um Map com a implementação de TreeMap
        Map<Integer, String> mapaTree= new TreeMap<>();

        //Adicionando um Valor
        mapa.put(0, "Teste");
        mapa.put(1, "Valquiria");
        mapa.put(2, "João");
        mapa.put(3, "Maria");

        //Imprimindo o Map
        System.out.println("Imprimindo o mapa: " + mapa);
        //Uma outra forma de imprimir o Map
        System.out.println("Imprimindo de outra forma : "  + mapa.entrySet());

        System.out.println("");

        //Imprimindo uma posição do Map
        System.out.println("Imprimindo a posição 1: " + mapa.get(1));

        //Ao add a mesma chave o conteúdo é sobrescrito
        mapa.put(3, "Lais");
        mapa.put(null, null);

        //Retornando os valores do Map
        Collection collection = mapa.values();
        System.out.println("Imprimindo os valores: " + collection);

        //Retornando somente as chaves do Map
        Set<Integer> chaves = mapa.keySet();
        System.out.println("Imprimindo as chaves: " + chaves);

        System.out.println("");

        System.out.println("Percorrendo o mapa");

        //Percorrendo um Map
        for(int i = 0; i < mapa.size(); i++){
            System.out.println(i + " - " + mapa.get(i));
        }

        System.out.println("");

        //ver depois
//        mapa.keySet().forEach(idade -> {
//            System.out.println(pessoas.get(idade));
//        });

    }

}
