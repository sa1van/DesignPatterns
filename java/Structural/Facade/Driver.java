package Structural.Facade;

interface Home {
    void deviceOn();
    void deviceOff();
}

class TV implements Home {
    @Override
    public void deviceOn() {
    }

    @Override
    public void deviceOff() {
    }
}

class AC implements Home {
    @Override
    public void deviceOn() {
    }

    @Override
    public void deviceOff() {
    }
}

class Refrigerator implements Home {
    @Override
    public void deviceOn() {
    }

    @Override
    public void deviceOff() {
    }
}

class HandleHome {
    private Home manageAC;
    private Home manageTV;
    private Home manageRefrigerator;

    public HandleHome() {
        this.manageAC = new AC();
        this.manageTV = new TV();
        this.manageRefrigerator = new Refrigerator();
    }

    public void turnACOn() {
        manageAC.deviceOn();
    }

    public void turnTVOn() {
        manageTV.deviceOn();
    }

    public void turnRefrigeratorOn() {
        manageRefrigerator.deviceOn();
    }

    public void turnACOff() {
        manageAC.deviceOff();
    }

    public void turnTVOff() {
        manageTV.deviceOff();
    }

    public void turnRefrigeratorOff() {
        manageRefrigerator.deviceOff();
    }
}

//It provides a unified interface to a set of interfaces in a subsystem.
//It defines a higher level interface that makes the subsystem easier to use.
public class Driver {
    public static void main(String[] args) {

        HandleHome handleHome = new HandleHome();
        handleHome.turnACOn();
        handleHome.turnRefrigeratorOff();
        // ....

    }
}
