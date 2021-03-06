/*
O objeto Math é utilizado para realizar operações matemáticas, sejam elas aritméticas, 
funções trigonométricas, funções de arredondamento e comparações.

Funções matemáticas são programas especiais existentes nas bibliotecas das linguagens 
de programação e executam cálculos matemáticos mais complexos não suportados pelos 
operadores matemáticos básicos.

---------->EXEMPLO:
*/

/**
 * 
 * @author Bianca
 */

    public class Main {
    public static void main(String[] args) {
        
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;
        
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);
        System.out.println();
        
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        System.out.println();
        
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

    }
}    

            /*
            run:
            Raiz quadrada de 3.0 = 1.7320508075688772
            Raiz quadrada de 4.0 = 2.0
            Raiz quadrada de 25 = 5.0
            3.0 elevado a 4.0 = 81.0
            3.0 elevado ao quadrado = 9.0
            5 elevado ao quadrado = 25.0
            Valor absoluto de 4.0 = 4.0
            Valor absoluto de -5.0 = 5.0
            */
