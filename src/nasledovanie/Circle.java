package nasledovanie;

/**
 * Created by student on 22.04.2015.
 */
public class Circle {
    private double radius;
    private String color;
    public Circle(){
        radius=1.0;
        color="red";
    }
    public Circle(double r){
        radius=r;
        color="red";
    }
    public Circle(double s,String k){
        radius=s;
        color=k;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public void setColor(String c){
        color=c;
    }
    public void  setRadius (double radius){
        this.radius=radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

