public class exe_280 {
    public static boolean findArray(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] arr1 = {'d', 'l', 'r', 'o', 'W', ' ', 'o', 'l', 'l', 'e', 'H'};
        char[] arr2 = {'a', 'b', 'c', 'c', 'b', 'a'};
        char[] arr3 = {'a', 'b', 'c', 'd', 'e', 'f'};
        System.out.println(findArray(arr1));
        System.out.println(findArray(arr2));
        System.out.println(findArray(arr3));
    }
}
