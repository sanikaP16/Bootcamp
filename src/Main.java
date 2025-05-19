import models.MyMath;
import models.Rectangle;
import models.Square;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        MyMath op = new MyMath(6, 7);
        System.out.println(op.add());

        Rectangle rectangle = new Rectangle(4, 6);
        int area = (int) rectangle.area();

        System.out.println("The area of rectangle" + area);
        System.out.println("The perimeter of Rectangle"+rectangle.perimeter());

        Square square = new Square(4);
        int sqareArea = (int) square.area();
        System.out.println(sqareArea);
    }
}