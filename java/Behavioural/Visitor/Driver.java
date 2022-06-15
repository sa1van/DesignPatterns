package Behavioural.Visitor;

interface Item {
    int visit(Visitor visitor);
}

class Bat implements Item {
    String name;
    int price;

    public Bat(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int visit(Visitor visitor) {
        return visitor.getPriceForBat(this);
    }
}

class Ball implements Item {
    String name;
    int price;
    int weight;

    public Ball(String name, int price,int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int visit(Visitor visitor) {
        return visitor.getPriceForBall(this);
    }
}

interface Visitor {
    int getPriceForBat(Bat bat);
    int getPriceForBall(Ball ball);
}

class VisitorImpl implements Visitor {

    @Override
    public int getPriceForBat(Bat bat) {
        if(bat.getName().equals("MRF")) {
            return (int)(bat.getPrice()*0.9);
        }
        else {
            return (int)(bat.getPrice()*0.85);
        }
    }

    @Override
    public int getPriceForBall(Ball ball) {
        if(ball.getName().equals("SS")) {
            return (int)(ball.getPrice()*0.95);
        }
        else {
            return (int)(ball.getPrice()*0.9);
        }
    }
}

public class Driver {
    public static void main(String[] args) {

        Visitor visitor = new VisitorImpl();

        Bat bat = new Bat("MRF",20000);
        Ball ball = new Ball("SS",2000,2);

        System.out.println(bat.visit(visitor));
        System.out.println(ball.visit(visitor));

    }
}
