package Creational.Singleton;


class SingletonLazyObject {

    private static SingletonLazyObject singletonLazyObject = null;

    private SingletonLazyObject() {

    }

    public static SingletonLazyObject getObject() {

        if(singletonLazyObject == null) {
            singletonLazyObject = new SingletonLazyObject();
        }

        return singletonLazyObject;
    }

    public void showMsg() {
        System.out.println("Singleton Object!");
    }

}



//lazy
public class Lazy {
    public static void main(String[] args) {
        SingletonLazyObject obj = SingletonLazyObject.getObject();
        obj.showMsg();

        SingletonLazyObject obj1 = SingletonLazyObject.getObject();
        obj1.showMsg();
    }
}
