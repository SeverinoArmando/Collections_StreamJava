package javaUtilSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAluno = new HashSet<>();

        notasAluno.add(5.8);
        notasAluno.add(9.3);
        notasAluno.add(6.5);
        notasAluno.add(10.0);
        notasAluno.add(3.5);
        notasAluno.add(5.5);

        System.out.println(notasAluno);

//        Removendo a nota do set
        notasAluno.remove(6.5);
        System.out.println(notasAluno);

//        mostrando a quantidade de item dentro do set
        System.out.println(notasAluno.size());

//        navegando sobre todos os itens do iterator

        Iterator<Double> iterator = notasAluno.iterator();
        while (iterator.hasNext()){
            System.out.println("Notas--->"+iterator.next());
        }

//        Outra maneira de navegar sobre os itens do set
        for(Double notas: notasAluno){
            System.out.println("Outra meneira: "+notas);
        }

//        Esvaziando o set
//        notasAluno.clear();
        System.out.println(notasAluno);

//        Vendo se o set está vazio ou não

        System.out.println(notasAluno.isEmpty());

    }
}
