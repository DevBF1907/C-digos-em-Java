package Logica;

import java.util.Scanner;

public class CalculadoraMatriz {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int matriz1[][]= new int[2][2],
                    matriz2[][]= new int[2][2];
            int opc=0;
            int sum[][]= new int[2][2];
            int sub[][]= new int[2][2];


            System.out.println("-------------------------------------------------------------------------");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.printf("Digite o elementos das Matriz1 [linha " +
                            " %d / coluna %d ] : ", i + 1, j + 1);
                    matriz1[i][j] = sc.nextInt();
                }
            }
            System.out.println("-------------------------------------------------------------------------");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {

                    System.out.printf("Digite o elementos das Matriz2 [linha " +
                            " %d / coluna %d ] : ", i + 1, j + 1);
                    matriz2[i][j] = sc.nextInt();
                }
            }
            do {
                System.out.println("--------------------------------- ");
                System.out.println("ESCOLHA A OPÇÃO: ");
                System.out.println("1) SOMAR");
                System.out.println("2) SUBTRAÇÃO");
                System.out.println("3) MOSTRAR AS MATRIZES");
                opc = sc.nextInt();

                switch (opc) {
                    case 1:
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                sum[i][j] = matriz1[i][j] + matriz2[i][j];
                                System.out.println(" Matriz1[" + (i + 1) + "][" + (j + 1) + "] + Matriz2[" + (i + 1) + "][" + (j + 1) + "] / " + matriz1[i][j] + " + " + matriz2[i][j] + " é igual a: " + sum[i][j]);
                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                sub[i][j] = matriz1[i][j] - matriz2[i][j];
                                System.out.println(" Matriz1[" + (i + 1) + "][" + (j + 1) + "] - Matriz2[" + (i +1) + "][" + (j +1) + "] / " + matriz1[i][j] + " - " + matriz2[i][j] + " é igual a: " + sub[i][j]);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("MOSTRANDO A PRIMEIRA MATRIZ ---------------------");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.printf(" [Linha %d] [coluna %d]  valor: %d  \n", i+1,j+1, matriz1[i][j]);
                            }
                        }
                        System.out.println("MOSTRANDO A SEGUNDA MATRIZ ---------------------");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.printf("[Linha %d] [coluna %d]  valor: %d \n", i+1, j+1, matriz2[i][j]);
                            }
                        }
                        break;
                    case 4: System.exit(0);break;
                    default: System.out.println("OPÇÃO INVÁLIDA!!!!!");break;
                }
                System.out.println("CONTINUAR 1 PARAR O");sc.nextInt();
            }while(opc !=0);
        }
    }

