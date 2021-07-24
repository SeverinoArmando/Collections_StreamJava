package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
//        Nesta fase Criamos uma lista e importamos a Class List

        List<String> nomes = new ArrayList<>();

        nomes.add("Miguel");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("Maria");
        nomes.add("Carlos");
//Usamos o set para configurar a ordem, mudamos a maria para a posição 0

//        System.out.println(nomes);
//        nomes.set(0,"Maria");

        System.out.println(nomes);

//        Agora removeremos o primeiro elemento
//        nomes.remove("Miguel");
//        System.out.println(nomes);

//        Criamos uma nova variavel e atribuimos um valor da lista existente

//        String nome = nomes.get(1);
//        System.out.println(nome);


//        Verificamos se dentra da nossa Lista contem o nome Miguel
//        boolean tem = nomes.contains("Miguel");
//        if (tem == true){
//            System.out.println("O elemento Existe na Lista");
//        }else{
//            System.out.println("O elemento não existe na lista");
//        }


//        Utilizamoms o indexof para nos dizer a posiçao de algum elemento

//        int posicao = nomes.indexOf("Ana");
//        System.out.println("O nome Ana está na posição -- "+posicao);


//        Usamos o for i para mostrar todos os elementos da lista imprimindo nmo console

        for (String nomeItem: nomes){
            System.out.println("----> " + nomeItem);
        }


//        Tambem podemos mostrar todos os elementos usando uma Class Iterator do java.util
        Iterator<String> iterador = nomes.iterator();

        while(iterador.hasNext()){
            System.out.println("=====>> "+iterador.next());
        }
    }
}
