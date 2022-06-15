package Oops.Experiment;

interface A {
    default void a() {
        System.out.println("a");
    }
    default void common() {
        System.out.println("a common");
    }
}

interface B {
    default void b() {
        System.out.println("b");
    }
    default void common() {
        System.out.println("b common");
    }
}

class C implements A, B{
    public void common() {
        A.super.common();
        B.super.common();
    }
}



public class Driver {
    public static void main(String[] args) {

        C c = new C();
        c.a();
        c.b();
        c.common();

        Child child = new Child();
        child.show();
        child.timepass();

    }
}



interface GP {
    default void show() {
        System.out.println("show GrandParent");
    }

    default void timepass() {
        System.out.println("timepass grandparent");
    }
}

interface P1 extends GP {
    default void show() {
        GP.super.show();
    }
}

interface P2 extends GP {

}

class Child implements P1,P2 {
    public void show() {
        P1.super.show();
    }
}