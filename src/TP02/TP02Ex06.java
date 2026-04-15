package TP02;


import java.util.*;

/**
 * Nomes: Rayssa Silva de Oliveira e João Victor Lima Venceslau
 *
 6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na
 tela.
 */
public class TP02Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha = 2;
        int coluna = 3;

        String[][] matriz = new String[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite o nome para posição [" + (i + 1) + "][" + (j + 1) + "]:");
                matriz[i][j] = sc.nextLine();
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
