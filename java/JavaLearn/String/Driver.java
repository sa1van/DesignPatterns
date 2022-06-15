package JavaLearn.String;

public class Driver {
    public static void main(String[] args) {

        String s = "Alexa, play some songs";
        String s1 = new String("Siri, play some songs");

        char[] chArray = s.toCharArray();
        for(char c: chArray)
            System.out.print(c);

        System.out.println();

        StringBuilder sb = new StringBuilder(s);

        sb.setCharAt(0,'p');

        String x=sb.toString();

        System.out.println(x);

        // Learn more methods....


    }
}
