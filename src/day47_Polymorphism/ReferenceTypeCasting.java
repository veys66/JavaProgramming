package day47_Polymorphism;

import day40_FinalKeyword.Animal;
import day40_FinalKeyword.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCasting {
    public static void main(String[] args) {


        //Shape shape= (Shape) new Circle(4); //upcasting

        Shape shape2= new Circle("Circle", 5);


        //WebDriver driver= (Chrome Driver) new ChromeDriver();

        Dog dog2= new Dog("Max", "Husky", 'M', "White", "small", 3);
        //Dog dog3= dog2;



        Animal animal = new Dog("Max", "Husky", 'M', "White", "small", 3);

        //Dog dog= (Dog) animal;
        //dog.bark();

        System.out.println(animal.getName());
        //System.out.println(dog.getName());

        //animal.bark();
       ((Dog)animal ).bark();

       Shape shape1= new Square(5);

        System.out.println( ((Square) shape1).getSide() );


    }
}
