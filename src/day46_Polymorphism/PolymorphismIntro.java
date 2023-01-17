package day46_Polymorphism;

import day40_FinalKeyword.Animal;
import day40_FinalKeyword.Cat;
import day40_FinalKeyword.Dog;
import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Playable;
import day45_Abstraction.shape.*;

import java.util.ArrayList;

public class PolymorphismIntro {
    public static void main(String[] args) {

        String str= "Wooden Spoon";

        Integer n1=2;

        Double n2= 5.5;

        Boolean r1= true;

       Object [] array= {str, n1, n2, r1, new Circle("circle",4), new Square(7)};



        Employee tester= new Tester("Ali", 30, 'M', 42, "SDET", 14500);
        Employee developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000);
        Employee teacher= new Teacher("Angel", 28, 'F', 22, "English Teacher", 85000);
        Employee driver= new Driver("Jhon", 34, 'M', 42, "Lyft Driver", 75000);

        ArrayList<Person> cydeoEmployees =  new ArrayList();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);

        System.out.println("---------------------------------------------------------------------------------------------------------");

        Employee employee= new Tester("Ali", 30, 'M', 42, "SDET", 14500);
        employee.work();
        //employee.bugReport();


        Animal animal= new Dog("Max", "Husky", 'M', "White", "Small", 3);
        animal.drink();
        animal.eat();
        //animal.play();
        //animal.bark();

      Playable animal2= new Dog("Max", "Husky", 'M', "White", "Small", 3);
        System.out.println(animal2.isFriendly);
        animal2.play();
        //animal.drink();
        //animal2.eat();

        Animal animal3= new Cat("Max", "Husky", 'M', "white", "Small", 3);

        Shape shape= new Circle("Circle", 5);
        shape.area();

        //System.out.println(shape.getRadius());
        //System.out.println(shape.PI);

        boolean isSquare=shape instanceof Square;
        boolean isRectangle= shape instanceof Rectangle;
        boolean isTriangle= shape instanceof Triangle;
        boolean isCircle= shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);


        /*
        WebDriver driver:
           if (river instance Chrome ){
           Chrome browser will open
           }else if(driver instanceof firefox){
           Firefox browser will open
           }
           ...
         */
    }
}
