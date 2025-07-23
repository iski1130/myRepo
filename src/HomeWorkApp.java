public class HomeWorkApp {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkValuesInRange(2,4);
        checkPositiveNumber(99);
        checkNegativeNumber(15);
        printString("Hello",3);
        determineLeapYear(2500);

    }

    // 1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /* 2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их
    любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма
    больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
     */
    public static void checkSumSign() {
        int a = 3;
        int b = 4;
        if (a + b >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    /* 3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
    Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
    от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
     */
    public static void printColor() {
        int value = 30;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый");
        else if (value > 100)
            System.out.println("Зеленый");
    }

    /* 4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их
    любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    в противном случае “a < b”;
     */
    public static void compareNumbers() {
        int a = 20;
        int b = -35;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    /* 5. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
     от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    public static boolean checkValuesInRange(int a, int b) {
        if (a + b >= 10 && a + b <= 20)
            return true;
        else
            return false;
    }

    /* 6. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    public static void checkPositiveNumber(int a) {
        if (a >= 0)
            System.out.println("Положительное");
        else
            System.out.println("Отрицательное");
    }

    /* 7. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.
     */
    public static boolean checkNegativeNumber(int a) {
        boolean value = false;
        if (a < 0)
            value=true;
        else if (a > 0)
            value=false;
        return value;
    }

    /* 8. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    public static void printString(String s, int a){
        for (int i=0; i<a; i++)
            System.out.println(s);
    }

    /* 9. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
     не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static boolean determineLeapYear(int year) {
        boolean determinant = false;
        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else if (year % 4 == 0)
            return true;
        else
            return false;
    }
}