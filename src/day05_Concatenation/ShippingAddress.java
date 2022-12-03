package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

            String name = "James King",
                    buildingNumber = "1123B",
                    streetName = "Jones Branch Dr",
                    city = "McLean",
                    state = "VA",
                    zipCode = "22031A";

            /*
            String name = "James King";
            String buildingNumber = "1123B";
            String streetName = "Jones Branch Dr";

             */

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + " , " + state +" " + zipCode);



        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + " , " + state +" " + zipCode;



        System.out.println(address);





    }

}
/*
Declare the following variables:
  name
  buildingNumber
  streetName
  city
  state
  zipCode

  use concatenation to print the full shipping address
 */