package Oops.Experiment;

interface AA {
    void a();
}

interface BB {
    void b();
}

interface CC {
    void c();
}

class D implements AA,BB,CC{
    public void a() {
        System.out.println(1);
    }
    public void b() {

        System.out.println(2);
    }
    public void c() {

        System.out.println(3);
    }
}


public class Experimenting {
    public static void main(String[] args) {
        D d = new D();
        d.c();
    }
}
