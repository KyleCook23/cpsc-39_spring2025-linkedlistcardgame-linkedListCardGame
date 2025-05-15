import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        LinkedList userDeck = new LinkedList();
        LinkedList computerDeck = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine().trim();
        if (playerName.isEmpty()) {
            playerName = "Player 1";
        }

        int userWins = 0;
        int computerWins = 0;

        java.util.List<Card> fullDeck = Deck.buildShuffledDeck();
        for (int i = 0; i < fullDeck.size(); i++) {
            if (i %2 == 0) userDeck.add(fullDeck.get(i));
            else computerDeck.add(fullDeck.get(i));
        }

        int round = 1;
        System.out.println();
        System.out.println("=== Wlecome to War: " + playerName + " vs. Computer === \n");

        while (!userDeck.isEmpty() && !computerDeck.isEmpty()) {
            System.out.println("Round " + round);
            System.out.println();
            System.out.println(playerName + " cards remaining: " + userDeck.size());
            System.out.println("Computer cards remaining: " + computerDeck.size());

            int totalCards = userDeck.size() + computerDeck.size();
            double percentage = 100.0 * userDeck.size() / totalCards;
            System.out.printf("%s holds %.1f%% of the cards\n", playerName, percentage);

            System.out.print("Press Enter to draw a card...");
            scanner.nextLine();
            System.out.println();

            Card userCard = userDeck.remove();
            Card computerCard = computerDeck.remove();

            System.out.println(playerName + " drew: " + userCard);
            System.out.println("Computer drew: " + computerCard);

            if (userCard.value > computerCard.value) {
                System.out.println(">> " + playerName + " win this round!\n");
                userDeck.add(userCard);
                userDeck.add(computerCard);
                userWins++;
            } else if (computerCard.value > userCard.value) {
                System.out.println(">> Computer wins this round!\n");
                computerDeck.add(userCard);
                computerDeck.add(computerCard);
                computerWins++;
            } else {
                System.out.println(">> It's a tie! Cards are discarded.\n");
            }   

            if (round % 26 == 0) {
                System.out.println();
                System.out.println("Do you want to keep playing? (yes/no)");
                String input = scanner.nextLine().toLowerCase();
                if (!input.equals("yes")) {
                    break;
                }
                System.out.println();
            }
            round++;
        }
        System.out.println("\n=== Game Over ===");
        System.out.println("Rounds Played: " + (round - 1));
        System.out.println(playerName + "'s rounds won: " + userWins);
        System.out.println("Computer rounds won: " + computerWins);

        if (userDeck.isEmpty()){
            System.out.println("Computer wins the game by taking all your cards.");
        } else if (computerDeck.isEmpty()) {
            System.out.println("You win the game by taking all the computers cards!");
        }else if (userWins > computerWins) {
            System.out.println("You win the game by most rounds won!");
        }else if (computerWins > userWins) {
            System.out.println("The computer wins the game by most rounds won!");
        }else {
            System.out.println("Its a draw!");
        }

        scanner.close();
    }
}
