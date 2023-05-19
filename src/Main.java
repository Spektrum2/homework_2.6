import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 14, 16, 18, 18, 22));
    private static final List<String> words = new ArrayList<>(List.of("земля", "вода", "огонь", "воздух", "вода", "воздух", "вода"));

    public static void main(String[] args) {

        task1();
        task2();
        task2_1();
        task3();
        task4();
    }

//    Задание 1
//    Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
//    Код должен работать с любой последовательностью и объемом списка чисел.
    private static void task1() {
        System.out.println("Нечетные числа");
        List<Integer> odd = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                odd.add(num);
            }
        }
        System.out.println(odd);
    }

//    Задание 2
//    Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
//    Код должен работать с любой последовательностью и объемом списка чисел.
    private static void task2() {
        System.out.println("Четные числа");
        Set<Integer> even = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        System.out.println(even);
    }

//    Задание 3
//    Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
//    В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
//    Код должен работать с любой последовательностью и объемом списка слов.
    private static void task2_1() {
        System.out.println("Четные числа, способ 2");
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

//    Задание 3
//    Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
//    В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
//    Код должен работать с любой последовательностью и объемом списка слов.
    private static void task3() {
        System.out.println("Уникальные слова");
        Set<String> unique = new HashSet<>();
        Set<String> dup = new HashSet<>();
        for (String word : words) {
            if (!unique.add(word)) {
                dup.add(word);
            }
        }
        unique.removeAll(dup);
        System.out.println(unique);
    }

//    Задание 4
//    Напишите код, который выводит в консоль все количество дублей из списка слов.
//    Например, у вас есть текст из 6 слов, в котором есть одно слово, которое повторяется. В таком случае в консоли выведется результат "2", то есть то количество элементов, которые повторяются.*
//    В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
//    Код должен работать с любой последовательностью и объемом списка слов.
    private static void task4() {
        System.out.println("Количество дублей из списка слов");
        Map<String, Integer> countDup = new HashMap<>();
        for (String word : words) {
            if (!countDup.containsKey(word)) {
                countDup.put(word, 0);
            }
            countDup.put(word, countDup.get(word) + 1);
        }
        for (Map.Entry<String, Integer> word : countDup.entrySet()) {
            if (word.getValue() != 1) {
                System.out.println(word.getKey() + " " + word.getValue());
            }
        }
    }
}

