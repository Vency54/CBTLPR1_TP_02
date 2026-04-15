package TP02;


import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
  * Nomes: Rayssa Silva de Oliveira e João Victor Lima Venceslau
 *
5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
 */
public class TP02Ex05 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha = 3;
        int coluna = 2;

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
