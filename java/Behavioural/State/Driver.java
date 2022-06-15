package Behavioural.State;

import java.util.ArrayList;
import java.util.List;


//State pattern is one of the behavioral design pattern. State design pattern is used when an
//Object changes its behavior based on its internal state.
//
//If we have to change behavior of an object based on its state, we can have a state variable
//in the Object and use if-else condition block to perform different actions based on the state.
//State pattern is used to provide a systematic and lose-coupled way to achieve this through Context
//and State implementations.
interface State {
    void alert(Mobile mobile);
}

class Vibrate implements State {

    @Override
    public void alert(Mobile mobile) {

        // We have mobile
        System.out.println("Vibrate");
    }
}

class Silent implements State {

    @Override
    public void alert(Mobile mobile) {

        //We have mobile
        System.out.println("Silent");
    }
}

class Mobile {

    // No need to create list
    private List<State> stateList = new ArrayList<>();

    private State state;

    public Mobile() {

        stateList.add(new Silent());
        stateList.add(new Vibrate());

        state = null;
    }

    public void changeMode(int ind) {
        state = stateList.get(ind);
    }

    public void alert() {
        this.state.alert(this);
    }

}


public class Driver {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        mobile.changeMode(0);
        mobile.alert();

        mobile.changeMode(1);
        mobile.alert();

        mobile.changeMode(0);
        mobile.alert();
    }
}
