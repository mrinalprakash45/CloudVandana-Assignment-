import java.util.Random;

public class ArrayShuffler {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(array);

        shuffleArray(array);

        System.out.println("\nShuffled Array:");
        printArray(array);
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            // Swap the elements at index i and index
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
