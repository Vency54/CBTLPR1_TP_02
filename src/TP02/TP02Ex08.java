package TP02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 * Nomes: Rayssa Silva de Oliveira e João Victor Lima Venceslau
 *
 * 8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem
 * 3x4. Após a digitação dos valores solicitar uma constante multiplicativa, que
 * deverá multiplicar cada valor matriz e armazenar o resultado em outra matriz
 * de mesma ordem, nas posições correspondentes. Exibir as matrizes na tela, sob
 * a forma matricial, ou seja, linhas por colunas.
 */
public class TP02Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha = 3;
        int coluna = 4;

        double k;

        double[][] matriz = new double[linha][coluna];
        double[][] segunda_matriz = new double[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite o valor para posição [" + (i + 1) + "][" + (j + 1) + "]:");
                matriz[i][j] = sc.nextDouble();
            }
        }
        System.out.println();

        System.out.println("Digite uma constante multiplicativa:");
        k = sc.nextDouble();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                segunda_matriz[i][j] = matriz[i][j] * k;
            }

        }

        System.out.println();

        System.out.println("Matriz original:");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();

        }

        System.out.println();

        System.out.println("Matriz multiplicada:");
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(segunda_matriz[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
