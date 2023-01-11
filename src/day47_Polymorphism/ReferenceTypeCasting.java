package day47_Polymorphism;

import day40_FinalKeyword.Animal;
import day40_FinalKeyword.Cat;
import day40_FinalKeyword.Dog;
import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Person;
import day43_Abstraction.employeeTask.Tester;
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

        System.out.println("----------------------------------------------------------------------");

        Animal animal2= new Cat("Jim", "Scottish", 'M', "White", "small", 3);

       //Cat cat= (Cat) animal2;
       //cat.meow();

        ((Cat) animal2).meow();

        //((Dog) animal2).bark();

        System.out.println("---------------------------------------------------------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 14500);

        ((Tester)employee).bugReport();

        //((Tester)employee).unitTest;

        //((Developer)employee).unitTest();

        //Driver driver=(Driver) employee; //line1
        Person person=(Person) employee;//line2
        //Teacher teacher=(Teacher) employee; //line3

        System.out.println("------------------------------------------------------------------------------");

        Shape s1= new Circle("Circle", 10);
        s1.area();
        s1.perimeter();

        //((Cube)s1).volume();





    }
}
