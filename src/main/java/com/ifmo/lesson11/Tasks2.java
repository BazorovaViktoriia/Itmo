package com.ifmo.lesson11;

import com.ifmo.lesson11.inner.Message;
import com.ifmo.lesson11.inner.MessagePriority;
import com.ifmo.lesson11.inner.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;

import static com.ifmo.lesson11.inner.UserGenerator.generate;

/*
    Реализуйте все методы.
 */
public class Tasks2 {
    public static void main(String[] args) {

        System.out.println(generate(10));
    }

    /**
     * Сортирует сообщения в списке в порядке возрастания приоритета.
     *
     * @param messages Сообщения.
     */
    private static void sortByPriority(List<Message> messages) {
        List<Message> low = new ArrayList<>();
        List<Message> medium = new ArrayList<>();
        List<Message> high = new ArrayList<>();
        List<Message> urgent = new ArrayList<>();
        for(int i=0; i<messages.size(); i++) {
            if (messages.get(i).getPriority().fromOrdinal(0) == MessagePriority.LOW) {
                low.add(messages.get(i));
            }
            if (messages.get(i).getPriority().fromOrdinal(1) == MessagePriority.MEDIUM) {
                medium.add(messages.get(i));
            }
            if (messages.get(i).getPriority().fromOrdinal(2) == MessagePriority.HIGH) {
                high.add(messages.get(i));
            }
            if (messages.get(i).getPriority().fromOrdinal(3) == MessagePriority.URGENT) {
                urgent.add(messages.get(i));
            }
        }
        messages.clear();
        System.arraycopy();


    /**
     * Возвращает Set, отсортированный по компании и имени пользователя.
     *
     * @param users Пользователи.
     * @return Сортированный Set.
     */
    private static NavigableSet<User> sortedByCompanyAndName(List<User> users) {
        // TODO implement.

        return Collections.emptyNavigableSet();
    }

    /**
     * Возвращает Set, отсортированный по зарплате и имени пользователя.
     *
     * @param users Пользователи.
     * @return Сортированный Set.
     */
    private static NavigableSet<User> sortedBySalaryAndName(List<User> users) {
        // TODO implement.

        return Collections.emptyNavigableSet();
    }

    /**
     * Возвращает Set, отсортированный по зарплате, компании и имени пользователя.
     *
     * @param users Пользователи.
     * @return Сортированный Set.
     */
    private static NavigableSet<User> sortedBySalaryAgeCompanyAndName(List<User> users) {
        // TODO implement.

        return Collections.emptyNavigableSet();
    }

}
