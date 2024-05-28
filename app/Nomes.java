
package app;

import java.util.Scanner;

public class Nomes {
    
    public static void nomeJogadores (String nome1, String nome2){
             Scanner scani = new Scanner(System.in);
        System.out.println("jogador 1: digite seu nome: ");
       
        nome1 = scani.nextLine();
        System.out.println("Jogador 2: digite seu nome: ");
        Scanner scan2 = new Scanner(System.in);
        nome2 = scan2.nextLine();

    }
}