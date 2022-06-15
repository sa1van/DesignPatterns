package Behavioural.Mediator;

import java.util.ArrayList;
import java.util.List;

//Mediator enables decoupling of objects by introducing a layer in between so that the
//interaction between objects happen via the layer. If the objects interact with each
//other directly, the system components are tightly-coupled with each other that makes
//higher maintainability cost and not hard to extend. Mediator pattern focuses on providing
//a mediator between objects for communication and help in implementing lose-coupling between
//objects.

abstract class Mediator {
    public abstract void addUser(User user);
    public abstract void sendMessage(String msg,User sender);
}

class MediatorImp extends Mediator {

    List<User> users;

    public MediatorImp() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User sender) {

        for(User user : this.users) {
            if(user.getName() != sender.getName()) {
                user.receiveMessage(msg,sender);
            }
        }

    }
}

abstract class User {

    private Mediator mediator;
    private String name;

    public User(Mediator mediator,String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public String getName() {
        return this.name;
    }

    public abstract void sendMessage(String msg);

    public abstract void receiveMessage(String msg,User sender);
}

class UserImp extends User {

    public UserImp(Mediator mediator,String name) {
        super(mediator,name);
    }

    @Override
    public void sendMessage(String msg) {
        this.getMediator().sendMessage(msg,this);
    }

    @Override
    public void receiveMessage(String msg,User sender) {
        System.out.println("Message by " + sender.getName() + ": " + msg + " To: " + this.getName());
    }
}


public class Driver {
    public static void main(String[] args) {

        Mediator mediator = new MediatorImp();

        User user1 = new UserImp(mediator,"Rahul");
        User user2 = new UserImp(mediator,"Namit");
        User user3 = new UserImp(mediator,"Punit");
        User user4 = new UserImp(mediator,"Dilbagh");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);


        user4.sendMessage("Police ne tumhe chaaro aur se gher lia hai");


    }
}
