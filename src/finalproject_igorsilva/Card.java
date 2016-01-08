package finalproject_igorsilva;

/**
 *
 * @author Igor Henrique da Silva
 */

public class Card {
    private String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "King", "Queen", "Jack", "Ace"};
    private String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private int name, suit;
    
    public Card(int n, int s) {
        this.name = n;
        this.suit = s;
    }
    
    @Override
    public String toString() {
        String oneCard = names[name] + " of " + suits[suit];
        return oneCard;
    }
}
