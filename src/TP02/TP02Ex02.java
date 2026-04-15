
package TP02;
import java.util.*;
    /**
     * Nomes: Rayssa Silva de Oliveira e João Victor Lima Venceslau
     *2. Entrar via teclado com dez valores positivos. Consistir a digitação e
     * enviar mensagem de erro, se necessário. Após a digitação, exibir: 
     * a. O maior valor; 
     * b. A soma dos valores; 
     * c. A média aritmética dos valores.
     */
public class TP02Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maior = 0;
        int soma = 0;
        float media;
        
        int[] Numeros;
        
        Numeros = new int[10];
       
        
        for(int i = 0; i < Numeros.length; i++ ){
           do
           {
           System.out.println("Digite o " + (i+1) + "° valor:");
           Numeros[i] = sc.nextInt();
                if(Numeros[i]<0)
                 {
               System.out.println("Valor inválido!Digite de novo:");
                 }
           }while(Numeros[i]<0);  
        }
        
        for( int j = 0; j < Numeros.length; j++){
            soma = soma + Numeros[j];
            if(maior < Numeros[j]){
            maior = Numeros[j];
            }
        }
        media = soma / Numeros.length;
        
        System.out.println("Valor Maior: " + maior);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média aritmética: " + media);
        
        
        
    }

}
