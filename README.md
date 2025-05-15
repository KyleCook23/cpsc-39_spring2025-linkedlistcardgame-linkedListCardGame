## Name and Date
Kyle Cook
May 14, 2025

## What I Added

- A playable WAR card game using a custom Linked List structure.
- A `Card` class to hold suit, rank, and value.
- A `LinkedList` class to simulate a queue-style deck.
- A fully functional `CardGame.java` where you (the user) play against the computer.
- Deck depletion as a win condition (finite 52-card deck)
- A card count display each round
- A percentage tracker showing how much of the deck the user holds
- A round system that tracks win counts and asks if you want to continue every 26 rounds.
- A name prompt to personalize the game and make it more engaging.

## File Overview

- `Card.java` – Card structure (suit, rank, value)
- `LinkedList.java` – Custom singly linked list for player decks
- `Deck.java` – Builds and shuffles the 52-card deck
- `CardGame.java` – Handles gameplay, user interaction, round logic
- `README.md` – Documentation and game instructions

## Game Rules

- Each player draws the top card from their deck.
- The card with the higher value wins the round.
- The winner collects both cards into their deck.
- A tie discards both cards.
- The game ends when either player runs out of cards or the user decides to stop playing.
- The player with the most round wins is the victor.

## Linked List Usage

The game uses a custom `LinkedList` to simulate each player’s hand:
- Draw from the front of the list
- Add won cards to the back
- Tracks size and emptiness for game-ending conditions

This reinforces queue behavior without relying on built-in Java classes.

## How to Play

1. **Run the program**:
2. **Enter your name** when prompted.

3. Each round, press **Enter** to draw a card.

4. Your card is compared to the computer’s:
- Higher card wins the round.
- Winner adds both cards to the bottom of their deck.
- Ties result in both cards being discarded.

5. Every **26 rounds**, you’ll be asked if you want to continue playing.

6. The game ends when:
- One player runs out of cards, or
- You choose to stop.

7. The game displays final stats, including:
- Total rounds played
- Round wins for each player
- Final winner based on deck depletion or round count

## Requirements Met

- Simulates two players: **User vs. Computer**
- Uses **Linked List** as core data structure
- Includes card drawing and comparing logic
- Finite deck ensures game ends
- Round-based logic with win tracking
- Text-based with meaningful user interaction

Enjoy playing and may the best deck win! 🏆