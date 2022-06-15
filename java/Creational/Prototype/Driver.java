package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;


//Sometimes object creation can be expensive process.
// I'm not saying creation exactly but loading data in the object can be expensive
// for eg let's say we have some employees class that fetches data from 3-4 sources
// and stores the employee list.
//
//Sometimes we can think of having singleton objects but in some cases it might not be suitable.
//
//In such cases we can use Prototype pattern. It involves cloning an object.
//
//The responsibility of cloning is owned by the object itself.
//
//This helps in cases when we want to clone private fields or do deep/shallow copy as per our design.

public class Driver {
    public static void main(String[] args) throws CloneNotSupportedException {

        Users users1 = new Users();
        users1.fetchUserFromDatabase();

        Users users2 = (Users) users1.clone();

        users2.addNewUser("Parth");
        users2.addNewUser("Kaushal");
        users2.addNewUser("Rohan");

        users2.removeUser("Rohan");

        System.out.println(users1.getUserNameList());
        System.out.println(users2.getUserNameList());

        users2.info = users2.info + " and new added Users";
        System.out.println(users1.info);
        System.out.println(users2.info);

    }
}

//    Deep Copy

//    class Test {
//        int x, y;
//    }
//
//    // Contains a reference of Test and
//    // implements clone with deep copy.
//    class Test2 implements Cloneable {
//        int a, b;
//
//        Test c = new Test();
//
//        public Object clone() throws CloneNotSupportedException
//        {
//            // Assign the shallow copy to
//            // new reference variable t
//            Test2 t = (Test2)super.clone();
//
//            // Creating a deep copy for c
//            t.c = new Test();
//            t.c.x = c.x;
//            t.c.y = c.y;
//
//            // Create a new object for the field c
//            // and assign it to shallow copy obtained,
//            // to make it a deep copy
//            return t;
//        }
//    }



// Shallow Copy

//    class Test {
//        int x, y;
//    }
//
//    // Contains a reference of Test and
//    // implements clone with shallow copy.
//    class Test2 implements Cloneable {
//        int a;
//        int b;
//        Test c = new Test();
//        public Object clone() throws CloneNotSupportedException
//        {
//            return super.clone();
//        }
//    }