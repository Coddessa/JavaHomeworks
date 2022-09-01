public class Homework5 {
    public static void main(String[] args) {


    /* 1. Создайте класс Rectangle (Прямоугольник). Добавьте в него 2 поля класса x и y типа double
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
    // task (1) Создайте класс
      class Rectangle {
          private double x;
          private double y;

          // task (2) конструктор 2 аргумента
          public Rectangle(double x, double y) {
              this.x = x;
              this.y = y;
          }

          // task (3) конструктор 1 аргумент
          public Rectangle(double x) {
              this.x = x;
              this.y = x;
          }

          // task (4) Метод 1 площадь прямоугольника
          double calculateArea() {
              return x * y;
          }

          // task (5) Метод 2 вывод в консоль площади
          void printArea() {
              System.out.println("Площадь = " + calculateArea());
          }

          // task (6) Метод 3 вывод в консоль текста
          void printRectangleKind() {
              if (x == y)
                  System.out.println("Это квадрат");
              else
                  System.out.println("Это прямоугольник");
          }

          // task (7) Метод 4 сравнить 2 прямоугольника
          boolean isTheSameRectangle(Rectangle obj) {
              if (obj.x == this.x && obj.y == this.y)
                 return true;
              else if (obj.x == this.y && obj.y == this.x)
                 return true;
              else return false;
          }
      }
          Rectangle rec1 = new Rectangle(5.5,5.5);
          Rectangle rec2 = new Rectangle(8,9);
          Rectangle rec3 = new Rectangle(4.8,7.2);

          // Метод 1
          double s1 = rec1.calculateArea();
          double s2 = rec2.calculateArea();
          double s3 = rec3.calculateArea();

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


    }
}

