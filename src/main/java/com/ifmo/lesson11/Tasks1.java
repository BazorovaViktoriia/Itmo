package com.ifmo.lesson11;

import com.ifmo.lesson11.inner.Message;
import com.ifmo.lesson11.inner.MessageGenerator;
import com.ifmo.lesson11.inner.MessagePriority;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Реализуйте все методы.
 */
public class Tasks1 {

    public static void main(String[] args) {
        MessageGenerator generator = new MessageGenerator();

        List<Message> messages = generator.generate(100);

        countEachPriority(messages);
        countCountEachCode(messages);
        countUniqueMessages(messages);

        System.out.println("Genuine messages in natural order: \n" + genuineMessagesInOriginalOrder(messages));

        removeEach(generator.generate(100), MessagePriority.LOW);
        removeOther(generator.generate(100), MessagePriority.URGENT);
    }

    private static void countEachPriority(List<Message> messages) {
        Map<MessagePriority, Integer> mapa = new HashMap<>();
        for(int i=0; i<messages.size(); i++) {
        if (mapa.containsKey(messages.get(i).getPriority())) {
            mapa.put(messages.get(i).getPriority(),mapa.get(messages.get(i).getCode())+ 1);  //grow value by key
        }
        else {
            mapa.put(messages.get(i).getPriority(), 1);
            }

            for (Map.Entry entry : mapa.entrySet()) {
                System.out.println(entry.getKey()+" "+ entry.getValue());
            }

        // Сосчитайте количество сообщений для каждого приоритета.
        // Ответ необходимо вывести в консоль.

    }
    }

    private static void countCountEachCode(List<Message> messages) {
        // Сосчитайте количество сообщений для каждого кода сообщения.
        // Ответ необходимо вывести в консоль.

        Map<Integer, Integer> mapa = new HashMap<>();
        for (Message message: messages) {
            if (mapa.containsKey(message.getCode())) {
                mapa.put(message.getCode(), mapa.get(message.getCode()) + 1); //need to grow value
            } else {
                mapa.put(message.getCode(), 1);
            }
        }

        for (Map.Entry entry : mapa.entrySet()) {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }

    private static void countUniqueMessages(List<Message> messages) {
        // Сосчитайте количество уникальных сообщений.
        // Ответ необходимо вывести в консоль.

        // TODO implement
    }

    private static List<Message> genuineMessagesInOriginalOrder(List<Message> messages) {
        // Здесь необходимо вернуть только неповторяющиеся сообщения и в том порядке, в котором
        // они встречаются в первоначальном списке. Например, мы на входе имеем такие сообщения:
        // [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}],
        // то на выходе должны получить:
        // [{URGENT, 4}, {HIGH, 9}, {LOW, 3}].
        // Т.е. остались только уникальные значения, и порядок их поступления сохранен.

        // TODO implement

        return messages;
    }

    private static void removeEach(Collection<Message> messages, MessagePriority priority) {
        // Удалить из коллекции каждое сообщение с заданным приоритетом.
        System.out.printf("Before remove each: %s, %s\n", priority, messages);



        System.out.printf("After remove each: %s, %s\n", priority, messages);
    }

    private static void removeOther(Collection<Message> messages, MessagePriority priority) {
        // Удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет.
        System.out.printf("Before remove other: %s, %s\n", priority, messages);

        // TODO implement

        System.out.printf("After remove other: %s, %s\n", priority, messages);
    }
}
