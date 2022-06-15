package Creational.Singleton;

// Cache,Logging,DB connection

class SingletonWithSynchronization {

    private static SingletonWithSynchronization singletonWithSynchronization = null;

    private SingletonWithSynchronization() {
        System.out.println("Object created");
    }

    // making method synchronized
    public static synchronized SingletonWithSynchronization getObject() {

        if(singletonWithSynchronization == null) {
            singletonWithSynchronization = new SingletonWithSynchronization();
        }
        return singletonWithSynchronization;
    }

    //making block synchronized
//    public static SingletonWithSynchronization getObject() {
//        if(singletonWithSynchronization == null) {
//                synchronized (SingletonWithSynchronization.class) {
//                    if(singletonWithSynchronization == null) {
//                        singletonWithSynchronization = new SingletonWithSynchronization();
//                    }
//                }
//        }
//        return singletonWithSynchronization;
//    }


    public void showMsg() {
        System.out.println("Singleton Object!");
    }

}

// synchronized
public class Synchronized {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonWithSynchronization singletonWithSynchronization = SingletonWithSynchronization.getObject();
                singletonWithSynchronization.showMsg();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonWithSynchronization singletonWithSynchronization = SingletonWithSynchronization.getObject();
                singletonWithSynchronization.showMsg();
            }
        });

        t1.start();
        t2.start();

    }
}
