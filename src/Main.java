import models.Math;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println(add(5,4));
        Math op = new Math(6, 7);
        int addtion = op.add();
        System.out.println(addtion);
    }
}