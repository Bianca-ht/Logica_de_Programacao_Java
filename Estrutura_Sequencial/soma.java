/*
Estrutura sequencial é um conjunto de comandos que serão executados 
em uma sequencia linear de cima para baixo. Esta sequencia obedece 
a logica de programação.
     
   
------>Faça um algoritmo para somar dois números e multiplicar o resultado da 
       soma pelo primeiro numero. Mostrar o valor da soma e da multiplicação na
       tela(console).

    1-Declarar|criar as variáveis que serão usadas;
    2-Pedir para o usuário entrar com dois números;
    3-Somar os dois números;
    4-Multiplicação o resultado da soma pelo primeiro número;
    5-Mostrar para usuário o valor da soma e da multiplicação;
        
    Pseudocódigo:
        EXEMPLO:
 *  Inicio:
        Inteiro
        Leia
        Soma
        Multiplica
        Escreva
 *  Fim

*/

/**
 *
 * @author Bianca
 */

import java.util.Scanner;

public class Soma {
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in); 
    
    int num1, num2, soma, multiplicacao;
    
        System.out.print("Digite o primeiro valor: ");
        num1= sc.nextInt();
        System.out.print("Digite o Segundo valor: ");
        num2= sc.nextInt();
        
        soma = num1 + num2;
        multiplicacao =  soma * num1;
        
        System.out.println("O resultado da soma é " + soma);
        System.out.println("O resultado da multiplicação é " + multiplicacao);
    }
}

            /* run:
            Digite o primeiro valor: 6
            Digite o Segundo valor: 6
            O resultado da soma é 12
            O resultado da multiplicação é 72
            */
