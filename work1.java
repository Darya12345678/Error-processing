public class work1 {

    public static void main(String[] args) {
        // примеры вызова методов
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result1 = subtractArrays(arr1, arr2);
        int[] result2 = divideArrays(arr1, arr2);

       
    }

    // метод, который выбрасывает ArithmeticException
    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Деление на ноль не допустимо");
        }
        return x / y;
    }

    // метод, который выбрасывает ArrayIndexOutOfBoundsException
    public static int getElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Индекс за пределами массива");
        }
        return array[index];
    }

    // метод, который выбрасывает NumberFormatException
    public static int parse(String str) {
        return Integer.parseInt(str);
    }

    
    
    
    // метод, который возвращает новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке
    public static int[] subtractArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Длины массивов не равны");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    // метод, который возвращает новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке
    
    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            try {
                result[i] = arr1[i] / arr2[i];
            } catch (ArithmeticException e) {
                throw new RuntimeException("Деление на ноль не допустимо");
            }
        }
        return result;
    }

}

