package TP02;


import java.util.*;

/**
  * Nomes: Rayssa Silva de Oliveira e João Victor Lima Venceslau
 * 
 4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores
 na tela.
 */
public class TP02Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha = 2;
        int coluna = 3;

        double[][] matriz = new double[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite o valor para posição [" + (i + 1) + "][" + (j + 1) + "]:");
                matriz[i][j] = sc.nextDouble();
            }
        }
        
        System.out.println();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Posição[" + (i + 1) + "][" + (j + 1) + "]:" + matriz[i][j]);
            }
        }

    }
}
