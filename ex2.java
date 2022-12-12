//Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и 
// выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

public class ex2 {
    public static void main(String[] args) {

        LinkedList<String> person = new LinkedList<>();
        LinkedList<String> firstName = new LinkedList<>();
        HashMap<String, Integer> nameCount = new HashMap<>();
        person.add("Владимир Ленин");
        person.add("Сергей Безруков");
        person.add("Сергей Бурунов");
        person.add("Григорий Лепс");
        person.add("Максим Галкин");
        person.add("Максим Фадеев");
        person.add("Владимир Высоцкий");

        for (int i = 0; i < person.size(); i++) {
            String[] firstNameList = person.get(i).split(" ");
            for (int j = 0; j < firstNameList.length; j += 2) {

                firstName.add(firstNameList[j]);
            }
        }

        for (int i = 0; i < firstName.size(); i++) {
            int count;
            if (nameCount.containsKey(firstName.get(i))) {
                count = nameCount.get(firstName.get(i));
                nameCount.put(firstName.get(i), count + 1);
            } else {
                nameCount.put(firstName.get(i), 1);
            }

        }

        System.out.println(nameCount);

        Map<String, Integer> sortedNameCountMap = nameCount.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));

        sortedNameCountMap.entrySet().forEach(System.out::println);

    }
}
