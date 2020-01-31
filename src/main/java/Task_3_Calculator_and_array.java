import java.io.IOException;
import java.util.Scanner;
/** Задание №3

 1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
 2. Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна, задается
 в консоли. После чего в консоли вводятся слова в количестве равном заданной длине массива. В полученном массиве
 необходимо найти самое длинное слово. Результат вывести на консоль
 3. Программа должна выполнять одно из заданий на выбор. Если в консоли ввести 1 - запуститься выполнение калькулятора,
 если 2 - поиск максимального слова в массиве.*/

public class Task_3_Calculator_and_array {

        public static void main(String[] args) throws IOException {
            double value1;
            double value2;
            System.out.println("Введите \"1\" чтобы запустить выполнение калькулятора");
            System.out.println("Введите \"2\" чтобы осуществить поиск максимального слова в массиве");

            Scanner scaner1 = new Scanner(System.in);
            String action = scaner1.nextLine();

            if (action.equals("1")){

               }

            else if (action.equals("2")){

            }
        }




        public static double getNumber () {
                System.out.println("Введите число");
                Scanner scaner1 = new Scanner(System.in);
                if (scaner1.hasNextDouble()) {
                    return scaner1.nextDouble();
                } else {
                    System.out.println("Ошибка при вводе. Повторите ввод");
                    return getNumber();
                }
            }


        public static char getOperation () {
            Scanner scaner2 = new Scanner(System.in);
            String action = scaner2.nextLine();

            System.out.println("Введите требуемую операцию:");
            System.out.println("\"+\" - сложение,  \"-\" - вычитание");
            System.out.println("\"*\" - умножение, \"/\" - деление");
        }



        public static double calculator () {
        if (action.equals("+")){
            double result = value1 + value2;
            return result;}

        else if (action.equals("-")){
            double result = value1 - value2;
            return result;}

        else if (action.equals("*")){
            double result = value1 * value2;
            return result;}

        else if (action.equals("/")){
            double result = value1 / value2;
            return result;}
        }


    }
}
