public class Faturamento {
    /* Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

    SP – R$67.836,43
    RJ – R$36.678,66
    MG – R$29.229,88
    ES – R$27.165,48
    Outros – R$19.849,53
    total = 180.768,98
    180768,98
    Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.*/
    
    
    
    
    public static void main(String[] args) throws Exception {
        double sp =67836.43;
        double rj =36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total = sp + rj + mg + es + outros;


        double res = ((sp / total) - 1) * 100;
        res *= -1;
        System.out.printf("Porcentagem em SP = %.2f%n", (100 - res));

        res = ((rj / total)-1) * 100;
        res *= -1;
        System.out.printf("Porcentagem em RJ = %.2f%n", (100 - res));

        res = ((mg / total)-1) * 100;
        res *= -1;
        System.out.printf("Porcentagem em MG = %.2f%n", (100 - res));

        res = ((es / total)-1) * 100;
        res *= -1;
        System.out.printf("Porcentagem em ES = %.2f%n", (100 - res));

        res = ((outros / total)-1) * 100;
        res *= -1;
        System.out.printf("Em outros estados = %.2f%n", (100 - res));
        

    }
}
