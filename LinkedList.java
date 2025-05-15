public class LinkedList {
    private static class Node {
        Card card;
        Node next;

        Node (Card card) {
            this.card = card;
        }
    }

    private Node head, tail;

    public void add (Card card) {
        Node node = new Node (card);
        if (tail != null) tail.next = node;
        else head = node;
        tail = node;
    }

    public Card remove() {
        if (head == null) return null;
        Card card = head.card;
        head = head.next;
        if (head == null) tail = null;
        return card;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }    
}