
public class Main {
    public static void main(String[] args) {


        Custom number = new Custom(5);

        System.out.print("Added five elements: ");
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(50);
        // перебираю элементы и вывожу в консоль (дальше это делаю через метод)
        for (int i = 0; i < 5; i++) {
            System.out.print(number.get(i) + " ");
        }
        System.out.print("\n");



        System.out.print("Amount of elements: " + number.size() + "\n");

        System.out.print("Inserting a new element at index (3): ");
        number.add(3, 66);
        printInfo(number);

        System.out.print("Removing element at index (3): ");
        number.remove(3);
        printInfo(number);

        System.out.print("Replacing an element with one specified by its index (2): ");
        number.set(2, 99);
        printInfo(number);

        System.out.println("I display the element under the index in the console (4): " + number.get(4));

        System.out.print("Removing an element with a value (20): ");
        number.removeByValue(20);
        printInfo(number);

        System.out.println("I check if there are elements in the list or not by the method" +
                "(isEmpty()): " + number.isEmpty());

        System.out.print("Checking the presence of elements in the list with your own method: ");
        number.verificationList();

        System.out.print("cleaning the list: ");
        number.clear();
        printInfo(number);

        // другой метод проверки наличия элементов в списке
        System.out.print("Checking if there are elements in a list: ");
        number.verificationList();
    }

    // метод для вывода результатов действий
    private static void printInfo(Custom number) {
        for (int i = 0; i < 5; i++) {
            System.out.print(number.get(i) + " ");
        }
        System.out.print("\n");
    }
}
