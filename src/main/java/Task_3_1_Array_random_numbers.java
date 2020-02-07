import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Массив размерностью 20, заполняется случайными целыми числами от -10 до 10. Найти максимальный отрицательный
и минимальный положительный элементы массива. Поменять их местами.*/

public class Task_3_1_Array_random_numbers {

    public static void main(String[] args) {
    int arrayRandom [] = new int[20];

        //создаем массив и выводим на экран
        for (int i = 0; i < arrayRandom.length; i++){
            arrayRandom [i] = (int) (Math.random()*21 - 10);
            System.out.print(arrayRandom[i] + "  ");
        }


        //ищем миниммальное и максимальное значения. хатем печатаем их
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

        System.out.println("\n" + "maxValue" + " " + maxValue + ";" + " " + "minValue" + minValue);



        //Находим индекс максимального значения
        int max = arrayRandom[0];
        int indexForMax = 0;
        for (int i = 0; i < arrayRandom.length; i++) {
            int score = arrayRandom[i];
            if (max < score) {
                max = score;
                indexForMax=i;
            }
        }

        //Находим индекс минимального значения
        int min = arrayRandom[0];
        int indexForMin = 0;
        for (int i = 0; i < arrayRandom.length; i++) {
            int score = arrayRandom[i];
            if (min > score) {
                min = score;
                indexForMin=i;
            }
        }



        System.out.println("indexForMin" + " " + indexForMin + ";" + " " + "indexForMax" + " " + indexForMax);

        //меняем индексы местами
        int a = 0;
        a = arrayRandom [indexForMin];
        arrayRandom [indexForMin] = arrayRandom [indexForMax];
        arrayRandom [indexForMax] = a;

        //печатаем массив с индкесами поменяными местами
        for (int i = 0; i < arrayRandom.length; i++){

            System.out.print(arrayRandom[i] + "  ");
        }


    }

}
