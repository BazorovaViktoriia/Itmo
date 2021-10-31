package com.ifmo.lesson11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class TopWords {
    public static void main(String[] args) throws IOException {
        // Создаем файл, указывая путь к текстовому файлу на диске
        File text = new File("wap.txt");

        // Вычитываем все строки из файла
        List<String> lines = Files.readAllLines(text.toPath());

        // Создаем пустую коллекцию для слов.
        List<String> words = new ArrayList<>();

        for (String line : lines) {
            // Для каждой строки
            String[] wordSplit =
                    line.toLowerCase() // Переводим в нижний регистр
                            .replaceAll("\\p{Punct}", " ") // Заменяем все знаки на пробел
                            .trim() // Убираем пробелы в начале и конце строки.
                            .split("\\s"); // Разбиваем строки на слова

            for (String s : wordSplit) {
                // Выбираем только непустые слова.
                if (s.length() > 0)
                    words.add(s.trim());
            }
        }

        System.out.println(top10Words(words));
        System.out.println(top10Phrases(words));
        System.out.println(charactersFrequency(words));
    }

    /**
     * Возвращает 10 наиболее часто встречающихся слов с их
     * счётчиками.
     *
     * @param words Список слов.
     * @return Map, где ключ - слово, а значение - сколько раз встретилось.
     */
    public static Map<String, Integer> top10Words(List<String> words) {
        Map<String, Integer> mapa = new HashMap<>(); //create Map

                    for (String str:words) {          //проходим по всем словам в переданном нам списке
                        if (mapa.containsKey(str)) {   //если в Мар слово присутствует, то берем значение этого ключа и увеличиваем на единицу
                          int value=  mapa.get(str);
                          value++;
                        }
                        else  {                      //добавляем в Мар слово если его там еще нет и начальное значение
                            mapa.put(str,1);
                        }
                    }
        ArrayList<Integer> arr = new ArrayList<>();  //создала список со всеми значениями из Мар
                    for (Integer i : mapa.values()) {
                        arr.add(i);
                    }

        Collections.sort(arr);  //отсортировала по возрастанию
        Collections.reverse(arr);  //отсортировала по убыванию

        ArrayList<Integer> arr2 = new ArrayList<>(10); //создала список с 10 максимальными значениями
        for (int i =0; i<10; i++){
            arr2.add(arr.get(i));
        }

        Map<String, Integer> mapaFinish = new HashMap<>(10);         //создаем конечную МАР


        return  mapaFinish;
    }

    public static Map<String, Integer> getKeyFromValue(Map hm, ArrayList<Integer> arr) {
        Map<String, Integer> mapaFinish = new HashMap<>(10);

        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }

    /**
     * Возвращает 10 наиболее часто встречающихся фраз и соответствующие счётчики.
     * Фраза - два подряд идущих слова.
     *
     * @param words Список слов.
     * @return Топ 10 фраз.
     */
    public static Map<String, Integer> top10Phrases(List<String> words) {
        // todo implement

        return Map.of();
    }

    /**
     * Возвращает символы и частоту их встречаемости.
     *
     * @param words Список слов.
     * @return Map где ключ - символ, а значение - сколько раз он встретился в списке слов.
     */
    public static Map<Character, Integer> charactersFrequency(List<String> words) {
        // todo implement

        return Map.of();
    }
}
