package JavaLearn.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int height;

    public Student(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}

class SortStudentByName implements Comparator<Student> {

    public int compare(Student a,Student b) {

        int val = a.getName().compareTo(b.getName());

        if(val<0)
            return -1;
        else
            return 1;
    }
}

class SortStudentByMultipleParameter implements Comparator<Student> {

    public int compare(Student a,Student b) {

        int htVal = a.getHeight() - b.getHeight();

        if(htVal<0)
            return -1;
        else if(htVal>0)
            return 1;
        else {
            int val = a.getName().compareTo(b.getName());
            if(val<0)
                return -1;
            else
                return 1;
        }
    }
}

public class Driver {
    public static void main(String[] args) {

        List<Student> ls = new ArrayList<>();
        ls.add(new Student("Aditya",134));
        ls.add(new Student("Arnav",134));
        ls.add(new Student("Aarav",134));
        ls.add(new Student("Shubh",183));
        ls.add(new Student("Aarti",120));

        Collections.sort(ls,new SortStudentByName());

        for(Student s: ls)
            System.out.println(s.getName());

        Collections.sort(ls,new SortStudentByMultipleParameter());

        for(Student s: ls)
            System.out.println(s.getName() + " " + s.getHeight());

    }
}
