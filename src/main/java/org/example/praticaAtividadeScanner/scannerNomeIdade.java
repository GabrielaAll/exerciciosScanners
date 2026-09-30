package org.example.praticaAtividadeScanner;

import java.util.Scanner;

public class scannerNomeIdade {
    public static void main(String[] args) {

        //Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        int idadeNova = (idade + 1);

        System.out.println("Oi " + nome + ", você tem " + idade + " anos e vai fazer " + idadeNova + " no próximo aniversário.");

        sc.close();
    }
}
