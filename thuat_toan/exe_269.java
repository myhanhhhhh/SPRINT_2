import java.util.Arrays;

public class exe_269 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9};

        int sumMin = sumMin(numbers);
        System.out.println("min: " + sumMin);

        int sumMax = sumMax(numbers);
        System.out.println("max: " + sumMax);
    }

    private static int sumMin(int[] numbers) {
        int min = 0;
        for (int i = 0; i < 4; i++) {
            min += numbers[i];
        }
        return min;
    }

    private static int sumMax(int[] numbers) {
        Arrays.sort(numbers);
        int max = 0;
        for (int i = 1; i <5 ; i++) {
            max += numbers[i];
        }
        return max;
    }
}
