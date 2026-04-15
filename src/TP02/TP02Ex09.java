package TP02;


import java.util.*;

/**
 * Nomes: Rayssa Silva de Oliveira e João Victor Lima Venceslau 9. Entrar com
 * uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
 * sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a
 * digitação dos elementos, calcular e exibir a matriz transposta.
 */
public class TP02Ex09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha;
        int coluna;

        while (true) {
            System.out.println("Digite a quantidade de linhas:");

            while (!sc.hasNextInt()) {
                System.out.println("Digite apenas números");
                sc.next();
            }

            linha = sc.nextInt();

            System.out.println("Digite a quantidade de colunas:");

            while (!sc.hasNextInt()) {
                System.out.println("Digite apenas números");
                sc.next();
            }
            coluna = sc.nextInt();

            if (linha <= 10 && coluna <= 10) {
                break;
            } else {
                System.out.println("Erro: linhas e colunas não podem ser maiores que 10!");
            }
        }

        double[][] matriz = new double[linha][coluna];
        double[][] transposta = new double[coluna][linha];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite o valor para posição [" + (i + 1) + "][" + (j + 1) + "]:");
                matriz[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz Original:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz transposta:");
        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
