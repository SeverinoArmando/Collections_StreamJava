package collections;

import java.util.List;

public class Vector {
    public static void main(String[] args) {

        List<String> esporte = new java.util.Vector<>();
//        List<String> outro = esporte;

//        Adicionei 4 esportes no vetor
        esporte.add("Footbol");
        esporte.add("Andebol");
        esporte.add("Basquetebol");
        esporte.add("Football Americano");

        System.out.println(esporte);

//        Alterando o valor da posiçao 2 do vetor
        esporte.set(2,"Ping-pong");
        System.out.println(esporte);

//        removendo o esporte da posicao 2 do vetor
        esporte.remove(2);
        System.out.println(esporte);

//        navegando sobre os esportes
        for(String exercicio:esporte){
            System.out.println("Esporte: "+exercicio);
        }

    }
}
