package Behavioural.Command;



//Facade is used to hide internal structure and provided a simplified interface.
//The command pattern is used to encapsulate actions which allow you to
// program undoable actions,task queue's etc..
class Light {

}

class Radio {

}

interface Command {
    void execute();
}

class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //do something
        //light.onLight();
        System.out.println("Light On");
    }
}

class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Light Off");
    }
}

class RadioOnCommand implements Command {

    Radio radio;

    public RadioOnCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        System.out.println("Radio On");
    }
}

class RadioOffCommand implements Command {

    Radio radio;

    public RadioOffCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        System.out.println("Radio Off");
    }
}

class Remote {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }
}


public class Driver {
    public static void main(String[] args) {

        Remote remote = new Remote();

        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remote.setCommand(lightOffCommand);
        remote.buttonPressed();

        remote.setCommand(lightOnCommand);
        remote.buttonPressed();

    }
}
