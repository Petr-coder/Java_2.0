import java.io.*;
import java.io.IOException;
import java.util.*;

/**
 Есть входной файл с набором слов, написанных через пробел
 Необходимо:
 + Прочитать слова из файла.
 + Отсортировать в алфавитном порядке.
 + Посчитать сколько раз каждое слово встречается в файле.
 + Вывести статистику на консоль
 Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 */


public class Task_6_Collection {

    public static void main(String[] args) throws IOException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        Scanner scanner = new Scanner(new File("C:\\Users\\PMikhaylov\\IdeaProjects\\untitled\\src\\main\\java\\file.txt"));
        ArrayList<String> words = new ArrayList<String>();

        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            words.add(word);
        }
        System.out.println(words);

        //////////////////////////////////////////////////////////////////////////////////////////////////////

        Collections.sort(words);
        System.out.println(words);

        //////////////////////////////////////////////////////////////////////////////////////////////////////
        Scanner scanner1 = new Scanner(new File("C:\\Users\\PMikhaylov\\IdeaProjects\\untitled\\src\\main\\java\\file.txt"));
        Map<String, Integer> statistics = new HashMap<String, Integer>();
        while (scanner1.hasNext()) {
            String word = scanner1.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
        System.out.println(statistics);

        //////////////////////////////////////////////////////////////////////////////////////////////////////
        Integer max = Collections.max(statistics.values());
        System.out.println(max);



    }
}









