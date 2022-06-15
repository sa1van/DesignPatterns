package Structural.Bridge;

//The Bridge pattern is an application of the old advice, “prefer composition over inheritance”.
//It becomes handy when you must subclass different times in ways that are orthogonal with one
//another.
abstract class Vehicle {

    protected ManufacturingCompany manufacturingCompany;

    public Vehicle(ManufacturingCompany manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }

    public abstract void manufacture();
}

class Car extends Vehicle {

    public Car(ManufacturingCompany manufacturingCompany) {
        super(manufacturingCompany);
    }

    @Override
    public void manufacture() {
        manufacturingCompany.addTyres();
        manufacturingCompany.addVehicleParts();
    }
}

class Bus extends Vehicle {

    public Bus(ManufacturingCompany manufacturingCompany) {
        super(manufacturingCompany);
    }

    @Override
    public void manufacture() {
        manufacturingCompany.addTyres();
        manufacturingCompany.addVehicleParts();
    }
}

abstract class ManufacturingCompany {

    public abstract void addTyres();
    public abstract void addVehicleParts();

}

class Honda extends ManufacturingCompany {

    @Override
    public void addTyres() {
        System.out.println("Honda Tyre added");
    }

    @Override
    public void addVehicleParts() {
        System.out.println("Honda vehicle parts added");
    }
}

class Tata extends ManufacturingCompany {

    @Override
    public void addTyres() {
        System.out.println("Tata Tyre added");
    }

    @Override
    public void addVehicleParts() {
        System.out.println("Tata vehicle parts added");
    }
}



//    Bridge pattern decouple an abstraction from its implementation so that the two can
//    vary independently.
//    It is used mainly for implementing platform independence features.
//    It adds one more method level redirection to achieve the objective.
//    Publish abstraction interface in a separate inheritance hierarchy, and put the
//    implementation in its own inheritance hierarchy.
//    Use bridge pattern to run-time binding of the implementation.
//    Use bridge pattern to map orthogonal class hierarchies
//    Bridge is designed up-front to let the abstraction and the implementation vary independently.


//    https://www.geeksforgeeks.org/bridge-design-pattern/
public class Driver {
    public static void main(String[] args) {

        Vehicle vehicle = new Car(new Honda());
        vehicle.manufacture();

        Vehicle vehicle1 = new Bus(new Tata());
        vehicle1.manufacture();

    }
}
