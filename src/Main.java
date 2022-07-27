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

