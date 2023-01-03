package day44_Abstraction;

public class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreathe;

    static {
        canBreathe=true;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name=name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public final void drink(){
        System.out.println(name+" is drinking");
    }




}
/*
Animal Task:
Create an abstract class named Animal:
Variables:
name, breed(final), gender(final), age, size, color(final)

Encapsulate all the fields

Add a cosntructor that can set all the fields

Methods:
eat(); ==> different animals eat
different foods
drink() ==> all the animals drink water
toString() ==> to display the full info of the animal
 */