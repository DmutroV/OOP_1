package first;
import java.util.Scanner;


public class Student extends Abiturient {
    private String faculty;
    private int course;
    private String group;

    public Student(String lastName, String firstName, String patronymic, String address, String phone, double averageScore, String faculty, int course, String group, String _school) {
        super(lastName, firstName, patronymic, address, phone, averageScore, _school);
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return super.toString() + ", faculty='" + faculty + "', course=" + course + ", group='" + group + "'";
    }
}

