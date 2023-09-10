package Task1;

/**

 *Задача №2

 * Дан список целых чисел numbers. Необходимо написать в декларативном стиле процедуру для

 * сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.

 */




import java.util.List;

import java.util.stream.Collectors;




public class SortDeclar {

    public static List<Integer> sortDescending(List<Integer> numbers) {

        return numbers.stream()

                .sorted((a, b) -> b.compareTo(a))

                .collect(Collectors.toList());

    }




    public static void main(String[] args) {

        List<Integer> numbers = List.of(5, 0, 33, -100, 33, 2, 8, 1, 3);

        System.out.println("Исходный список: " + numbers);




        List<Integer> sortedNumbers = sortDescending(numbers);

        System.out.println("Отсортированный список в порядке убывания: " + sortedNumbers);

    }

}