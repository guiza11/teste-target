import java.util.Scanner;

public class Caractere {
        /*5) Escreva um programa que inverta os caracteres de um string.

    IMPORTANTE:
    a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
    b) Evite usar funções prontas, como, por exemplo, reverse; */
    // {"T", "A", "R", "G", "E", "T",};
    
    public static void main(String[] args) {
        String[] vet = {"T", "A", "R", "G", "E", "T"};
        int count = (vet.length -1);

        while(count >= 0){
            System.out.println(vet[count]+" ");
            count --;
        }

    }
    
}
