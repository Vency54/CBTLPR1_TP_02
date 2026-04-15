package TP02;


import java.util.*;

/**
 * Nomes: Rayssa Silva de Oliveira e João Victor Lima Venceslau
 *
 3. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a
 quantidade de números) será digitado, deverá ser positivo, porém menor que
 vinte. Caso a quantidade não satisfaça a restrição, enviar mensagem de erro e
 solicitar o valor novamente. Após a digitação dos “N” valores, exibir: a. O
 maior valor; b. O menor valor; c. A soma dos valores; d. A média aritmética
 dos valores; e. A porcentagem de valores que são positivos; f. A porcentagem
 de valores negativos;
 *
 Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução
 do programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e
 encerrar o programa em função dessa resposta.
 */

public class TP02Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] Valores;

        int N;

        String Escolha;

        while (true) {

            double maior;
            double menor;
            double soma = 0;
            double positivos = 0;
            double negativos = 0;
            double media;

            System.out.println("Digite o número de valores:");
            N = sc.nextInt();
            
            System.out.println(" ");


            Valores = new double[N];

            for (int i = 0; i < Valores.length; i++) {

                System.out.println("Digite o " + (i + 1) + "° valor:");

                while (!sc.hasNextDouble()) {
                    System.out.println("Digite apenas números");
                    sc.next();
                }

                Valores[i] = sc.nextDouble();

            }
            
            menor = Valores[0];
            maior = Valores[0];

            for (int j = 0; j < Valores.length; j++) {
                soma = soma + Valores[j];
                if (maior < Valores[j]) {
                    maior = Valores[j];
                }
                if (menor > Valores[j]) {
                    menor = Valores[j];
                }

                if (0 < Valores[j]) {
                    positivos++;
                }
                if (0 > Valores[j]) {
                    negativos++;
                }
            }
            media = soma / Valores.length;

            double Porc_positivos = (positivos / (double) N) * 100;
            double Porc_negativos = (negativos / (double) N) * 100;
            
            System.out.println(" ");

            System.out.println("Valor Maior: " + maior);
            System.out.println("Valor Menor: " + menor);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média aritmética: " + media);
            System.out.printf("Porcentagem de Positivos: %.2f%%%n", Porc_positivos);
            System.out.printf("Porcentagem de Negativos %.2f%%%n", Porc_negativos);
            
            System.out.println(" ");
            
            System.out.println("Deseja uma nova execução do programa?");
            System.out.println("S para Sim");
            System.out.println("N para Não");

            sc.nextLine(); // limpa o buffer
            Escolha = sc.nextLine();

            while (!Escolha.equals("S") && !Escolha.equals("N")) {
                System.out.println("Digite apenas S ou N:");
                Escolha = sc.nextLine();
            }

            if (Escolha.equals("S")) {
                for (int i = 0; i < 30; i++) {
                    System.out.println(" ");
                }

            }

            if (Escolha.equals("N")) {
                break;
            }

        }
    }
}
