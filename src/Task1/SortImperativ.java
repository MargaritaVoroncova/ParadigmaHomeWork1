package Task1;

/**
 * Задача №1
 * Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
 * сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.
 */

import java.util.ArrayList;
import java.util.List;

public class SortImperativ {
    public static void sortDescending(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5,1, 33, -7, -100, 0, 2, 8, 1, 3));
        System.out.println("Исходный список: " + numbers);

        sortDescending(numbers);
        System.out.println("Отсортированный список в порядке убывания: " + numbers);
    }
}