import java.util.*;

public class Deck {
    private static final String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static List<Card> buildShuffledDeck() {
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i < RANKS.length; i++) {
            for (String suit : SUITS) {
                deck.add(new Card(RANKS[i], suit, i + 2));
            }
        }

        Collections.shuffle(deck);
        return deck;
    }
}