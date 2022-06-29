
public class Main {
    public static void main(String[] args) {

        Custom number = new Custom(5);

        System.out.print("Добавляю в коллекцию новые элементы : ");
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        printInfo(number);

        System.out.print("Количество элементов в коллекции: " + number.size() + "\n");

        System.out.print("Вставляю новый элемент под индексом (3): ");
        number.add(3, 66);
        printInfo(number);

        System.out.print("Удаляю элемент под индексом (3): ");
        number.remove(3);
        printInfo(number);

        System.out.print("Заменяю элемент коллекции на указанный по его индексу (2): ");
        number.set(2, 99);
        printInfo(number);

        System.out.println("Вывожу в консоль элемент под индексом (4): " + number.get(4));

        System.out.print("Удаляю элемент со значением (20): ");
        number.removeByValue(20);
        printInfo(number);

        System.out.println("Проверяю, есть или нет элементы в коллекции " +
                "(false-есть, true-нет): " + number.isEmpty());

        System.out.print("Чищу коллекцию: ");
        number.clear();
        printInfo(number);
    }

    // метод для вывода результатов действий в коллекции
    private static void printInfo(Custom number) {
        for (int i = 0; i < 5; i++) {
            System.out.print(number.get(i) + " ");
        }
        System.out.print("\n");
    }
}
