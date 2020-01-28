import java.io.IOException;
import java.util.Scanner;
/** Начинаем писать калькулятор:
1.Реализовать сложение дробных чисел, которые пользователь вводит в консоль. Использовать комментарии и JavaDoc
при описании метода. Использовать форматирование при выводе результата в консоль. Полученный результат округлять
до 4-х знаков после запятой.
2. Запушить проект в свой репозиторий на GitHub
3. Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
* @author Petr Mikhaylov
*/

public class Task_2_Calculator {

        public static void main(String[] args) throws IOException {
            System.out.println("Введите первое число");
            Scanner scaner1 = new Scanner(System.in);
            double value1 = scaner1.nextDouble();
            System.out.println("Введите второе число");
            double value2 = scaner1.nextDouble();

            System.out.println("Введите требуемую операцию:");
            System.out.println("\"+\" - сложение,  \"-\" - вычитание");
            System.out.println("\"*\" - умножение, \"/\" - деление");

            Scanner scaner2 = new Scanner(System.in);
            String action = scaner2.nextLine();

            if (action.equals("+")){
                double result = value1 + value2;
            System.out.printf("Сумма чисел = " + "%.4f", result);}

            else if (action.equals("-")){
                double result = value1 - value2;
                System.out.printf("Разница чисел = " + "%.4f", result);}

            else if (action.equals("*")){
                double result = value1 * value2;
                System.out.printf("Результат умножения чисел = " + "%.4f", result);
}
            else if (action.equals("/")){
                double result = value1 / value2;
                System.out.printf("Результат деления чисел = " + "%.4f", result);}
        }
}
