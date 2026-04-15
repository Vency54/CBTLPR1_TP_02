package TP02;


import java.util.*;

/**
 * Nomes: Rayssa Silva de Oliveira e João Victor Lima Venceslau 
 * 
 * 10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
 * sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos
 * elementos, calcular e exibir a matriz inversa. Exibir as matrizes na tela,
 * sob a forma matricial (linhas x colunas).
 */
  

public class TP02Ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;

        while (true) {
            System.out.println("Digite a ordem da Matriz (MxM):");
            while (!sc.hasNextInt()) {
                System.out.println("Erro: Digite apenas números inteiros.");
                sc.next();
            }
            m = sc.nextInt();

            if (m > 0 && m <= 10) {
                break;
            } else {
                System.out.println("Erro: A ordem deve ser entre 1 e 10!");
            }
        }

        double[][] matriz = new double[m][m];

 
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }


        double[][] aumentada = new double[m][2 * m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                aumentada[i][j] = matriz[i][j];
            }
            aumentada[i][i + m] = 1.0; 
        }

    
        double[][] resultado = gaussJordan(aumentada);


        if (resultado == null) {
            System.out.println("\nA matriz não possui inversa (é singular).");
        } else {
            System.out.println("\nMatriz original:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("%.2f\t", matriz[i][j]);
                }
                System.out.println();
            }

            System.out.println("\nMatriz inversa:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("%.2f\t", resultado[i][j + m]);
                }
                System.out.println();
            }
        }

        sc.close();
    }


    public static double[][] gaussJordan(double[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++) {

            if (Math.abs(mat[i][i]) < 1e-10) {
                boolean trocou = false;
                for (int k = i + 1; k < m; k++) {
                    if (Math.abs(mat[k][i]) > 1e-10) {
                        double[] temp = mat[i];
                        mat[i] = mat[k];
                        mat[k] = temp;
                        trocou = true;
                        break;
                    }
                }
                if (!trocou) return null;
            }

            double pivo = mat[i][i];

            for (int j = 0; j < n; j++) {
                mat[i][j] /= pivo;
            }

            for (int k = 0; k < m; k++) {
                if (k != i) {
                    double fator = mat[k][i];
                    for (int j = 0; j < n; j++) {
                        mat[k][j] -= fator * mat[i][j];
                    }
                }
            }
        }
        return mat;
    }
}
