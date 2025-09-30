public class PlayerLinkedList {
    private PlayerNode head;

    private int size;

    public void addToFront(Player player) {
        PlayerNode newNode = new PlayerNode(player);

        // list is not empty
        if (head != null) {
            newNode.setNext(head);
        }

        head = newNode;

        size++;
    }

    public void printList() {
        PlayerNode current = head;

        System.out.print("HEAD -> ");

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNext();
        }

        System.out.print("NULL");
    }

    public void removeFromFront() {
        head = head.getNext();
        size--;
    }

    public int getSize() {
        return size;
    }

    public boolean contains(Player player) {
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }
}