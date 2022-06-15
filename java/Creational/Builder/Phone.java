package Creational.Builder;

//Sometimes situation comes that constructors start having large number of parameters.
//
//This generally happens when there are many configurations that can be done.
// But this leads to ugly looking calls as some objects might have those configurations,
// some might not. In such cases we use Builder pattern.
public class Phone {

    String os;
    String ram;
    int battery;

    public Phone(String os, String ram,int battery) {
        this.os = os;
        this.ram = ram;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram='" + ram + '\'' +
                ", battery=" + battery +
                '}';
    }
}

class PhoneBuilder {
    String os;
    String ram;
    int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os,ram,battery);
    }
}


class Example {
    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOs("IOS").getPhone();

//        System.out.println(p);
        System.out.println(p.toString());

    }
}
