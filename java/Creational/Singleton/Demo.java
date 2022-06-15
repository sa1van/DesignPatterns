package Creational.Singleton;

// eager
class SingletonObject {

    private static SingletonObject singletonObject = new SingletonObject();

    private SingletonObject() {

    }

    public static SingletonObject getObject() {
        return singletonObject;
    }

    public void showMsg() {
        System.out.println("Singleton Object!");
    }

}

public class Demo {
    public static void main(String[] args) {

        SingletonObject obj = SingletonObject.getObject();
        obj.showMsg();

    }
}
