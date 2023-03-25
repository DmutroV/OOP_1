package Lab2.Classes;

import java.util.Scanner;

public class Abiturient {
    private static int nextID = 0;
    private int id;
    private String LastName;
    private String FirstName;
    private String Pobat_Name;
    private String Address;
    private String Phone;
    private double Aver_Score;

    public Abiturient(){
        id = getNextID();
        Scanner scn = new Scanner(System.in);
        System.out.print("Введіть дані абітурієнта: \nпрізвище: ");
        LastName = scn.nextLine();
        System.out.print("ім'я: ");
        FirstName = scn.nextLine();
        System.out.print("по батькові: ");
        Pobat_Name = scn.nextLine();
        System.out.print("адреса проживання: ");
        Address = scn.nextLine();
        System.out.print("номер телефону: ");
        Phone = scn.nextLine();
        System.out.print("середній бал: ");
        Aver_Score = scn.nextDouble();
        scn.nextLine();
    }
     public Abiturient(String lastName, String firstName, String patronymic, String address, String phone, double averageScore) {
        id = getNextID();
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
        return id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLName(String LName) {
        this.LastName = LName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFname(String Fname) {
        this.FirstName = Fname;
    }

    public String getPatronymic() {
        return Pobat_Name;
    }

    public void setPname(String Pname) {
        this.Pobat_Name = Pname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddr(String Addr) {
        this.Address = Addr;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public double getAverageScore() {
        return Aver_Score;
    }

    public void setAver_Score(double Aver_Score) {
        this.Aver_Score = Aver_Score;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Pobat_Name='" + Pobat_Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Aver_Score=" + Aver_Score +
                '}';
    }
}
