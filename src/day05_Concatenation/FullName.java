package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Conor";
        String lastName = "Khabib";
        int age = 45;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;


        String fullName = firstName +" "+ lastName;

        System.out.println(fullName);

        //Full name of the person is ______
        System.out.println(" Full name of the person is " + fullName);

        //_____is ____ years old

        System.out.println(fullName + " is " + age + " years old" );

        //Fullname is JobTitle  works at  CompanyName, and Fullname` salary is Salary
        System.out.println(fullName + " is " + jobTitle + " works at " + companyName + ", and " + fullName + "`s salary is $" + salary );







    }
}
