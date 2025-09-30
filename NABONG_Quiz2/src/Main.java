public class Main {
    public static void main(String[] args) {
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();;
        playerLinkedList.addToFront(new Player(1, "Batman", 700));
        playerLinkedList.addToFront(new Player(2, "Superman", 1000));
        playerLinkedList.addToFront(new Player(3, "Robin", 300));
        playerLinkedList.addToFront(new Player(4, "NightWing", 500));

        playerLinkedList.removeFromFront();

        playerLinkedList.printList();

        System.out.println(playerLinkedList.getSize());

        // Contains
        System.out.println(playerLinkedList.contains(new Player(3, "Robin", 300)));

        // IndexOf
        System.out.println(playerLinkedList.indexOf(new Player(1, "Batman", 700)));
        System.out.println(playerLinkedList.indexOf(new Player(2, "Superman", 1000)));
        }
    }