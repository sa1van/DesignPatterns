package JavaLearn.HashSetLearn;

import java.util.HashSet;
import java.util.Iterator;

public class Driver {
    public static void main(String[] args) {

        HashSet<Integer> st = new HashSet<>();

        // add
        st.add(11);
        st.add(42);
        st.add(545);
        st.add(4);
        st.add(4);

        //remove
        st.remove(4);

        // check
        System.out.println(st.contains(11));

        System.out.println(st);
        // TreeSet provides sorted order

        Iterator<Integer> itr = st.iterator();
        //Iterators in Java are used in the Collection framework to retrieve elements one by one.
        // It is a universal iterator as we can apply it to any Collection object.
        // By using Iterator, we can perform both read and remove operations.

        while(itr.hasNext()) {

            Integer val = itr.next();
            System.out.println(val);

            if(val%2 == 1) {
                itr.remove();
            }
        }

        System.out.println(st);

    }
}
