package com.ifmo.lesson15;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.getString;

/*
    Реализуйте все методы с использованием потоков ввода-вывода.
 */
public class IOStreamTasks {
    public static void main(String[] args) {

    }

    /**
     * Полностью копирует один поток в другой.
     *
     * @param src Входящий поток.
     * @param dst Выходящий поток.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static void copy(InputStream src, OutputStream dst) throws IOException {
       byte[] bytes = new byte[1024];
        int a;
        while ((a= src.read(bytes))>0) {
            dst.write(bytes,0,a);
        }
    }

    /**
     * Последовательно разбивает файл на несколько более мелких, равных
     * указанному размеру. Последний файл может быть меньше заданного
     * размера.
     *
     * @param file Файл, который будет разбит на несколько.
     * @param dstDir Директория, в которой будут созданы файлы меньшего размера.
     * @param size Размер каждого файла-части, который будет создан.
     * @return Список файлов-частей в том порядке, в котором они должны считываться.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static List<File> split(File file, File dstDir, int size) throws IOException {
        List<File> list = new ArrayList<File>();

       try (InputStream src = new FileInputStream(file);){
           byte[] bytes = new byte[size];
           int a;
           int cnt = 1;
           while ((a = src.read(bytes)) > 0) {

               File file1 = new File(dstDir, cnt + ".bin");
               OutputStream dst = new FileOutputStream(file1); // создаем поток вывода, указывая директорию и название файла
               dst.write(bytes, 0, size);                                               //записываем байты нашего размера
               list.add(file1);
               cnt++;
           }
       }
        return list;
    }

    /**
     * Собирает из частей один файл.
     *
     * @param files Список файлов в порядке чтения.
     * @param dst Файл, в который будут записаны все части.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static void assembly(List<File> files, File dst) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(dst)){
            for (File file: files){
                try (InputStream inputStream = new FileInputStream(file.getPath())){
                    copy(inputStream, outputStream);
                }
            }
        }
    }

    /**
     * Шифрует/дешифрует поток с помощью XOR. В качестве ключа используется пароль.
     *
     * @param src Входящий поток, данные которого будут зашифрованы/расшифрованы.
     * @param dst Выходящий поток, куда будут записаны зашифрованные/расшифрованные данные.
     * @param passphrase Пароль.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static void encrypt(InputStream src, OutputStream dst, String passphrase) throws IOException {
        int len;
        byte[] array = new byte[1024];
        while ((len = src.read(array)) > 0) {

            for (int i = 0, j = 0; i < array.length; i++) {
                array[i] ^= passphrase.getBytes()[j];
                j = ++j < passphrase.getBytes().length ? j : 0;
            }
            dst.write(array, 0, len);
        }
    }

    /**
     * Шифрует/дешифрует файл с помощью файла-ключа.
     *
     * @param src Файл, который должен быть зашифрован/расшифрован.
     * @param dst Файл, куда будут записаны зашифрованные/расшифрованные данные.
     * @param key Файл-ключ.
     * @throws IOException Будет выброшен в случае ошибки.
     */
    public static void encrypt(File src, File dst, File key) throws IOException {
        byte[] bufIn = new byte[1024];
        String passphrase = getString(key);
        try (InputStream in = new BufferedInputStream(new FileInputStream(src));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(dst))) {
            encrypt(in, out, passphrase);
        }

    }
}
