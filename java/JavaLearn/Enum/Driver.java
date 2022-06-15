package JavaLearn.Enum;

enum Color {
    RED,
    GREEN,
    BLUE;
}

enum Vehicle {
    CAR("4 wheels","Petrol or Diesel"),
    BIKE("2 wheels","Petrel"),
    TRUCK("Many wheels","Petrol or Diesel");

    String numberOfWheels;
    String fuel;

    public String getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getFuel() {
        return fuel;
    }

    private Vehicle(String numberOfWheels, String fuel) {
        System.out.println("Constructor called for : "
                + this.toString());

        this.numberOfWheels = numberOfWheels;
        this.fuel = fuel;
    }
}

public class Driver {
    public static void main(String[] args) {
        //Every enum constant is always implicitly public static final.
        // Since it is static, we can access it by using the enum Name.
        // Since it is final, we can’t create child enums.


        Color c1 = Color.BLUE;

        Color arr[] = Color.values();

        // enum with loop
        for (Color col : arr) {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index "
                    + col.ordinal());
        }

        // Using valueOf(). Returns an object of
        // Color with given constant.
        System.out.println(Color.valueOf("RED"));



        //enum can contain a constructor and it is executed separately for
        // each enum constant at the time of enum class loading.
        Vehicle vehiclesArray[] = Vehicle.values();
        for(Vehicle v : vehiclesArray) {
            System.out.println(v + " " + v.getNumberOfWheels() + " " + v.getFuel());
        }


//        -------------------------------------------------

//        int value=30;
//        String s1=String.valueOf(value);
//        int a=33;
//        Integer x=Integer.valueOf(a);
//        int y=x.intValue();
//        int z = Integer.parseInt("23");

    }
}
