package day40_FinalKeyword;

import day44_Abstraction.animalTask.Playable;

public class Dog extends Animal implements Playable {


    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


    public void eat(){
        System.out.println(getName()+ " is eating dog food");
    }

    /*public void drink(){ // final can not be overridden
        System.out.println(getName()+" is drinking beer");
    }
    */

    public void bark(){
        System.out.println(getName()+" is barking");
    }


    @Override
    public void play() {

    }
}
