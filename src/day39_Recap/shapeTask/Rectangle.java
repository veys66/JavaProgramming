package day39_Recap.shapeTask;

public class Rectangle extends Shape {

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <=0){
            System.err.println("Invalid Length: "+length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(length <=0){
            System.err.println("Invalid Width: " +width);
            System.exit(1);
        }
        this.width = width;
    }


    public Rectangle(double length, double width) {
        super("Rectangle");
       setLength(length);
       setWidth(width);
    }


    public double area() {
        return length * width;
    }





    public double perimeter() {
        return 2 *(length + width);
    }



    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
