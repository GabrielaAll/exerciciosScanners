package org.example.praticaAtividadeScanner;

import java.util.Scanner;

public class subMultiResto {
    public static void main(String[] args) {

        //Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int numero2 = sc.nextInt();

        System.out.println("A SOMA desses números é: " + (numero1 + numero2));
        System.out.println("A SUBTRAÇÃO desses números é: " + (numero1 - numero2));
        System.out.println("A MULTIPLICAÇÃO desses números é: " + (numero1 * numero2));
        System.out.println("A DIVISÃO desses números é: " + (numero1 / numero2));
        System.out.println("O RESTO da divisão desses números é: " + (numero1 % numero2));

        sc.close();
    }
}
