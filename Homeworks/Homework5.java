public class Homework5 {
    public static void main(String[] args) {

    /*
    1. Создайте класс Rectangle (Прямоугольник). Добавьте в него 2 поля класса x и y типа double
    2. Создайте конструктор, который принимает на вход 2 аргумента x и y соответственно
    3. Создайте конструктор, который принимает на вход 1 аргумент и инициализирует им оба поля класса
        Rectangle (т. е. по факту это будет квадрат)
    4. Добавьте в класс Rectangle метод под названием calculateArea без параметров. Этот метод должен вычислять
        площадь данного прямоугольника и возвращать результат
    5. Добавьте в класс Rectangle метод printArea без параметров. Этот метод должен выводить в консоль площадь
        текущего прямоугольника. Для получения площади в этом методе использовать метод calculateArea добавленный ранее
    6. Добавить в класс Rectangle метод printRectangleKind без параметров. Этот метод должен выводить в консоль
        “Это квадрат” или “Это прямоугольник” в зависимости от соотношения x и y
    7. Добавить в класс Rectangle метод isTheSameRectangle с единственным параметром типа Rectangle возвращающий
        тип boolean . Данный метод должен сравнить 2 прямоугольника (вызывающий и тот, который передан
        аргументом в метод) на предмет равенства (прямоугольники равны, если равны их стороны)
    8. Для демонстрации работы программы в методе main создать 3 экземпляра класса Rectangle (1 из них должен быть
        квадратом, 2 остальных прямоугольниками). Для каждого из созданных объектов продемонстрировать работу всех
        методов класса Rectangle
     */

    // task (5.1) "Создайте класс" , tasks (6.1,6.3)
        class Rectangle {
            private final double x;
            private final double y;
            private static int createdRectangles; //6.1
            private final static String RUSSIAN_CLASS_NAME = "Прямоугольник"; //6.3
            private final static String ENGLISH_CLASS_NAME = "Rectangle"; //6.3

    // task (5.2) "Конструктор 2 аргумента" , task (6.1)
            public Rectangle(double x, double y) {
                this.x = x;
                this.y = y;
                createdRectangles++; //6.1
            }

    // task (5.3) "Конструктор 1 аргумент", task (6.1)
            public Rectangle(double x) {
                this.x = x;
                this.y = x;
                createdRectangles++; //6.1
            }

    // task (5.4) "Метод 1 - площадь прямоугольника"
            double calculateArea() {
                return x * y;
            }

    // task (5.5) "Метод 2 - вывод в консоль площади"
            void printArea() {
                System.out.println("Площадь = " + calculateArea());
            }

    // task (5.6) "Метод 3 - вывод в консоль текста"
            void printRectangleKind() {
                if (x == y)
                    System.out.println("Это квадрат");
                else
                    System.out.println("Это прямоугольник");
            }

    // task (5.7) "Метод 4 - сравнить 2 прямоугольника"
            boolean isTheSameRectangle(Rectangle obj) {
                if (obj.x == this.x && obj.y == this.y)
                    return true;
                else if (obj.x == this.y && obj.y == this.x)
                    return true;
                else return false;
                }

    // task 6.2 "Метод 5 - создано прямоугольников"
            static void printRectanglesCount() {
                System.out.println("Всего было создано " + createdRectangles  + " прямоугольников");
            }

    // task 6.4 "Метод 6 - название класса на русском или английском"
            static void printClassName (boolean printInRussian) {
                if (printInRussian)  System.out.println(RUSSIAN_CLASS_NAME);
                else  System.out.println(ENGLISH_CLASS_NAME);
            }


        } // class Rectangle




    // Демонстрация методов:
        Rectangle rec1 = new Rectangle(5.5);
        Rectangle rec2 = new Rectangle(8,9);
        Rectangle rec3 = new Rectangle(4.8,7.2);

    // Метод 1
        double s1 = rec1.calculateArea();
        double s2 = rec2.calculateArea();
        double s3 = rec3.calculateArea();
        System.out.println(s1 + " " + s2 + " " + s3);

    // Метод 2
        rec1.printArea();
        rec2.printArea();
        rec3.printArea();

    // Метод 3
        rec1.printRectangleKind();
        rec2.printRectangleKind();
        rec3.printRectangleKind();

    // Метод 4
        boolean same11,same12,same13, same22, same33, same31;

        same11 = rec1.isTheSameRectangle(rec1);
        same12 = rec1.isTheSameRectangle(rec2);
        same13 = rec1.isTheSameRectangle(rec3);
        same22 = rec2.isTheSameRectangle(rec2);
        same33 = rec3.isTheSameRectangle(rec3);
        same31 = rec3.isTheSameRectangle(rec1);
        System.out.println(same11 + " " + same12 +  " " + same13 +  " " + same22 +  " " + same33 +  " " + same31);

    // Метод 5
        Rectangle.printRectanglesCount();

    // Метод 6
        Rectangle.printClassName(true);
        Rectangle.printClassName(false);


    /*
    1.В классе Rectangle создать статическую переменную createdRectangles типа int с модификатором
    доступа private. Добавить в каждый из конструкторов увеличение этой переменной на 1
    2.В класс Rectangle добавить статический метод printRectanglesCount. Этот метод должен выводить
    значение переменной createdRectangles в формате “Всего было создано [n] прямоугольников”
    ([n] заменить на реальное число)
    3.Создать в классе Rectangle 2 приватные константы (использовать модификаторы private final static)
    типа String с именами RUSSIAN_CLASS_NAME и ENGLISH_CLASS_NAME.
    Проинициализировать их значениями “Прямоугольник” и “Rectangle” соответственно
    4. Создать в классе Rectangle статический метод printClassName с единственным аргументом типа boolean
    и названием printInRussian. Метод должен в зависимости от значения аргумента выводить название класса
    на русском или английском языке (для вывода использовать константы созданные в предыдущем пункте)
    5. Не забудьте залить изменения в репозиторий (сделать commit и push)



     */

    }
}

