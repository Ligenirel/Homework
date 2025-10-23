package lesson_2;

public class Main {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void main(String[] args) {
        printThreeWords();
    }
}

class SumChecker {
    public static void checkSumSign() {
        System.out.println("\nex 2");
        int a = 37, b = 12;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void main(String[] args) {
        checkSumSign();
    }
}

class ColorPrinter {

    public static void printColor() {
        int value = -1; // можно изменить на любое значение

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void main(String[] args) {
        printColor();
    }
}

class NumberComparator {

    public static void compareNumbers() {
        int a = 3;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void main(String[] args) {
        compareNumbers();
    }
}

 class SumRangeChecker {

    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        // Проверяем включительно от 10 до 20
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        System.out.println("Проверка граничных значений:");

        System.out.println("10 + 0 = 10: " + checkSumInRange(10, 0));      // true
        System.out.println("9 + 1 = 10: " + checkSumInRange(9, 1));        // true
        System.out.println("20 + 0 = 20: " + checkSumInRange(20, 0));      // true
        System.out.println("19 + 1 = 20: " + checkSumInRange(19, 1));      // true

        System.out.println("9 + 0 = 9: " + checkSumInRange(9, 0));         // false
        System.out.println("21 + 0 = 21: " + checkSumInRange(21, 0));      // false
        System.out.println("10 + (-1) = 9: " + checkSumInRange(10, -1));   // false
    }
}

class NumberSignChecker {

    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " положительное");
        } else {
            System.out.println("Число " + number + " отрицательное");
        }
    }

    public static void main(String[] args) {
        checkNumberSign(11);
        checkNumberSign(-7);
        checkNumberSign(0);
    }
}

class StringPrinter {

    public static void printStringMultipleTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        printStringMultipleTimes("Hello, Pasha!", 4);
    }
}

class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("2000: " + isLeapYear(2000));
        System.out.println("1900: " + isLeapYear(1900));
        System.out.println("2024: " + isLeapYear(2024));
        System.out.println("2023: " + isLeapYear(2023));
    }
}

class ArrayConverter {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Исходный массив:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.println("Преобразованный массив:");
        printArray(array);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class ArrayFiller {

    public static void main(String[] args) {
        int[] array = new int[100]; // пустой массив длиной 100

        // Заполнение массива значениями 1, 2, 3, ..., 100
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println("Заполненный массив:");
        printArray(array);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}

class ArrayMultiplier {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Исходный массив:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

        System.out.println("Преобразованный массив:");
        printArray(array);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class DiagonalArray {

    public static void main(String[] args) {
        int size = 5; // размер квадратного массива
        int[][] array = new int[size][size];

        // Заполняем главную диагональ единицами
        for (int i = 0; i < size; i++) {
            array[i][i] = 1; // [0][0], [1][1], [2][2], ...
        }

        // Вывод массива
        printArray(array);
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class ArrayCreator {

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] result1 = createArray(5, 10);
        System.out.println("Массив 1: " + java.util.Arrays.toString(result1));

        int[] result2 = createArray(3, 7);
        System.out.println("Массив 2: " + java.util.Arrays.toString(result2));

        int[] result3 = createArray(8, -1);
        System.out.println("Массив 3: " + java.util.Arrays.toString(result3));
    }
}