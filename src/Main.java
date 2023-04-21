import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

//    Задания, необходимо написать код:
//
//    1 Составить алгоритм: если введенное число больше 7, то вывести “Привет”
//    2 Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
//    если нет, то вывести "Нет такого имени"
//    3 Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
//
//      Бонусные баллы:
//     + возможность запуска полученной программы
//     ++ интерактивный ввод значений для обработки и вывод обработанных данных (например, через консоль)


    public static void main(String[] args) {
//  #1
        Scanner scanner = new Scanner(System.in);
        try {
            String inputNum = scanner.next();
            if (inputNum.equals("exit")) {
            }
            if (Integer.parseInt(inputNum) > 7) {
                System.out.println(inputNum);
            } else
                System.out.println("Number less or equal 7");
        } catch (Exception ex) {
            System.out.println("You should write a number");
        }
// #2
        try {
            String inputName = scanner.next();
            if (inputName.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else
                System.out.println("Нет такого имени");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
//  #3
        int[] array = new int[5];
        int[] multipleOfThreeArray = new int[array.length];
        int j = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                if (array[i] % 3 == 0) {
                    multipleOfThreeArray[j] = array[i];
                    j++;
                }
            }
            for (int i = 0; i < j; i++) {
                System.out.print(multipleOfThreeArray[i]+ " ");
            }
        } catch (
                Exception ex) {
            ex.printStackTrace();
        }
    }
}
/*  #4      Дана скобочная последовательность: [((())()(())]]
/   - Можно ли считать эту последовательность правильной?
/   - Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?

    Данную последовательность нельзя считать правильной так как отсутствуют одна закрывающая круглая скобка
и одна открывающая квадратная.
*/

//  Можно в цикле все сделать
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            try {
//                String inputNum = scanner.next();
//                if (inputNum.equals("exit")) {
//                    break;
//                }
//                if (Integer.parseInt(inputNum) > 7) {
//                    System.out.println(inputNum);
//                } else
//                    System.out.println("Number less or equal 7");
//            } catch (Exception ex) {
//                InputMismatchException exception;
//                System.out.println("You should write a number or \"exit\"");
//            }
//        }
//    }




