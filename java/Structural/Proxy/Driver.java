package Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

interface Internet {
    void connectToSite(String site);
}

class RealInternet implements Internet {

    @Override
    public void connectToSite(String site) {
        System.out.println("Connecting to " + site);
    }
}

class ProxyInternet implements Internet {

    private static Internet internet;
    private static List<String> banned;

    static
    {
        internet = new RealInternet();
        banned = new ArrayList<>();
        banned.add("xFan");
        banned.add("onlyFans");
        banned.add("tiktok");
    }

    @Override
    public void connectToSite(String site) {

        if(banned.contains(site)) {
            System.out.println("Eerada kya hai bhai...");
        }
        else {
            internet.connectToSite(site);
        }

    }
}

//It is a proxy which controls access to an object based on access rights.
// For eg if we have an employee object then it can call certain methods but only
// Manager can call certain methods on it eg setSalary.
//
//We'll use Proxy class by Java where actually the Proxy classes are created at runtime
// and what we have to do is to create invocation handler for methods.
public class Driver {
    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        internet.connectToSite("xFan");
        internet.connectToSite("netflix");
        internet.connectToSite("onlyFans");
        internet.connectToSite("jethalal_fan_club");

    }
}
