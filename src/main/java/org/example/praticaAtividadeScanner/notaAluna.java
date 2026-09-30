package org.example.praticaAtividadeScanner;

import java.util.Scanner;

public class notaAluna {
    public static void main(String[] args) {

        //Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota de uma da aluna: ");
        double notaAluna = sc.nextDouble();

        if (notaAluna >= 7.0) {
            System.out.println("Aluna aprovada!");
        }
        else if (notaAluna >= 5.0 && notaAluna <= 6.9) {
            System.out.println("Aluna em recuperação.");
        }
        else {
            System.out.println("Aluna reprovada.");
        }

        sc.close();
    }
}
