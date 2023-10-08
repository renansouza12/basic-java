package edu.renan.operadores;

public class Operadores {

    public static void main(String[] args){
         //Atribuição representado pelo sinal " = "
    String nome = "Bob";

    //Aritméticos
    /*
    + adição
    - subtração
    *multiplicação
    / divisão
     */

     double some = 10.7 + 15.7;
     int subtracao = 10 - 8;
     int multiplicacao = 2 * 5;
     int divisao = 10 / 5;
     int modulo = 18 % 3;
      double resultado = (10 *7) + (20/4);


      //Unários
      /*
       (+) Operador unário de valor positivo
       (-) Operador unário de valor negativo
       (++) Operador de incremento
       (--)Operador de decremento
       (!) Operador de negação 
       */

       int numero = 10;

       numero = - numero; // deixar o número negativo
       numero = numero * -1 ;// deixar o número positivo

        numero++; //incrementar
        numero--;//decrementar

        boolean variavel = true;
        variavel = !variavel; // ou seja false

        //Tenário
        int a ,b;
        a = 5;
        b = 6;
        
        String result = a == b ? "verdadeiro" :  "Falso";


        //Relacionais
        /*
          ==  Igual
          != diferente
        > maior
        < menor
        >= maior ou igual
        <= menor ou igual

         */
        String nomeUm = "Walter";
        String nomeDois = "Walter";

        System.out.println(nomeUm.equals(nomeDois));
    }
   
}
