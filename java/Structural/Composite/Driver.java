package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

class Menu {
    private String name;
    private String description;
    private List<Menu> menuList;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        this.menuList = new ArrayList<>();
    }

    public void add(Menu m) {
        this.menuList.add(m);
    }

    public void showItem() {

        System.out.println(this.name + " " + this.description + " ->");

        for(Menu m: menuList) {
            m.showItem();
        }

    }
}


//It allows us to build structures of objects in form of trees that
// contain both composition of objects as well as individual objects as nodes.
public class Driver {
    public static void main(String[] args) {

        Menu breakfast = new Menu("Breakfast","Morning things");
        Menu dinner = new Menu("Dinner","Evening things");

        Menu eggs = new Menu("Eggs","eggs are boiled");
        Menu juice = new Menu("Juice","juice is fresh");

        Menu paneer = new Menu("Paneer","Paneer is white :))");
        Menu rice = new Menu("Rice","Jira rice");

        breakfast.add(eggs);
        breakfast.add(juice);

        dinner.add(paneer);
        dinner.add(rice);


        Menu allMenus = new Menu("All menus", "All menu combined together");
        allMenus.add(breakfast);
        allMenus.add(dinner);


        allMenus.showItem();

    }
}
