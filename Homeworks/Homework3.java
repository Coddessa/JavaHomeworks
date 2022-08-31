

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");

    // 1. task (1-3)
    /*
      1. Заведите переменную month типа int и присвойте ей произвольное значение
      (от 1 до 12 - номера месяцев в году)
      2. С помощью конструкции if-else-if в зависимости от значения переменной выведите
      на консоль слово “Зима”, “Весна”, “Лето” или “Осень”
      3. Используя ту же переменную month с помощью конструкции switch выведите на консоль
      слово “Зима”, “Весна”, “Лето” или “Осень” (по сути то же самое, что и в задании 2)
    */

    // if-else-if
        int month = 8;

        if (month >= 1 && month <= 2 || month == 12) {
            System.out.println("Зима");

        } else if (month >= 3 && month <= 5) {
            System.out.println("Весна");

        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето");

        } else if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        } else
            System.out.println("Введите число от 1 до 12");


    // switch
        switch (month) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Введите число от 1 до 12");
        }
    // 2. task (4-5)
    /*
      4. Создайте и проинициализируйте 1-мерный массив array длиной не менее 10 элементов
       (можно использовать упрощенный синтаксис)
      5. С помощью оператора for выведите массив array в обратном порядке
       (помните, что array.length - это длина массива).
    */

       int [] array = {0,1,2,3,4,5,6,7,8,9};
       for ( int i=array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
       }
        System.out.println();

    // 3. task (6-7)
    /*
      6. Создайте и проинициализируйте 2-мерный массив squareArray. Не используйте альтернативный синтаксис, т. е.
       инициализируйте каждый элемент по отдельности (например, squareArray[0][1] = 12; и т. д. каждый элемент)
      7. Выведите массив squareArray в консоль в виде таблицы. Рядом с каждым элементом массива
      выведите в квадратных скобках индексы строки и столбца (см. пример)

      Пример вывода 2-мерного массива:
      11[0][0] 12[0][1] 13[0][2]
      14[1][0] 15[1][1] 16[1][2]
    */

        int [][] squareArray = new int [2][3];
        squareArray[0][0] = 11;
        squareArray[0][1] = 12;
        squareArray[0][2] = 13;
        squareArray[1][0] = 14;
        squareArray[1][1] = 15;
        squareArray[1][2] = 16;

        for (int i=0; i<squareArray.length; i++) {
            for (int j=0; j<squareArray[i].length; j++){
                System.out.print(squareArray [i][j] + "[" + i + "][" + j + "] ");
            } System.out.println();
        }

    // additional tasks
    /*
      1. Реализовать расчет факториала для числа
      2. Написать программу, которая проверяет является ли число простым (если не помним, то гуглим,
      что такое простые и составные числа)
      Простые числа – это такие числа, которые делятся на себя и на единицу (например: 2, 3, 5, 7 и т. д.).
      единица, не является ни простым, ни составным
      3. Реализовать алгоритм “Решето Эратосфена” (примечание: возьмите конечную
       последовательность чисел - например, до 1000; используйте массивы)
    */

    // 1. Factorial (For)
        long n =3;
        long fact = 1;

        for (long i=1; i<=n; i++) {
            fact = fact * i;
        }

        System.out.println ( n + "!" + "=" + fact );

    // 1. factorial (Recursive | class)

        class Factorial {
          long factorial (long m) {

            if ( m==1 || m==0){
                return 1;
            }
            return m*factorial(m-1);
          }
        }

        Factorial result = new Factorial();
        long x = 3;
        System.out.println (x + "!" + "=" + result.factorial(x) );

    //2. simple number
        int z = 41;
        boolean q = false;
        for(int i =2; i<z; i++) {

            if (z % i == 0) {
                q = false;
                break;
            } else
                q = true;
        }

        if (q) System.out.println ("Число является простым");
        else System.out.println ("Число является составным");



    }

}


