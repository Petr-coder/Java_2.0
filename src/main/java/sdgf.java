import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class sdgf
{

    public static void main(String[] args) throws IOException {

        System.out.println("Введите \"1\" чтобы запустить выполнение калькулятора");
        System.out.println("Введите \"2\" чтобы осуществить поиск максимального слова в массиве");

        Scanner scaner1 = new Scanner(System.in);
        String action = scaner1.nextLine();

        if (action.equals("1")) {
            double num1 = getNumber();
            double num2 = getNumber();
            char operation = getOperation();
            double result = calc(num1, num2, operation);
            System.out.println("Результат:" + result);
        }


        else if (action.equals("2")){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Определите размер массива");
        // объявляем массив
            int a = Integer.parseInt(reader.readLine());
            String[] array = new String[a];


            Scanner sc = new Scanner(System.in);
            //Вводим предложение в консоль
            System.out.println("Введите слова одной строкой через пробел");
            String input = sc.nextLine();
            //Начальное количество слов равно 0

            String str = "find the most max length in string"; // это исходная строка
            array = str.split(" "); // тут делим ее на отдельные слова, по пробелу
            String maxLen = array[0]; // Здесь предполагаем что первый элемент в массиве самый короткий

// Тут последовательно сравниваем длину элементов массива, и если есть короче чем в переменной minLen, заносим ее туда

            for (String e : array) {
                if (e.length() > maxLen.length()) {
                    maxLen = e;
                }
            }

            System.out.print(maxLen); // тут вывод на экран
        }

        else {
            System.out.println("Ошибка при вводе. Повторите ввод");
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



    public static char getOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите номер операции:\n1 - прибавить\n2 - отнять\n3 - умножить\n4 - разделить");
        int operationNumber = 0;
        if(sc.hasNextInt()) {
            operationNumber = sc.nextInt();
        } else {
            System.out.println("Вы ввели не число! Повторите ввод!");
            return getOperation();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Неправильная операция! Повторите ввод!");
                return getOperation();
        }
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