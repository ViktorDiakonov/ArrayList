import java.util.*;

public class Custom implements List<Integer> {

    // задаю переменные
    public int size;
    public int element;
    int[] Custom;

    // создаю конструктор класса
    public Custom(int size) {
        this.size = size;
        this.Custom = array(size);

    }
    // переопределяю метод
    @Override
    public String toString() {
        return "Custom{" +
                "element=" + element +
                ", Custom=" + Arrays.toString(Custom) +
                '}';
    }

    // "Мой метод", аналог isEmpty
    public void verificationList() {
        String s = "list is not empty";
        for (int i = 0; i < size; i++) {
            if (Custom[i] != 0) {
                break;
            } else s = "the list is empty";
        }
        System.out.println(s);
    }

    // создаю массив
    public static int[] array(int size) {
        int[] number = new int[size];
        for (int i = 0; i < size - 1; i++) {
            number[i] = 0;
        }
        return number;
    }

    // метод добавляем элемент в конец списка
    public void add(int element) {
        this.element++;
        if (this.element > this.size) {
            return;
        }
        Custom[this.element - 1] = element;
    }

    // метод добавляем элемент в указанный индекс
    public boolean add(int index, int element) {
        this.element++;
        int buffer;
        int i = 0;
        buffer = Custom[index + i];
        Custom[index + i] = element;
        i++;

        while (i < size - index) {
            int buffer2 = Custom[index + i];
            Custom[index + i] = buffer;
            i++;
            buffer = buffer2;
        }
        return true;
    }

    // метод проверяет массив на наличие в нем элементов и возвращает true или false
    @Override
    public boolean isEmpty() {
        boolean result = true;
        for (int i = 0; i < size; i++) {
            if (Custom[i] != 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    // метод вычищает массив от элементов
    @Override
    public void clear() {
        Custom = array(size);
    }

    // метод возвращает значение по указанному индексу
    @Override
    public Integer get(int index) {
        return Custom[index];
    }

    // метод возвращает размер массива
    @Override
    public int size() {
        return this.size;
    }

    public void removeByValue(int element) {
        for (int i = 0; i < Custom.length; i++) {
            if (Custom[i] == element) {
                Custom[i] = 0;
            }
        }

    }

    // метод удаляет элемент по указанному индексу
    @Override
    public Integer remove(int index) {
        Custom[index] = 0;
        return null;
    }

    // метод устанавливает новый элемент по указанному индексу
    @Override
    public Integer set(int index, Integer element) {
        Custom[index] = element;
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        return false;
    }

    @Override
    public boolean remove(Object o) {

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void add(int index, Integer element) {
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int indexFrom, int indexTo) {
        return null;
    }
}