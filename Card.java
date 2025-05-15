public class Card {
    public String suit;
    public String rank;
    public int value;

    public Card (String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
