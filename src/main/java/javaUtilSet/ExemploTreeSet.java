package javaUtilSet;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet <String> capitais = new TreeSet<>();

        capitais.add("São paulo");
        capitais.add("Ceará");
        capitais.add("Porto Alegre");
        capitais.add("Belo Horizonte");
        capitais.add("Curitiba");

//       Mostrando os elementos de maneira mais visuais

        for (String treeCapitais: capitais){
            System.out.println("Capital: "+treeCapitais);
        }

//        retornando a primeira capital
        System.out.println("A primeira Capital é: "+capitais.first());
    }
}
