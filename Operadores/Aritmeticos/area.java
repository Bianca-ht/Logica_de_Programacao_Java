/*
 Operadores aritméticos são utilizados para calculos matematicos.

Multiplicação *     |  a*b
Divisão /           |  a/b
Adição +            |  a+b
Subtração -         |  a-b
Resto da Divisão %  | a%c    | Mod

*** O mod a%b retorna o resto da divisão inteira.
EXEMPLO:
--------> 9%2
9/2 resultado 4 e o resto 1 = mod.


EXEMPLO:
--------> Calcule o valor da area:
 */

/**
 *
 * @author Bianca
 */

import java.util.Scanner;

public class Area {
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in); 
    
    double b,B,h, area;
    b = 6.0;
    B = 8.0;
    h = 5.0;
    
    area=(b+B)/2.0*h;
    
    System.out.println("Area "+ area);
     
        
        
    }
}

        /* run:
          Area 35.0
        */
