import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
/* 1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
3. Выведи результат на экран, каждое значение с новой строки.*/

public class smth2 {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < 10; i++){
                int s = Integer.parseInt(reader.readLine());
                list.add(s);
            }

            for (int i = 9; i >=0; i--){
                System.out.println(list.get(i));
            }
            //напишите тут ваш код
        }
    }