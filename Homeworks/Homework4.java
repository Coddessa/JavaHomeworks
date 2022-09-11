import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
    /*
    1. Считайте с консоли размер массива n (используйте Scanner; считаем, что пользователь вводит корректные
        данные). Создайте и проинициализируйте 1-мерный массив array длиной n случайными действительными
        числами из промежутка [ -5; 15) (класс Random). Выведите массив на консоль.
    2. С помощью Arrays.sort() отсортируйте массив и также выведите его на консоль.
    3. Создайте и проинициализируйте переменную limit. Для массива array проверьте, что все его элементы
        меньше значения limit. В переменную   сохраните true , если это верно; иначе false.
    4. Создайте и проинициализируйте 1-мерный массив строк (String) [stringArray] длиной не менее 10 элементов
        (можно использовать упрощенный синтаксис)
    5. Создайте новый массив строк numberedStringArray, куда сохраните все элементы из массива stringArray,
        добавляя порядковый номер (начиная с 1) в формате n: string (смотрите пример).

    Пример:
    [] --> []
    ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]

    6. Выведите на консоль массив numberedStringArray (можно воспользоваться методом Arrays.toString() ).

    Дополнительные задания
    1. При решении пункта 5 использовать класс StringBuilder для создания пронумерованных строк.
    2. Изограмма - это слово, в котором нет повторяющихся букв, последовательных или непоследовательных.
        Реализуйте функцию, которая определяет, является ли строка, содержащая только буквы, изограммой
        (метод принимает String, возвращает boolean). Предположим, что пустая строка является изограммой.
        Игнорировать регистр букв.

    Пример :
    "Dermatoglyphics" --> true
    "aba" --> false
    "moOse" --> false (игнорировать регистр букв)

    3. Числа Фибоначчи  - решение с рекурсией и без неё.
    */



    // task (1) "Scanner"
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 22)-6);
            System.out.print(array[i]+" ");
        }
        System.out.println();

    // task (2) "Arrays.sort"
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    // task (3) "isLimited"
        int limit = 4;
        boolean isLimited = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > limit) isLimited = false;
            }
        System.out.println(isLimited);

    // task (4-6) "StringArray"
        String [] stringArray = {"a","b","c","d","e","f","g","h","i","j"};
        String [] numberedStringArray = new String [stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            numberedStringArray [i] = (i+1) + ":" + stringArray[i] ;
        }
        System.out.println(Arrays.toString(numberedStringArray));



    }

}
