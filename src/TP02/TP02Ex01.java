
package TP02;
import java.util.*;

public class TP02Ex01 {

    /**
     * Nomes: Rayssa Silva de Oliveira e João Victor Lima Venceslau
     * 1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
          Caso contrário solicitar novamente apenas o segundo valor.
     */
    public static void main(String[] args) {

          float val1, val2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor");
        val1 = sc.nextFloat();
        
        do
        {
        System.out.println("Digite o Segundo valor (Deverá ser maior que o primeiro):");
        val2 = sc.nextFloat();
        if(val2<=val1)
        {
            System.out.println("Valor não é maior que o primeiro, digite novamente");
        }
        
        }while(val2<=val1);
        
        System.out.println("Obrigada! Encerrando programa..");
    }
    
}
