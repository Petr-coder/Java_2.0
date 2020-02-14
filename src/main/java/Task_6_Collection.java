import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

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
        Scanner s = new Scanner(new File("file.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();
    }



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Определите размер массива");
        // объявляем массив
        int a = Integer.parseInt(reader.readLine());
        String[] array = new String[a];



        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();

        array = input.split(" ");
        String maxLen = array[0];







        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune));
        Collections.sort(solarSystem);
        System.out.println(solarSystem);





    }

    }



}
