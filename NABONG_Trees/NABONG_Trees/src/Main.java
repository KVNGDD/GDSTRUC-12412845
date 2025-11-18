public class Main {
    public static void main(String[] args) {
        Trees bst = new Trees();
        bst.insert(25);
        bst.insert(20);
        bst.insert(15);
        bst.insert(27);
        bst.insert(30);
        bst.insert(29);
        bst.insert(26);
        bst.insert(22);
        bst.insert(32);

        bst.traverseInOrderAsc();

        int value = 100;

        System.out.println("\nNode with value " + value + " - " + bst.get(value) + "\n");

        bst.traverseInOrderDesc();

        System.out.println("\nLowest Value " + bst.getMin());
        System.out.println("Highest Value " + bst.getMax());

    }
}