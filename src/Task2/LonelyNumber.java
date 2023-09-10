package Task2;

/**
 * У вас есть массив целых чисел, в котором каждое число, кроме одного,
 * повторяется дважды. Вам нужно найти это одиночное число.
 */
import java.util.HashMap;
import java.util.Map;
public class LonelyNumber {
    public static int findLonelyNumber(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (frequencyMap.get(num) == 1) {
                return num;
            }
        }
        return -1; // Если цифра не найдена
    }
}