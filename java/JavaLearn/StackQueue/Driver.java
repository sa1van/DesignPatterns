package JavaLearn.StackQueue;

import java.util.*;

public class Driver {
    public static void main(String[] args) {

        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);

        //peek Returns the element on the top of the stack, but does not remove it.
        System.out.println(stk.peek());

        //pop Removes and returns the top element of the stack
        while(stk.empty() == false) {
            System.out.println(stk.pop());
        }


        //----------------------------------------------------------------------------------


        //Queue is an interface
        Queue<Integer> q = new LinkedList<>();

        // add
        for(int i=100;i<200;i++) {
            q.add(i);
        }

        // remove
        int elementRemoved = q.remove();
        System.out.println(elementRemoved);

        // To view the head of queue
        int head = q.peek();
        System.out.println(head);

        //size
        int sz = q.size();

        System.out.println(q);


        //----------------------------------------------------------------------------------


        Queue<String> pq = new PriorityQueue<>();
        // default asc, smaller first

        pq.add("B");
        pq.add("C");
        pq.add("C");
        pq.add("D");
        pq.add("A");

        //In order to remove an element from a queue, we can use the remove() method.
        //If there are multiple such objects, then the first occurrence of the object is removed.
        pq.remove("C");

        System.out.println(pq);

        // get Top
        System.out.println(pq.peek());

        // get and remove top
        System.out.println(pq.poll());

        while(pq.size() > 0) {
            System.out.println(pq.poll());
        }

       // Iterator iterator = pq.iterator();
       // while (iterator.hasNext()) {
       //       System.out.print(iterator.next() + " ");
       //  }

        // reverse sort
        // PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

       // PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(
       //         new Comparator<Integer>() {

                    // Compare method for place element in
                    // reverse order

                    // public int compare(Integer a, Integer b) {
                    // if (a < b)
                        // return 1;
                    // if (a > b)
                        // return -1;
                    // return 0;
                    // }
        // });


        // System.out.println(pq);

    }
}
