import java.util.Arrays;

public class ArraysDivision {
    public static void main(String[] args) {
        int[] array1 = {15, 90, 35};
        int[] array2 = {0, 0, 0, 0};

        try {
            int[] result = divideArrays(array1, array2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static int[] divideArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Деление не может быть выполнено, длины массивов не совпадают");
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Невозможно выполнить деление на ноль");
            }
            result[i] = array1[i] / array2[i];
        }

        return result;
    }
}
