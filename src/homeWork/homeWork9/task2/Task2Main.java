package homeWork.homeWork9.task2;

import java.util.HashMap;
import java.util.Map;

public class Task2Main {

    public static void main(String[] args) {

        Map<Integer, Product> productMap = new HashMap<>();

        productMap.put(1, new Product(1, "Молоко", 0.9));
        productMap.put(2, new Product(3, "Телефон", 0.5));
        productMap.put(3, new Product(2, "Торт", 1.2));

        entrySet(productMap);
        keySet(productMap);
        values(productMap);
    }

    private static void entrySet(Map<Integer, Product> productMap) {
        // Решение 1
        System.out.println(productMap.entrySet());
        // Результат:
        // [1=homeWork.homeWork9.task2.Product@7c30a502, 2=homeWork.homeWork9.task2.Product@49e4cb85, 3=homeWork.homeWork9.task2.Product@2133c8f8]

        // Решение 2
        for (Map.Entry<Integer, Product> product : productMap.entrySet()) {
            System.out.println(product.getKey() + "='" + product.getValue().getProductInfo() + "'");
        }
        // Результат:
        // 1='тип: 1, название: Молоко, вес: 0.9'
        // 2='тип: 3, название: Телефон, вес: 0.5'
        // 3='тип: 2, название: Торт, вес: 1.2'

        // Решение 3
        productMap.forEach((key, value) -> System.out.println(key + "='" + value.getProductInfo() + "'"));
        // Результат:
        // 1='тип: 1, название: Молоко, вес: 0.9'
        // 2='тип: 3, название: Телефон, вес: 0.5'
        // 3='тип: 2, название: Торт, вес: 1.2'
    }

    private static void keySet(Map<Integer, Product> productMap) {
        // Решение 1
        System.out.println(productMap.keySet());
        // Результат: [1, 2, 3]

        // Решение 2
        for (int key : productMap.keySet()) {
            System.out.println(key);
        }
        // Результат:
        // 1
        // 2
        // 3

        // Решение 3
        productMap.keySet().forEach(System.out::println);
        // Результат:
        // 1
        // 2
        // 3
    }

    private static void values(Map<Integer, Product> productMap) {
        // Решение 1
        System.out.println(productMap.values());
        // Результат:
        // [homeWork.homeWork9.task2.Product@7c30a502, homeWork.homeWork9.task2.Product@49e4cb85, homeWork.homeWork9.task2.Product@2133c8f8]

        // Решение 2
        for (Product product : productMap.values()) {
            System.out.println(product.getProductInfo());
        }
        // Результат:
        // тип: 1, название: Молоко, вес: 0.9
        // тип: 3, название: Телефон, вес: 0.5
        // тип: 2, название: Торт, вес: 1.2

        // Решение 3
        productMap.values().forEach(x -> System.out.println(x.getProductInfo()));
        // Результат:
        // тип: 1, название: Молоко, вес: 0.9
        // тип: 3, название: Телефон, вес: 0.5
        // тип: 2, название: Торт, вес: 1.2
    }
}
