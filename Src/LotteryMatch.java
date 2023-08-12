import java.util.Arrays;
import java.util.Random;

public class LotteryMatch {
    public static void main(String[] args) {
        int[] firstArray = generateRandomArray(7);
        int[] secondArray = generateRandomArray(7);

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        int matchCount = countMatches(firstArray, secondArray);
        System.out.println("Кількість збігів: " + matchCount);
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }

        return array;
    }

    public static int countMatches(int[] first, int[] second) {
        int matchCount = 0;

        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                matchCount++;
            }
        }

        return matchCount;
    }
}





