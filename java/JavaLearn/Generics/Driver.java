package JavaLearn.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test<T,U>
{
    T obj1;
    U obj2;

    public Test(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public U getObj2() {
        return obj2;
    }
}

public class Driver {

    public static <T> void printList(Iterable<T> ls)
    {
        for(T x: ls){
            System.out.println(x);
        }
    }

    public static <E,T> void printArray(E[] inputArray,T obj) {
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println(obj);
    }


    public static <T> List<T> convertArrayToList(T array[]) {

        List<T> list = new ArrayList<>();
        for (T t : array) {
            list.add(t);
        }

        return list;
    }

    public static void main(String[] args) {

        Test<Integer,String> t = new Test<>(1,"Savan");
        System.out.println(t.getObj1());
        System.out.println(t.getObj2());

        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);

        printList(ls);

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        printArray(intArray,"abcd");

        String array[] = { "A", "B", "C" };
        List<String> stringList = convertArrayToList(array);
        System.out.println(stringList);
    }
}
