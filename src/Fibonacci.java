import java.util.Scanner;

public class Fibonacci{
    /*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a 
    soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
    escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci
     e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
     Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido 
     no código;
    */
    public static void main(String[] args) throws Exception {
        System.out.println("Esta lista contém 50 elementos...");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("insira o numero a ser pesquisado");
        
        int elemento = scan.nextInt();
        int pesquisa = -1;        
        int limite = 50;
        int[] fibonacci = new int[limite];
        int count;

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (count = 2; count < limite; count++) {
            fibonacci[count] = fibonacci[count - 1] + fibonacci[count - 2];
            System.out.println(fibonacci[count]);
        }
        for(count = 0; count < limite; count ++){
            if(fibonacci[count] == elemento){
                pesquisa = count;
                break;
            }
        }
        if (pesquisa != -1) {
            System.out.println("O valor " + elemento + " foi encontrado no índice " + pesquisa + " do array.");
        } else {
            System.out.println("O valor " + elemento + " não foi encontrado no array.");
        }
        
    }
}

