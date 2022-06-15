package Structural.FlyWeight;

import java.util.HashMap;

interface Vehicle {
    void tellCarName();
}

class Car implements Vehicle {

    private String carName;

    public Car(String carName) {
        System.out.println("New car created " + carName);
        this.carName = carName;
    }

    @Override
    public void tellCarName() {
        System.out.println("Car name is " + carName);
    }
}

class CarFactory {

    private static HashMap<String,Car> carHashMap = new HashMap<>();

    public static Car getCircle(String carName) {

        if(carHashMap.containsKey(carName)) {
            return carHashMap.get(carName);
        }
        else {
            Car c = new Car(carName);
            carHashMap.put(carName,c);
            return c;
        }

    }

}



//This pattern helps in avoiding creation of large number of objects.
// For ex if there is a class where we might need to create close to 10^5 objects then this
// pattern can be of good choice.
//
//It caches the objects. But we need to take care of intrinsic and extrinsic properties.
//
//For these kinda properties we need to make sure that we set them accordingly after
// fetching them from the factory.
//
//This pattern is often accompanied with factory method/abstract factory method because
// a caching kinda logic is there.
//It caches the objects. But we need to take care of intrinsic and extrinsic properties.

//Flyweight pattern is used when we need to create a large number of similar objects (say 10^5).
//In Flyweight, object is immutable.
//In Prototype, object is mutable.
//
//Flyweight is about saving memory by not creating new objects and reusing existing ones when possible.
//Prototype is about, reusing existing object in order to save cost of new object creation.
//
//Flyweight is used when creating multiple type of single object
//Prototype is used when creating single type of single object.
public class Driver {

    private static final String carsArray[] = { "HondaCity", "Jazz", "Creta", "i10", "accent" };

    public static void main(String[] args) {

        for(int i=0; i < 8; ++i) {
            int pos = (int)(Math.random()*carsArray.length);
            Car c = CarFactory.getCircle(carsArray[pos]);
            c.tellCarName();
        }

    }
}
