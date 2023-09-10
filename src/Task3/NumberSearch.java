package Task3;

/**

 * Задача 3: У вас есть массив, содержащий числа от 1 до N,

 * где N - длина массива. Одно из чисел в массиве повторяется дважды,

 * а одно число пропущено. Найдите повторяющееся число и пропущенное число.

 */

public class NumberSearch{

    public static void findDuplicateAndMissing(int[] nums) {

        int n = nums.length;

        int[] count = new int[n + nums.length];

        int duplicate = -1;

        // Ищем повторяющееся число

        for (int num : nums) {

            if (count[num] == 1) {

                duplicate = num;

            } else {

                count[num]++;

            }

        }

        int missing = -1;

        // Ищем пропущенное число

        for (int i = 1; i <= n + 1; i++) {

            if (count[i] == 0) {

                missing = i;

                break;

            }

        }

        System.out.println("Повторяющееся число: " + duplicate);

        System.out.println("Пропущенное число: " + missing);

    }

}