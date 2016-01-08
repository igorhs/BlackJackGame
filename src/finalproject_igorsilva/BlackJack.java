package finalproject_igorsilva;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor Henrique da Silva
 */
public class BlackJack extends Deck {

    public static ArrayList<Deck> deckGame = new ArrayList<>();
    public static ArrayList<Deck> deckPlayer = new ArrayList<>();
    public static ArrayList<Deck> deckDealer = new ArrayList<>();
    
    public void newGame(){    
        deckGame.clear();
        deckPlayer.clear();
        deckDealer.clear();
    }
    
    public int sum(ArrayList sumDeck){
        int qtde = 0 , sum = 0;
        String aux;
        
        for( int i=0; i<sumDeck.size(); i++){
            aux = String.valueOf(sumDeck.get(i));
            
            //If card name is a number
            if (aux.substring(0,1).matches("\\d+")){
                int num = Integer.parseInt(aux.substring(0, aux.indexOf(" ")));
                sum+= num;
            //If card name is not a number  
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
    
    //Enter a bet
    public double bet (double bet, double wallet){
        if(bet<=0){
        JOptionPane.showMessageDialog(null, "Minimum bet: $1.00.\nPlease enter a new bet.");   
        }
        else
        return bet;
        return bet;
    }
    
    //Show cards
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
    
    
    public ArrayList showDealer(){
        for (int i = 0; i < 2; i++) {
            deckDealer.add(deckGame.get(i));
            deckGame.remove(i);            
        }
        return deckDealer;
    }
    
    public ArrayList moreCard(){
        deckPlayer.add(deckGame.get(0));
        deckGame.remove(0);
        return deckPlayer;
    }
    
    //Show points
    public int showPoints(){
        int points;
        points = sum(deckPlayer);
        return points;
    }
    
    public double checkPoints(double wallet, double bet){
        if( sum(deckPlayer) > 21 ) {
            JOptionPane.showMessageDialog(null, "You lose!");
            
            wallet -= bet;
            
            return wallet;
        }
        return wallet;
    }
    
    public double finalScore( double wallet, double bet ){
        if((sum(deckPlayer) > sum(deckDealer) && sum(deckPlayer) <= 21) || sum(deckDealer) > 21){
            JOptionPane.showMessageDialog(null, "Congratilations! You win!");
            return wallet += bet;
        }else if(sum(deckPlayer) == sum(deckDealer)) {
                JOptionPane.showMessageDialog(null, "Tied the game!");
                return wallet;
        } if (wallet == 0){
            JOptionPane.showMessageDialog(null, "You don't have money anymore.");
        }
        return wallet;
    }
}

