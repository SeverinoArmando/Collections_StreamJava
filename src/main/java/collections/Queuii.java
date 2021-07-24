package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queuii {
    public static void main(String[] args) {
        Queue<String> filaDeBanco = new LinkedList<>();

//    filaDeBanco.add("Patrica");
//    filaDeBanco.add("Roberto");
//    filaDeBanco.add("Flavio");
//    filaDeBanco.add("Pamela");
//    filaDeBanco.add("Anderson");

//    System.out.println(filaDeBanco);
//
////    Usamos o poll para retirar o primeiro elemento da lista de acordo com a ordem de chagada
//
//    String cliente_Atendido= filaDeBanco.poll();
//
//int tamanho = filaDeBanco.size();
//
//    System.out.println("Cliente Atendido: "+cliente_Atendido);
//
////        System.out.println("A lista tem "+tamanho);
//    System.out.println("Clientes a ser atendido: "+filaDeBanco);
//
////    Agora vamos mostrar apenas os nomes da lista sem remover nenhum, só pra saber quem é o primeiro, usamos o peek
//
//        String primeioCliente = filaDeBanco.peek();
////Nesse caso já saiu a primeira pessoa
//        System.out.println(primeioCliente);


        for (String client : filaDeBanco) {
            System.out.println(client);
        }
        Iterator<String> iteratorBanco = filaDeBanco.iterator();
        while (iteratorBanco.hasNext()) {
            System.out.println(iteratorBanco.next());

        }
    }
}
