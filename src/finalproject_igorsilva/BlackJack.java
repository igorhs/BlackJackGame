package finalproject_igorsilva;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor Henrique da Silva
 */
 
//Commentaries were set up both in English and Portuguese.


public class BlackJack extends Deck {

    public static ArrayList<Deck> deckGame = new ArrayList<>();
    public static ArrayList<Deck> deckPlayer = new ArrayList<>();
    public static ArrayList<Deck> deckDealer = new ArrayList<>();
    
    //Criando o método "newGame".
    //Creating the method "newGame".
    public void newGame(){    
        deckGame.clear();
        deckPlayer.clear();
        deckDealer.clear();
    }
    
    //Criando o método "sum" para soma e contagem de cartas no baralho.
    //Creating a method to sum and count the number of cards into the card deck.
    public int sum(ArrayList sumDeck){
        int qtde = 0 , sum = 0;
        String aux;
        
        //Criando um for para determinar o valor da carta na passgem.
        //Creating a for to define the value of the card.
        for( int i=0; i<sumDeck.size(); i++){
            aux = String.valueOf(sumDeck.get(i));
            
            //Se a carta for de algum número.
            //If card name is a number.
            if (aux.substring(0,1).matches("\\d+")){
                int num = Integer.parseInt(aux.substring(0, aux.indexOf(" ")));
                sum+= num;
                
            // Se a carta não for numérica.
            //If card name is not a number.
            }else if ((aux.substring(0,4).equals("Jack")) || (aux.substring(0,5).equals("Queen")) || (aux.substring(0,4).equals("King")))
                    sum+=10;
            else if ( aux.substring(0,3).equals("Ace") ){
                qtde+=1;
                if( qtde == 1 && sum <= 10 )
                sum += 11;
                else 
                sum += qtde;
            }
        }
        return sum;
    }
    
    //Defina uma aposta.
    //Enter a bet.
    public double bet (double bet, double wallet){
        if(bet<=0){
        JOptionPane.showMessageDialog(null, "Minimum bet: $1.00.\nPlease enter a new bet.");   
        }
        else
        return bet;
        return bet;
    }
    
    //Método para mostrar as cartas.
    //Method to show the cards.
    public ArrayList showPlayer(){
        BlackJack bj = new BlackJack();
        bj.deckList();
        deckGame = bj.shuffleCards();
        for (int i = 0; i < 2; i++) {
            deckPlayer.add(deckGame.get(i));
            deckGame.remove(i);
        } 
        return deckPlayer;
    }
    
    //Método para mostrar as cartas do Dealer.
    //Method to show the Dealer's cards.
    public ArrayList showDealer(){
        for (int i = 0; i < 2; i++) {
            deckDealer.add(deckGame.get(i));
            deckGame.remove(i);            
        }
        return deckDealer;
    }
    
    //Método para adicionar mais cartas ao baralho.
    //Method to add more cards to the card deck.
    public ArrayList moreCard(){
        deckPlayer.add(deckGame.get(0));
        deckGame.remove(0);
        return deckPlayer;
    }
    
    //Método para mostrar a pontuação do jogo.
    //Method to show the game score.
    public int showPoints(){
        int points;
        points = sum(deckPlayer);
        return points;
    }
    
    //Método para checar a pontuação do jogo.
    //Method to check the game score.
    public double checkPoints(double wallet, double bet){
        
        //Se o jogador(usuário) obter somatório(pontuação) maior que 21, fim de jogo.
        //If the player(user) gets a score greater than 21, game over.
        if( sum(deckPlayer) > 21 ) {
            JOptionPane.showMessageDialog(null, "You lose!");
            
            wallet -= bet;
            
            return wallet;
        }
        return wallet;
    }
    
    //Método para determinar o placar final do jogo.
    //Method to show the final score of the game.
    public double finalScore( double wallet, double bet ){
        
        /*Se a pontuação do jogador(usuário) for maior que a do Dealer e menor, ou igual a 21,
          Ou se a pontuação do Dealer for maior que 21, o jogador(usuário) ganha.*/
          
        /*If the player's final score is greater than the Dealer's final score, and lesser or equals to 21,
          Or if the Dealer's final score is greater than 21, the player wins.*/
        if((sum(deckPlayer) > sum(deckDealer) && sum(deckPlayer) <= 21) || sum(deckDealer) > 21){
            JOptionPane.showMessageDialog(null, "Congratilations! You win!");
            return wallet += bet;
        }
        
        //Se a pontuação de ambos, jogador e Dealer, forem iguais, o jogo empata.
        //If the players final score and the Dealer's final score are the same, the game will be tied.
        else if(sum(deckPlayer) == sum(deckDealer)) {
                JOptionPane.showMessageDialog(null, "Tied the game!");
                return wallet;
        } 
        
        //Se "wallet"(carteira) estiver zerada, fim de jogo.
        //If the wallet is empty, end of game.
        if (wallet == 0){
            JOptionPane.showMessageDialog(null, "You don't have money anymore.");
        }
        return wallet;
    }
}
