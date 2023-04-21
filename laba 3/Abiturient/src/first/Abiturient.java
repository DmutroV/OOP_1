package first;
public class Abiturient extends Person {
    private static int nextID = 0;
    private int id = getNextID();
    private double averageScore;
    private String school;

    public Abiturient() {
        this("", "", "", "", "", 0.0,"");
    }

    public Abiturient(String lastName, String firstName, String patronymic, String address, String phone, double averageScore, String _school) {
        super(lastName, firstName, patronymic, address, phone);
        this.averageScore = averageScore;
        this.school = _school;
    }

    public static int getNextID() {
        return nextID++;
    }

    public int getId() {
        return this.id;
    }

    public double getAverageScore() {
        return this.averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String toString() {
        return "Abiturient{id=" + this.id + ", lastName='" + this.getLastName() + "', firstName='" + this.getFirstName() + "', patronymic='" + this.getPatronymic() + "', address='" + this.getAddress() + "', phone='" + this.getPhone() + "', averageScore=" + this.averageScore + "}";
    }
}


