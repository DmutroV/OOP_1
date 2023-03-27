package Lab2.Main;

import Lab2.Classes.Abiturient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private Abiturient[] abiturients;

    public static void main(String[] args) {
        Main prog = new Main();
        prog.printAll();
        prog.filterByName();
        prog.filterByAverageScore();
        prog.filterNAbiturientsByMaxAverageScore();
    }
    public Main() {
        this.abiturients = new Abiturient[10];
        this.abiturients[0] = new Abiturient("Войтюк", "Валентин", "Андрійович", "м. Тернопіль, вул. Чернівецька, 9/40", "+380971643707", 3.5);
        this.abiturients[1] = new Abiturient("Мінько", "Влад", "Ярославович", "м. Тернопіль, вул. Дружби, 2/04", "+380685872047", 3.0);
        this.abiturients[2] = new Abiturient("Бінич", "Дмитро", "Іванович", "м. Тернопіль, вул. Лучаківського, 23/58", "+380634520276", 3.7);
        this.abiturients[3] = new Abiturient("Іваненко", "Дмитро", "Олегович", "м. Тернопіль, вул. Курбаса, 3/16", "+3806673108942", 4.7);
        this.abiturients[4] = new Abiturient("Галунка", "Валентин", "Дмитрович", "м. Тернопіль, вул. Київська,17/14", "+380685872047", 4.6);
        this.abiturients[5] = new Abiturient("Войтович", "Дмитро", "Сергійович", "м. Тернопіль, вул. Тарнавського, 10/34", "+380971643707", 4.3);
        this.abiturients[6] = new Abiturient("Діордіца", "Оля", "Михайлович", "м. Тернопіль, вул. Злуки, 16/12", "+380634520276", 5.0);
        this.abiturients[7] = new Abiturient("Петлюра", "Влад", "Романович", "м. Тернопіль, вул. Текстильна, 6/76", "+3806673108942", 4.5);
        this.abiturients[8] = new Abiturient("Бунько", "Олег", "Русланович", "м. Тернопіль, вул. Будного 12/45", "+380685872047", 3.7);
        this.abiturients[9] = new Abiturient("Федишин", "Олег", "Степанович", "м. Тернопіль, вул. Руська 5/97", "+380971643707", 4.2);
    }
    public Main(int size) {
        this.abiturients = new Abiturient[size];
        for(int i = 0; i < size; ++i) {
            this.abiturients[i] = new Abiturient();
        }    }
    public void printAll() {
        Abiturient[] var1 = this.abiturients;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Abiturient item = var1[var3];
            System.out.println(item.toString());
        }    }
    public void filterByName() {
        System.out.println("Введіть ім'я для сортування:");
        Scanner scan = new Scanner(System.in);
        this.filterByName(scan.nextLine());
    }
    public void filterByName(String name) {
        Abiturient[] var2 = this.abiturients;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Abiturient item = var2[var4];
            if (item.getFirstName().equalsIgnoreCase(name)) {
                System.out.println(item.toString());
            }
        }
    }
    public void filterByAverageScore() {
        System.out.println("Введіть середній бал вище заданого для сортування: ");
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();
        scan.nextLine();
        this.filterByAverageScore(score);
    }
    public void filterByAverageScore(double score) {
        Abiturient[] var3 = this.abiturients;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Abiturient item = var3[var5];
            if (item.getAverageScore() > score) {
                System.out.println(item.toString());
            }
        }
    }
    public void filterNAbiturientsByMaxAverageScore() {
        System.out.println("Введіть число найкращих студентів: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        this.filterNAbiturientsByMaxAverageScore(number);
    }
    public void filterNAbiturientsByMaxAverageScore(int number) {
        Abiturient[] sortedAbiturients = (Abiturient[])Arrays.copyOf(this.abiturients, this.abiturients.length);
        Arrays.sort(sortedAbiturients, new SortByAverageScore());

        for(int i = 0; i < number; ++i) {
            System.out.println(sortedAbiturients[i].toString());
        }
    }
}
class SortByAverageScore implements Comparator<Abiturient> {
    SortByAverageScore() {
    }
   public int compare(Abiturient a, Abiturient b) {
        if (a.getAverageScore() > b.getAverageScore()) {
            return -1;
        } else {
            return a.getAverageScore() == b.getAverageScore() ? 0 : 1;
        }
    }
}