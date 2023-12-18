/*
Ashvin Ganesan

*/

//This class is used to represent a person in the Priory community
public class Person {
    private String name;
    private String bDay;
    private String address;
    private String title;
    public Person(){
        name = "";
        bDay = "";
        address = "";
        title = "";
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBDay(String bDay) {
        this.bDay = bDay;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    //this is just showing that "this" can refer to a method
    public void changeName(String newName) {
        this.setName(newName);
    }
    public String getName() {
        return name;
    }
    public String getBDay() {
        return bDay;
    }
    public String getAddress() {
        return address;
    }
    public String getTitle() {
        return title;
    }
    
    public Person(String name, String bDay, String address, String title) {
        this.name = name;
        this.bDay = bDay;
        this.address = address;
        this.title = title;
    }
    public String toString() {
        return "Name:\t\t\t" + name + "\nBrithday:\t\t" + bDay + "\nTitle:\t\t\t" + title + "\nAddress:\t\t" + address;
    }
}
