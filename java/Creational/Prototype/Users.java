package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Users implements Cloneable {

    public String info;
    private List<String> userNameList;

    public Users() {
        this.userNameList = new ArrayList<>();
        this.info = "This class holds information about Users";
    }

    public Users(List<String> userNameList) {
        this.userNameList = userNameList;
    }

    public List<String> getUserNameList() {
        return userNameList;
    }

    public void addNewUser(String newUserName) {
        this.userNameList.add(newUserName);
    }

    public void removeUser(String userName) {
        this.userNameList.remove(userName); // removes first occurrence
    }

    // fetch data from DB
    public void fetchUserFromDatabase() {

        String rohan = "Rohan";
        String sameer = "Sameer";
        String shikhar = "Shikhar";

        this.userNameList.add(rohan);
        this.userNameList.add(sameer);
        this.userNameList.add(shikhar);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //deep clone

        Users newObj = new Users();

        for(String s: this.userNameList) {
            newObj.userNameList.add(s);
        }

        return newObj;
    }

}
