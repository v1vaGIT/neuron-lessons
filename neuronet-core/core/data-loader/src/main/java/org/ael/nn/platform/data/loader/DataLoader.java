/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.ael.nn.platform.data.loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.ael.nn.platform.matrix.Matrix;

/**
 *
 * @author viva
 */
public class DataLoader {

    // модификатор доступа название класса название экземпляра
    // | / /
    private File file;

    // Класс для синтаксического разбора
    private Scanner scanner;

    /**
     * Загрузка изображения из файла
     *
     * @param path     строковый путь к файлу
     * @param fileName каталог с файлом имя файла | /
     */
    public Matrix load(String path, String fileName) {

        Matrix m = new Matrix();

        if (path != null && !path.isEmpty()) {
            if (fileName != null && !fileName.isEmpty()) {
                System.out.println("Начало загрузки ...");
                System.out.println(String.format("%-35s %s", "Каталог загрузки: ", path));
                System.out.println(String.format("%-35s %s", "Файл: ", fileName));
                String fullPath = path + File.separator + fileName;
                file = new File(fullPath);
                if (file.exists()) {
                    try {
                        scanner = new Scanner(file);
                        int numberLine = 1;
                        while (scanner.hasNextLine()) {
                            String s = scanner.nextLine();
                            System.out.println("Строка" + numberLine + ": " + s);
                            numberLine = numberLine + 1;
                        }

                    } catch (FileNotFoundException ex) {

                        System.out.println("Ошибка ввода-вывода: " + ex.toString());
                    }

                } else {
                    System.out.println("Ошибка: файл  [" + fileName + "] не существует");
                }
            } else {
                System.out.println("Загрузка изображения из файла не возможна: отсутствует указание имени файла");
            }
        } else {
            System.out.println("Загрузка изображения из файла не возможна: отсутствует путь к файлу");
        }
        return m;
    }

}
