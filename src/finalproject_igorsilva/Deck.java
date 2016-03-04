package finalproject_igorsilva;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Igor Henrique da Silva
 */
 
 //Commentaries were set up both in English and Portuguese.
 
 //Construção da classe "Deck"(baralho).
 //Creating the class "Deck".
public class Deck {
    public static ArrayList<Card> cards = new ArrayList<>(52);
    
    public ArrayList deckList() {
        for(int s=0; s<4; s++) {
            for(int n=0; n<13; n++) {
                cards.add(new Card(n, s));
            }
        }
        return cards;
    }
    
    //Criando o método "shuffleCards" do tipo ArrayList para embaralhar as cartas.
    //Creating the method "shuffleCards" from an ArrayList to shuffle cards.
    public ArrayList shuffleCards() {
        Collections.shuffle(cards);
        return cards;
    }
}
