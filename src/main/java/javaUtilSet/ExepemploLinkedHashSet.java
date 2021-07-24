package javaUtilSet;

import java.util.LinkedHashSet;

public class ExepemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();


//        Adicionando os numeros ao set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(14);
        sequenciaNumerica.add(12);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(11);
        sequenciaNumerica.add(7);

        System.out.println(sequenciaNumerica);

//        Removendo um numero do set
        sequenciaNumerica.remove(11);

        System.out.println(sequenciaNumerica);

//        Retornando a quantidade de numeros dentro do set
        System.out.println("O set tem "+sequenciaNumerica.size()+" elementos");

//        Navegando sobre os itens

        for(Integer dados:sequenciaNumerica){
            System.out.println(dados);
        }
    }

}
