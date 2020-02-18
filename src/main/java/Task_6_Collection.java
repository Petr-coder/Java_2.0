import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

/**
 Есть входной файл с набором слов, написанных через пробел
 Необходимо:
 Прочитать слова из файла.
 Отсортировать в алфавитном порядке.
 Посчитать сколько раз каждое слово встречается в файле.
 Вывести статистику на консоль
 Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 */


public class Task_6_Collection {

    public static void main(String[] args) throws IOException {

    }


    // считываем файл в Arralist
    public static void getInformation() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("file.txt"));
        Map<String, Integer> statistics = new HashMap<>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter ("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;

            }
            statistics.put(word, ++count);
        }
        System.out.println(statistics);




    }

    }


