import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Point2 p1 = new Point2(1, 1);
        Point2 p2 = new Point2(1, 1);
        System.out.println(p2.equals(p1));
        Point3 p3 = new Point3(1, 1, 1);
        System.out.println(p2.equals(p3));//function from class Object
        System.out.println(p3.equals(p2));//function from class Object
        System.out.println(p1.toString());//function from class Object
        System.out.println(p3.toString());//function from class Object
        System.out.println(p3.getClass());//function from class Object

        Random a = new Random();
        System.out.println("Integers:");
        int[] tab1 = new int[10];
        for(int i = 0; i < 10; i++) {
            tab1[i] = a.nextInt(20);
            System.out.println(tab1[i]);
        }
        Arrays.sort(tab1);
        System.out.println("Sorted:");
        for(int i = 0; i < 10; i++)
            System.out.println(tab1[i]);

        System.out.println("Points:");
        Point2[] tab2 = new Point2[10];
        for(int i = 0; i < 10; i++) {
            tab2[i] = new Point2(a.nextDouble(),a.nextDouble());
            System.out.println(tab2[i].toString());//function from class Object
        }
        Arrays.sort(tab2);
        System.out.println("Sorted ascending by x:");
        for(int i = 0; i < 10; i++)
            System.out.println(tab2[i].toString());//function from class Object

        System.out.println("Inverted points:");
        for(int i = 0; i < 10; i++)
            tab2[i].Inversion();//function from interface
        for(int i = 0; i < 10; i++)
            System.out.println(tab2[i].toString());//function from class Object

        System.out.println("Replaced coordinates:");
        for(int i = 0; i < 10; i++)
            tab2[i].XtoYtoX();//function from interface
        for(int i = 0; i < 10; i++)
            System.out.println(tab2[i].toString());//function from class Object
    }
}
