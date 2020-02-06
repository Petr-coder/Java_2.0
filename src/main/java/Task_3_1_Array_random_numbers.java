import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Массив размерностью 20, заполняется случайными целыми числами от -10 до 10. Найти максимальный отрицательный
и минимальный положительный элементы массива. Поменять их местами.*/

public class Task_3_1_Array_random_numbers {

    public static void main(String[] args) {
    int arrayRandom [] = new int[20];

        for (int i = 0; i < arrayRandom.length; i++){
            arrayRandom [i] = (int) (Math.random()*21 - 10);
            System.out.print(arrayRandom[i] + " ");
        }



        int maxValue = arrayRandom[0];
        int minValue = arrayRandom[0];

        for (int value : arrayRandom) {

            if (value > maxValue) {
                maxValue = value;
            }

            if (value < minValue) {
                minValue = value;
            }

        }


        System.out.println("maxValue" + maxValue + ";" +" " + "minValue"+ minValue);
    }

}
