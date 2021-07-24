package estruturaDeDados;

public class Matrizes {
    public static void main(String[] args) {
        Integer numeros[]={39,45,54,55};
        String nomes[]={"Jorge", "Miguel", "Moneza","Stan"};
        boolean achou = true;
        int conta = 0;

       for ( Integer position = 0; position <=3; position++){
//           if(numeros[position] == numeros[conta]){
//               System.out.println("Encontrado");
//           }else{
//               System.out.println("Não encontrado");
//           }
           System.out.println(numeros[position]+ "\t\t"+nomes[position]);
           System.out.println("-----------------------\n");
       }
//    for (int n = 0; n <=2;n++){
//        System.out.println(nomes[n]);
//    }
    }
}
