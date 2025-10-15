import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CardStack playerDeck = new CardStack();
        playerDeck.push(new Card(1, "Batman"));
        playerDeck.push(new Card(2, "Superman"));
        playerDeck.push(new Card(3, "Flash"));
        playerDeck.push(new Card(4, "Wonder Woman"));
        playerDeck.push(new Card(5, "Aquaman"));
        playerDeck.push(new Card(6, "Green Lantern"));
        playerDeck.push(new Card(7, "Martian Manhunter"));
        playerDeck.push(new Card(8, "Cyborg"));
        playerDeck.push(new Card(9, "Robin"));
        playerDeck.push(new Card(10, "Nightwing"));
        playerDeck.push(new Card(11, "Plastic Man"));
        playerDeck.push(new Card(12, "Hawk Girl"));
        playerDeck.push(new Card(13, "Black Canary"));
        playerDeck.push(new Card(14, "Starfire"));
        playerDeck.push(new Card(15, "Shazam"));
        playerDeck.push(new Card(16, "Joker"));
        playerDeck.push(new Card(17, "Lex Luthor"));
        playerDeck.push(new Card(18, "Reverse Flash"));
        playerDeck.push(new Card(19, "Cheetah"));
        playerDeck.push(new Card(20, "Black Manta"));
        playerDeck.push(new Card(21, "Sinestro"));
        playerDeck.push(new Card(22, "Malefic"));
        playerDeck.push(new Card(23, "Vandal Savage"));
        playerDeck.push(new Card(24, "Deathstroke"));
        playerDeck.push(new Card(25, "Bane"));
        playerDeck.push(new Card(26, "Mr. Freeze"));
        playerDeck.push(new Card(27, "Harley Quinn"));
        playerDeck.push(new Card(28, "Two-Face"));
        playerDeck.push(new Card(29, "Brainiac"));
        playerDeck.push(new Card(30, "Black Adam"));

        CardStack playerHand = new CardStack();
        CardStack discardedPile = new CardStack();

        int turnNumber = 1;
        final int DRAW_ACTION = 0;
        final int DISCARD_ACTION = 1;
        final int GET_DISCARD_ACTION = 2;

        while (!playerDeck.isEmpty()) {

            System.out.println("================= TURN # " + turnNumber + " =================");
            int choice =  (int)(Math.random() * 3);

            if (playerHand.isEmpty()){
                choice = DRAW_ACTION;
            }


            if (discardedPile.isEmpty() && choice == GET_DISCARD_ACTION){
                choice =  (int)(Math.random() * 2);
            }

            switch (choice) {
                case DRAW_ACTION:
                    System.out.println("DRAWING Card/s :\n");
                    drawCards(playerDeck, playerHand);
                    break;
                case DISCARD_ACTION:
                    System.out.println("DISCARDING Card/s : \n");
                    discardedCards(playerHand, discardedPile);
                    break;
                case GET_DISCARD_ACTION:
                    System.out.println("RETRIEVING DISCARDED Card/s : \n");
                    getDiscardedCards(discardedPile, playerHand);
                    break;

            }

            System.out.println("\n----------------- INVENTORY ----------------");

            System.out.println("CURRENT HAND:");
            playerHand.printStack();
            System.out.println("\n# of cards remaining in deck: " + playerDeck.size());
            System.out.println("# of cards in discarded pile: " + discardedPile.size());
            System.out.println("===========================================");

            turnNumber++;
            pressEnterToContinue();
        }

        System.out.println("GAME OVER! DECK IS EMPTY!");
    }

    public static int rng(){
        int min = 1;
        int max = 5;
        return (int)(Math.random() * (max - min + 1)) + min;
    }
    public static void pressEnterToContinue() {
        Scanner s = new Scanner(System.in);
        System.out.println("Press [ENTER] to Continue");

        s.nextLine();
    }

    public static void drawCards(CardStack hand, CardStack playerHand) {
        int tempRandNum = rng();

        while (tempRandNum > hand.size()){
            tempRandNum = rng();
        }

        for (int i = 0; i < tempRandNum; i++) {

            if (!hand.isEmpty()) {
                Card poppedCard = hand.pop();
                playerHand.push(poppedCard);

                System.out.println("DREW " + poppedCard.toString() + " Card!");
            }
            else {
                System.out.println("CARD DECK is EMPTY.");
                break;
            }

        }

    }

    public static void discardedCards(CardStack hand, CardStack discardedPile) {
        int tempRandNum = rng();

        while (tempRandNum > hand.size()){
            tempRandNum = rng();
        }

        for (int i = 0; i < tempRandNum; i++) {
            if (!hand.isEmpty()) {
                Card poppedCard = hand.pop();
                discardedPile.push(poppedCard);

                System.out.println("DISCARDED " + poppedCard.toString()+ " Card!");
            }
            else {
                System.out.println("CARD DECK is EMPTY.");
                break;
            }
        }
    }


    public static void getDiscardedCards(CardStack discardPile, CardStack playerHand){
        int tempRandNum = rng();

        while (tempRandNum > discardPile.size()){
            tempRandNum = rng();
        }
        for (int i = 0; i < tempRandNum; i++) {
            if (!discardPile.isEmpty()) {
                Card poppedCard = discardPile.pop();
                playerHand.push(poppedCard);

                System.out.println("RETRIEVED DISCARDED " + poppedCard.toString() + " Card!");
            }
            else {
                System.out.println("CARD DECK is EMPTY.");
                break;
            }
        }
    }

}