package first;


import java.util.Scanner;

public  class Person {
    private static int nextID = 0;
    private int id = getNextID();
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private String phone;

    public Person(String lastName, String firstName, String patronymic, String address, String phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
    }

    public static int getNextID() {
        return nextID++;
    }

    public int getId() {
        return this.id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLName(String lName) {
        this.lastName = lName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFname(String fname) {
        this.firstName = fname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public void setPname(String pname) {
        this.patronymic = pname;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddr(String addr) {
        this.address = addr;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "Person{id=" + this.id + ", LastName='" + this.lastName + "', FirstName='" + this.firstName + "', Patronymic='" + this.patronymic + "', Address='" + this.address + "', Phone='" + this.phone + "'}";
    }


}