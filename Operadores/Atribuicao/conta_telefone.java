/*
Operador de Atribuição, retorna o valor da expressão especificado 
pela váriavel após a atribuição.
    Sinal de atribuição ( = ).
    EXEMPLO:
        variável = expressão;
        ____________________
        area=(b+B)/2.0*h;
        _________________
        soma=num1+num2;

Os operadores matemáticos podem ser usados em conjunto com um tipo 
especial de operadores de atribuição, neste caso, também chamado de 
“operador de atribuição cumulativa” assim uma mesma instrução pode 
realizar duas ações simultaneamente, a ação de calcular o valor, 
e a ação de atribuir o valor a variável.
*/

/*
    -------->EXEMPLO 

 * Operadores de atribuição cumulativa:

 *  Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
    dá direito a 100 minutos de telefone. Cada minuto que exceder a
    franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
    quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
    a ser pago.

 */

/**
 *
 * @author Bianca
 */

    import java.util.Locale;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta = 50.0;

        if (minutos > 100) {
        conta += (minutos - 100) * 2.0;
            }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        sc.close();
            }
    }



            /*
            run:
            22
            Valor da conta = R$ 50.00
            */

            /*
            run:
            103
            Valor da conta = R$ 56.00
            */
