public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int summa = 0;
        int[] array = generateRandomArray();
        for (int expenditure : array) {
            summa += expenditure;
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");

    }

    public static void task2() {
        int[] array = generateRandomArray();
        int minSumma = array[0];
        int maxSumma = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxSumma) {
                maxSumma = array[i];
            }
            if (array[i] < minSumma) ;
            {
                minSumma = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumma + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSumma + " рублей");

    }

    public static void task3() {
        int[] array = generateRandomArray();
        int summa = 0;
        for (int expenditure : array) {
            summa += expenditure;
        }
        System.out.println("Средняя сумма трат за месяц составила " + summa / array.length + " рублей");
    }
    //    public static void task4() {
//        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        for (int i =reverseFullName.length-1; i >= 0; i--) {
//            System.out.print(reverseFullName[i]);
//        }
//    }
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int n = reverseFullName.length;
        char temp;

        for (int i = 0; i < n / 2; i++) {
            temp = reverseFullName[n - i - 1];
            reverseFullName[n - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        for (char i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }

    }
}
