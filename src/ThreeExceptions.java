public class ThreeExceptions {
    public static void main(String[] args) {
        ThreeExceptions example = new ThreeExceptions();
        example.throwNullPointerException();
        example.throwIndexOutOfBoundsException();
        example.throwArithmeticException();
    }

    // ArithmeticException method
    public void throwArithmeticException() {
        int result;
        try {
            result = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
    // NullPointerException method
    public void throwNullPointerException() {
        String str = null;
        try {
            System.out.println(str.length()); // Вызов метода у null-ссылки
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }

    // IndexOutOfBoundsException method
    public void throwIndexOutOfBoundsException() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[5]); // Обращение к несуществующему индексу массива
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }
    }


}
