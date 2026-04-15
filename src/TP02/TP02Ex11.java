package TP02;


import java.util.*;

/**
 * Nomes: Rayssa Silva de Oliveira e João Victor Lima Venceslau
 *
 * 11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida
 * pelo usuário, sendo que no máximo será de ordem 10 e quadrática. Após a
 * digitação dos elementos, calcular e exibir determinante da matriz.
 */
public class TP02Ex11 {

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

        double det = calcularDeterminante(matriz);

        System.out.println("\nMatriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.printf("\nO determinante da matriz é: %.2f\n", det);

        sc.close();

    }

    public static double calcularDeterminante(double[][] matrizA) {
        int n = matrizA.length;
        double det = 1.0;

        double[][] m = new double[n][n];
        for (int i = 0; i < n; i++) {
            m[i] = matrizA[i].clone();
        }

        for (int i = 0; i < n; i++) {
            int pivo = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(m[k][i]) > Math.abs(m[pivo][i])) {
                    pivo = k;
                }
            }

            if (Math.abs(m[pivo][i]) < 1e-10) {
                return 0.0;
            }

            if (pivo != i) {
                double[] temp = m[i];
                m[i] = m[pivo];
                m[pivo] = temp;
                det *= -1;
            }

            det *= m[i][i];

            for (int k = i + 1; k < n; k++) {
                double fator = m[k][i] / m[i][i];
                for (int j = i + 1; j < n; j++) {
                    m[k][j] -= fator * m[i][j];
                }
            }
        }
        return det;
    }

}
