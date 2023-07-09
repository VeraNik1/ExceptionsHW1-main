import java.util.Arrays;

public class ArraysSubtraction {
    public static void main(String[] args) {
        int[] array1 = {5, 10, 13, 5, 4};
        int[] array2 = {0, 20, 12, 8, 9};

        try {
            int[] result = subtractArrays(array1, array2);
            System.out.println(Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static int[] subtractArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Невозможно выполнить вычитание, длины массивов не совпадают");
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        return result;
    }
}
