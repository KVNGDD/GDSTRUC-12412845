public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 25;
        numbers[1] = -3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 20;
        numbers[7] = -8;
        numbers[8] = 173;
        numbers[9] = 65;

        System.out.println("Array:");
        printArrayElements(numbers);

        System.out.println("\n\nModify the BubbleSort and SelectionSort to sort arrays in descending :");
        bubbleSort(numbers);
        printArrayElements(numbers);

        System.out.println("\n\nModify the Selection Sort to look for the smallest value first and put it at the end instead of looking for the largest and putting it in the beginning :");
        selectionSort(numbers);
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] arr) {
        // O(n^2)
        // n^2 - 2n + 1 iterations (total)
        // outer for-loop (n-1) iterations
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // inner for-loop (n-1) iterations
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] < arr[i + 1]) { // Less than so it can be Descending Order
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int smallest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] < arr[smallest]) { // Less than so it can be Descending Order
                    smallest = i;
                }
            }

            if (smallest != lastUnsortedIndex) {
                int temp = arr[smallest];
                arr[smallest] = arr[lastUnsortedIndex];
                arr[lastUnsortedIndex] = temp;
            }
        }
    }

    private static void printArrayElements(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}