package day43_Abstraction.employeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {

        //Person person = new Person("Josh",35, 'M');
        //Employee employee= new Employee("Ali", 30, 'M', 42, "SDET", 145000); //abstract

        Tester tester= new Tester("Ali", 30, 'M', 42, "SDET", 14500);
        Developer developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000);
        Teacher teacher= new Teacher("Angel", 28, 'F', 22, "English Teacher", 85000);
        Driver driver= new Driver("Jhon", 34, 'M', 42, "Lyft Driver", 75000);

        System.out.println();








    }
}
