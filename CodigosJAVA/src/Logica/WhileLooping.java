package Logica;

import java.util.Scanner;

public class WhileLooping {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int somadornumb=0;// serve para reter os números e soma-los no final

            int i=0;// variavel contador
            while(i>=0){// enquanto o i for maior ou igual 0 o looping continua
                System.out.println("digite um numero positivo ou um negativo para encerrar");
                i = sc.nextInt();
                if(i>0){
                    somadornumb+= i;// somar os números que forem adicionados
                    System.out.printf("\n somador de numeros ate o momento: %d \n",somadornumb );
                }
            }
        }
    }


