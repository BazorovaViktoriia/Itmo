package lesson4_;

/**
 * Элемент связного списка, хранящий ссылку
 * на следующий элемент и на значение.
 * <p>
 *     Класс package-private, т.к. используется
 *     только для LinkedList'a.
 * </p>
 */
class Item {
    Object value;
    Item next;
    Item(Object value) {
        this.value = value;
    }
}
