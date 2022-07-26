import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 14, 16, 18, 18, 22));
        List<String> words = new ArrayList<>(List.of("земля", "вода", "огонь", "воздух", "вода", "воздух", "вода"));
        task1(nums);
        task2(nums);
        task3(words);
        task4(words);
    }

    private static void task1(List<Integer> nums) {
        System.out.println("Нечетные числа");
        List<Integer> odd = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                odd.add(num);
            }
        }
        System.out.println(odd);
    }

    private static void task2(List<Integer> nums) {
        System.out.println("Четные числа");
        TreeSet<Integer> even = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        System.out.println(even);
    }

    private static void task3(List<String> words) {
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

    private static void task4(List<String> words) {
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

