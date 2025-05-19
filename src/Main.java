import models.MyMath;
import models.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        MyMath op = new MyMath(6, 7);
        int addtion = op.add();
        System.out.println(addtion);
        Rectangle rectangle = new Rectangle(4,6);
        int area = (int) rectangle.area();

        System.out.println("The area of rectangle"+area);

    }
}