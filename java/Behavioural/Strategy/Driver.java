package Behavioural.Strategy;

//Defines a family of algorithms, encapsulates each one and makes them interchangable.
//Strategy lets the algorithm vary independently from clients that use it

//Encapsulate what varies
//
//Favor composition over inheritance
//
//Program to interface not to implementation.

abstract class Dog {

    private Type type;
    private DogFood dogFood;

    public Dog(Type type, DogFood dogFood) {
        this.type = type;
        this.dogFood = dogFood;
    }

    public void getDogType() {
        this.type.info();
    }

    public void getDogFood() {
        this.dogFood.food();
    }

    public void setDogFood(DogFood dogFood) {
        this.dogFood = dogFood;
    }

    public abstract void dogName();
}

class Christo extends Dog {

    public Christo(Type type, DogFood dogFood) {
        super(type, dogFood);
    }

    @Override
    public void dogName() {
        System.out.println("Christo is my name");
    }
}

class Pluto extends Dog {

    public Pluto(Type type, DogFood dogFood) {
        super(type, dogFood);
    }

    @Override
    public void dogName() {
        System.out.println("Pluto is my name");
    }
}


interface Type {
    void info();
}

class Labrador implements Type {

    @Override
    public void info() {
        System.out.println("Labrador troubles a lot");
    }
}

class Pug implements Type {

    @Override
    public void info() {
        System.out.println("Pug is small");
    }
}

interface DogFood {
    void food();
}

class AdultDryFood implements DogFood {

    @Override
    public void food() {
        System.out.println("Adult Dry Food");
    }
}

class PuppyDryFood implements DogFood {

    @Override
    public void food() {
        System.out.println("Puppy Dry food");
    }
}

public class Driver {
    public static void main(String[] args) {

        Type type = new Labrador();
        DogFood dogFood = new AdultDryFood();

        Dog dog = new Christo(type,dogFood);

        dog.dogName();
        dog.getDogType();
        dog.getDogFood();

        dog.setDogFood(new PuppyDryFood());
        dog.getDogFood();


    }
}
