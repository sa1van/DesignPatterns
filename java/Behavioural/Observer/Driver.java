package Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

//Observer is a behavioral design pattern that lets you define a subscription mechanism to
// notify multiple objects about any events that happen to the object they’re observing.
class Subject {

    public List<Observer> observers = new ArrayList<>();

    private int numberState = 0;

    public int getNumberState() {
        return this.numberState;
    }

    public void changeNumberState(int number) {
        this.numberState = number;
        updateAll();
    }

    public void updateAll() {
        for(Observer observer : observers) {
            observer.getValue();
        }
    }
}

abstract class Observer {

    protected Subject subject;

    public abstract void getValue();
}

class Binary extends Observer {

    public Binary(Subject subject) {
        this.subject = subject;
        subject.observers.add(this);
    }

    @Override
    public void getValue() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getNumberState() ) );
    }
}

class Hexa extends Observer {

    public Hexa(Subject subject) {
        this.subject = subject;
        subject.observers.add(this);
    }

    @Override
    public void getValue() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getNumberState() ).toUpperCase() );
    }
}

public class Driver {
    public static void main(String[] args) {

        Subject subject = new Subject();

        new Binary(subject);
        new Hexa(subject);

        subject.changeNumberState(5);
        subject.changeNumberState(9);
        subject.changeNumberState(21);

    }
}
