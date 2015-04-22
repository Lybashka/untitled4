package nasledovanie;

/**
 * Created by student on 22.04.2015.
 */
public class Cylindr extends Circle {
    private double height;
    public Cylindr(){
        super();
        height=1.0;
    }
    public Cylindr(double height){
        super();
        this.height=height;
    }
    public Cylindr(double radius,double height){
        super(radius);
        this.height=height;
    }
    public double getHeight()

    {
        return height;
    }

    public double getArea(){
        return 2*Math.PI*super.getRadius()*height*2 +super.getRadius()*super.getRadius()*Math.PI;
    }
    public double getVolume()

    {
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylindr: subclass of " + super.toString()

                + " height=" + height;
    }

}
