package finalproject_igorsilva;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Igor Henrique da Silva
 */
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
    
    public ArrayList shuffleCards() {
        Collections.shuffle(cards);
        return cards;
    }
}
