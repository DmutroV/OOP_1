package Lab2.Classes;

import java.util.Scanner;

public class Abiturient {
    private static int nextID = 0;
    private int id = getNextID();
    private String LastName;
    private String FirstName;
    private String Pobat_Name;
    private String Address;
    private String Phone;
    private double Aver_Score;
    public Abiturient() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введіть дані абітурієнта: \nпрізвище: ");
        this.LastName = scn.nextLine();
        System.out.print("ім'я: ");
        this.FirstName = scn.nextLine();
        System.out.print("по батькові: ");
        this.Pobat_Name = scn.nextLine();
        System.out.print("адреса проживання: ");
        this.Address = scn.nextLine();
        System.out.print("номер телефону: ");
        this.Phone = scn.nextLine();
        System.out.print("середній бал: ");
        this.Aver_Score = scn.nextDouble();
        scn.nextLine();
    }
    public Abiturient(String lastName, String firstName, String patronymic, String address, String phone, double averageScore) {
        this.LastName = lastName;
        this.FirstName = firstName;
        this.Pobat_Name = patronymic;
        this.Address = address;
        this.Phone = phone;
        this.Aver_Score = averageScore;
    }
    public static int getNextID() {
        return nextID++;
    }

    public int getId() {
        return this.id;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLName(String LName) {
        this.LastName = LName;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFname(String Fname) {
        this.FirstName = Fname;
    }

    public String getPatronymic() {
        return this.Pobat_Name;
    }

    public void setPname(String Pname) {
        this.Pobat_Name = Pname;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddr(String Addr) {
        this.Address = Addr;
    }

    public String getPhone() {
        return this.Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public double getAverageScore() {
        return this.Aver_Score;
    }

    public void setAver_Score(double Aver_Score) {
        this.Aver_Score = Aver_Score;
    }

    public String toString() {
        return "Abiturient{id=" + this.id + ", LastName='" + this.LastName + "', FirstName='" + this.FirstName + "', Pobat_Name='" + this.Pobat_Name + "', Address='" + this.Address + "', Phone='" + this.Phone + "', Aver_Score=" + this.Aver_Score + "}";
    }
}
