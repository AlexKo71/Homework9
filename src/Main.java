public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum1 = 0;
        for (int j : arr) {
            sum1 += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum1 + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxArr = 0;
        for (final int expenses : arr) {
            if (expenses > maxArr) {
                maxArr = expenses;
            }
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();

        double sum = 0;
        int month = 30;
        for (int j : arr) {
            sum = sum + j;
        }
        double averageMonth = sum / month;
        System.out.println("Средняя сумма трат за месяц составила " + averageMonth + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
