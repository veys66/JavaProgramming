package day39_Recap.shapeTask;

public class Circle extends Shape{

    private double radius;
    public static double pi= 3.14;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if(radius <= 0){
            System.err.println("Invalid Radius: "+radius);
            System.exit(1);
        }
        this.radius=radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }
}
