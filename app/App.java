//CÓDIGO PRINCIPAL 
//////////////////classes importadas
package app;
import java.util.Scanner;
import java.util.Random;

//////////////////classe principal
public class App {
    
    public static void main(String[] args) {
        
         Scanner scani = new Scanner(System.in);
          Scanner scan2 = new Scanner(System.in);
//        String nome1 = scani.nextLine();
//        String nome2 = scan2.nextLine();
        int numero=0;
        int numero2=0;
       String nome1 = scani.nextLine();
        String nome2 = scan2.nextLine();
//        
        Nomes jogadores = new Nomes();
        jogadores.nomeJogadores(nome1, nome2);
        
//        
//////////////////////////////////////////////PEDRA PAPEL E TESOURA 
////PedraPapelTesoura partida = new PedraPapelTesoura(); instancia a classe auxiliar´PedraPapelTesoura
////partida.jogar(numero, numero2, nome1, nome2); chama o método jogar, definido na classe auxiliar pedra papel e tesoura
PedraPapelTesoura partida = new PedraPapelTesoura();
partida.jogar(numero, numero2, nome1, nome2);


// Gun arma = new Gun(); //Gun = Classe auxiliar da arma que determina momento de atirar // código que instancia(chama) a classe auxiliar Gun
//     arma.atirar(); //Método de atirar, definido na classe auxiliar Gun
     Gun arma = new Gun();
     arma.atirar();
    
    
  
    
    }
}