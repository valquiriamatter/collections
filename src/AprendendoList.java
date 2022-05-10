import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AprendendoList {

    public static void main(String[] args) {




        //Declaração com Generics <Tipo>
        ArrayList<String> listaAlunos = new ArrayList<String>();

        //Add itens à lista
        listaAlunos.add("João");
        listaAlunos.add("Maria");
        listaAlunos.add("Valquíria");
        listaAlunos.add("Paula");
        listaAlunos.add("Lais");
        listaAlunos.add("Caleb");

        //Imprime a lista (chama o toString())
        System.out.println(listaAlunos);

        //Seta um novo conteúdo numa posição específica da lista
        listaAlunos.set(3, "Paula Siqueira");
        System.out.println(listaAlunos);

        //Verifica se a lista está vazia
        boolean estaVazia = listaAlunos.isEmpty();
        System.out.println("A lista está vazia? " + estaVazia);

        //Remove o elemento da 1a posição (Lembre-se que começa em 0)
        listaAlunos.remove(0);

        //Remove por valor
        listaAlunos.remove("Paula Siqueira");

        //S=Add por objeto
        String meuElemento = "Fernando";
        listaAlunos.add(meuElemento);

        //Imprime a lista (chama o toString())
        System.out.println(listaAlunos);

        //Remove o objeto
        listaAlunos.remove(meuElemento);

        //Vê o índice
        int index = listaAlunos.indexOf("Valquíria");
        System.out.println("O índice onde se localiza a Valquíria é o índice: " + index);

        //Vê o conteúdo de uma posição específica
        System.out.println("O aluno do índice 0 é: " + listaAlunos.get(0));

        System.out.println("");
        System.out.println("Percorrendo a Lista com o foreach: ");

        //Percorrendo um arrayList
        for(String item : listaAlunos){
            System.out.println(item);
        }

        System.out.println("");

        //Percorrendo um arrayList com o for tradicional
        for(int i=0; i < listaAlunos.size(); i++){
            System.out.println(listaAlunos.get(i));
        }

        //OBS: Fizemos até i < aulas.size() pois size retorna o total de elementos.
        //Se acessássemos até i <= aulas.size() teríamos um problema!
        //Uma exception do tipo IndexOutOfBoundsException seria lançada.
        //Lembre-se que sempre começa em 0.

        System.out.println("");

        //Percorrendo com com a API do Java 8
        listaAlunos.forEach(alunos -> {
            System.out.println(alunos);
        });

        System.out.println("");

        //Percorrendo com com a API do Java 8 em 1 linha
        listaAlunos.forEach(alunos -> System.out.println(alunos));

        System.out.println("");

        //Ordendando a lista
        Collections.sort(listaAlunos);
        System.out.println("Lista de Alunos Ordenados: " + listaAlunos);


        System.out.println("");

        //Invertendo a lista
        Collections.sort(listaAlunos, Collections.reverseOrder());
        System.out.println("Lista de Alunos Invertida: " + listaAlunos);

        //Vendo se um Elemento Está na Lista
        List array = Arrays.asList(1, 3, 5, 2, 4);
        if (array.contains(3)) {
            System.out.println("Elemento encontrado na ArrayList");
        };

        //Limpa a lista, tornando-a vazia, é útil quando precisamos reusar uma lista existente
        listaAlunos.clear();


//        Collections.reverse()
//        O método reverse() serve para inverter a ordem de uma lista. As vezes precisamos imprimir uma lista de nomes do último para o primeiro, ou uma lista de ids do maior para o menor e é nestas horas que utilizamos o reverse para inverter a ordem natural da lista para nós.
//
//                Collections.shuffle()
//        O método shuffle() serve para embaralhar a ordem de uma lista. Por exemplo em um caso de um sistema de sorteio, em que precisamos de uma ordem aleatória na nossa lista, utilizamos o método shuffle para embaralhá-la.
//
//                Collections.singletonList()
//        O método singletonList() nos devolve uma lista imutável que contêm um único elemento especificado. Ele é útil quando precisamos passar um único elemento para uma API que só aceita uma Collections daquele elemento.
//
//                Collections.nCopies()
//        O método nCopies() nos retorna uma lista imutável com a quantidade escolhida de um determinado elemento. Se temos uma lista específica e precisamos obter uma outra lista imutável , contendo diversas cópias de um destes objetos, utilizamos o método nCopies(). O bom deste método é que mesmo que nós solicitemos uma lista com um número grande, como 10000 objetos, ele na verdade se referencia a apenas um, ocupando assim um pequeno espaço.
//
//        Este método também é utilizado para inicializar Listas recém criadas com Null, já que ele pode rapidamente criar diversos objetos, deste modo:
//
//        List<Type> list = new ArrayList<Type>(Collections.nCopies(1000, (Type)null));
//
//        Estes são apenas alguns exemplos dos diversos métodos da classe Collections.



    }




}
