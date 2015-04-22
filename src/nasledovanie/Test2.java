package nasledovanie;

/**
 * Created by student on 22.04.2015.
 */
public class Test2 {

    public static void main(String[] args) {
        Cylindr c1 = new Cylindr();

        System.out.println("Cylinder:"

                + " radius=" + c1.getRadius()

                + " height=" + c1.getHeight()

                + " base area=" + c1.getArea()

                + " volume=" + c1.getVolume());



        Cylindr c2 = new Cylindr(10.0);

        System.out.println("Cylinder:"

                + " radius=" + c2.getRadius()

                + " height=" + c2.getHeight()

                + " base area=" + c2.getArea()

                + " volume=" + c2.getVolume());



        Cylindr c3 = new Cylindr(2.0, 10.0);

        System.out.println("Cylinder:"

                + " radius=" + c3.getRadius()

                + " height=" + c3.getHeight()

                + " base area=" + c3.getArea()

                + " volume=" + c3.getVolume());

    }


}
