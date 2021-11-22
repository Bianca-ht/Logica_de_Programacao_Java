/*
Operadores aritméticos são utilizados para calculos matematicos.
    Incremento ++  
    Decremento --   

    ****Pré-fixado: Quando declaramos esse operador antes da variável, 
    o incremento é realizado antes do valor da variável ser lido 
    para o processamento ao qual a instrução pertence.

    ****Pós fixado: Quando declarado depois, ocorre o contrário: lê-se
    o valor da variável para processamento e só então o valor da variável
    é incrementado.

            --------> EXEMPLO:
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
        	
	int a=5;
        
        //incremento ++a pré-fixado 
        System.out.printf("%d\n", a ); 
        System.out.printf("%d\n", ++a);
        System.out.printf("%d\n", a ); 
        System.out.println();
        
            /*
                run:
                5
                6
                6
            */    
        //incremento b++ pós-fixado
        System.out.printf("%d\n", a ); 
        System.out.printf("%d\n", a++ ); 
        System.out.printf("%d\n", a ); 
        System.out.println();
        
            /*
                run:
                6
                6
                7
            */
         
        //decremento --a pré-fixado 
        System.out.printf("%d\n", a ); 
        System.out.printf("%d\n", --a);
        System.out.printf("%d\n", a ); 
        System.out.println();
        
            /*
                run:
                7
                6
                6
            */
        
        //decremento a-- pós-fixado
        System.out.printf("%d\n", a ); 
        System.out.printf("%d\n", a-- ); 
        System.out.printf("%d\n", a );
        
            
            /*
                run:
                6
                6
                5
            */    
        
        
        }
    }

           
