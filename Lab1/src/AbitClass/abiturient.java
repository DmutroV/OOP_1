package AbitClass;

import java.util.Scanner;

public class abiturient {
    private static int nextID = 0;
    private int id = getNextID();
    private String lastName;
    private String firstName;
    private String pobatName;
    private String address;
    private String phone;
    private double averscore;

    public abiturient() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введіть дані абітурієнта: \nпрізвище: ");
        this.lastName = scn.nextLine();
        System.out.print("ім'я: ");
        this.firstName = scn.nextLine();
        System.out.print("по батькові: ");
        this.pobatName = scn.nextLine();
        System.out.print("адреса проживання: ");
        this.address = scn.nextLine();
        System.out.print("номер телефону: ");
        this.phone = scn.nextLine();
        System.out.print("середній бал: ");
        this.averscore = scn.nextDouble();
        scn.nextLine();
    }

    public abiturient(String lastName, String firstName, String patronymic, String address, String phone, double averageScore) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.pobatName = patronymic;
        this.address = address;
        this.phone = phone;
        this.averscore = averageScore;
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
        return this.pobatName;
    }

    public void setPname(String pname) {
        this.pobatName = pname;
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

    public double getAverageScore() {
        return this.averscore;
    }

    public void setAver_Score(double Aver_Score) {
        this.averscore = Aver_Score;
    }

    public String toString() {
        return "Abiturient{id=" + this.id + ", LastName='" + this.lastName + "', FirstName='" + this.firstName + "', Pobat_Name='" + this.pobatName + "', Address='" + this.address + "', Phone='" + this.phone + "', Aver_Score=" + this.averscore + "}";
    }
}
