public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 14 + 1);
        }
        int[] test = {1, 1, 1, 3, 4, 4, 6, 6, 8, 8, 9, 9, 1, 1, 4, 3, 8};
        System.out.println(uniqueNumbersCounter(test));
        System.out.println(uniqueNumbersCounter(array));
    }

    public static int uniqueNumbersCounter(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                counter++;
            }
        }
        return counter;
    }
}
