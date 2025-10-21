import java.util.Scanner;

public class Main {
    private static int nextPlayerID = 1;
    public static void main(String[] args) {

        int turnNumber = 0;
        int amountOfGames = 1;

        ArrayQueue playerQueue = new ArrayQueue(10);

        do {
            turnNumber++;
            System.out.println("=================== TURN # " + turnNumber + " ===================");
            matchmaking(playerQueue);
            playerQueue.printQueue();

            if (playerQueue.size() >= 5) {
                System.out.println("\n                   QUEUE # " + amountOfGames);
                enterGame(playerQueue);
                amountOfGames++;
                playerQueue.printQueue();
            }

            pressEnterToContinue();

        } while (amountOfGames <= 10);

        System.out.println("Max matches reached, can no longer queue");

    }
    public static void matchmaking(ArrayQueue playerQueue) {
        int tempNum = rng();

        for (int i = 0; i < tempNum; i++) {
            playerQueue.enqueue(new Player(nextPlayerID++));
        }
        System.out.println("\n                 [FINDING MATCH]");
        System.out.println("               " + playerQueue.size() + " player/s queued" );
        System.out.println("\nIn Queue:\n");
    }

    public static void enterGame(ArrayQueue playerQueue) {
        int maxPlayerCount = 5;

        if (playerQueue.size() == 5) {
            System.out.println("\n           " + playerQueue.size() + " / 5 Players. MATCH FOUND");
        } else if (playerQueue.size() > 5) {
            System.out.println("\n                 " + playerQueue.size() + " / 5 Players");
            System.out.println("\nMATCH FOUND, returning excess players to queue");
        }

        for (int i = 0; i < maxPlayerCount; i++){
            playerQueue.dequeue();
        }

        if (playerQueue.size() == 0) {
            System.out.println("\nPlayer Queue is empty.");
        } else {
            System.out.println("\nUpdated Queue:\n");
            // print the queue contents here if you have that part
        }
    }

    public static int rng(){
        int min = 1;
        int max = 7;
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void pressEnterToContinue() {
        System.out.print("\nPress [ENTER] to continue...\n");
        scanner.nextLine();
    }
}

