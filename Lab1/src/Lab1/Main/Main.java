package Lab1.Main;

import AbitClass.abiturient;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private abiturient[] abiturients;

    public static void main(String[] args) {
        Main prog = new Main();
        prog.printAll();
        prog.filterByName();
        prog.filterByAverageScore();
        prog.filterNAbiturientsByMaxAverageScore();
    }

    public Main() {
        this.abiturients = new abiturient[10];
        this.abiturients[0] = new abiturient("Войтюк", "Валентин", "Андрійович", "м. Тернопіль, вул. Чернівецька, 9/40", "+380971643707", 3.5);
        this.abiturients[1] = new abiturient("Мінько", "Влад", "Ярославович", "м. Тернопіль, вул. Дружби, 2/04", "+380685872047", 3.0);
        this.abiturients[2] = new abiturient("Бінич", "Дмитро", "Іванович", "м. Тернопіль, вул. Лучаківського, 23/58", "+380634520276", 3.7);
        this.abiturients[3] = new abiturient("Іваненко", "Дмитро", "Олегович", "м. Тернопіль, вул. Курбаса, 3/16", "+3806673108942", 4.7);
        this.abiturients[4] = new abiturient("Галунка", "Валентин", "Дмитрович", "м. Тернопіль, вул. Київська,17/14", "+380685872047", 4.6);
        this.abiturients[5] = new abiturient("Войтович", "Дмитро", "Сергійович", "м. Тернопіль, вул. Тарнавського, 10/34", "+380971643707", 4.3);
        this.abiturients[6] = new abiturient("Діордіца", "Оля", "Михайлович", "м. Тернопіль, вул. Злуки, 16/12", "+380634520276", 5.0);
        this.abiturients[7] = new abiturient("Петлюра", "Влад", "Романович", "м. Тернопіль, вул. Текстильна, 6/76", "+3806673108942", 4.5);
        this.abiturients[8] = new abiturient("Бунько", "Олег", "Русланович", "м. Тернопіль, вул. Будного 12/45", "+380685872047", 3.7);
        this.abiturients[9] = new abiturient("Федишин", "Олег", "Степанович", "м. Тернопіль, вул. Руська 5/97", "+380971643707", 4.2);
    }

    public Main(int size) {
        this.abiturients = new abiturient[size];

        for (int i = 0; i < size; ++i) {
            this.abiturients[i] = new abiturient();
        }

    }

//    public void printAll() {
//        abiturient[] var1 = this.abiturients;
//        int var2 = var1.length;
//
//        for (int var3 = 0; var3 < var2; ++var3) {
//            abiturient item = var1[var3];
//            System.out.println(item.toString());
//        }
//
//    }

    public void printAll() {
        for (int i = 0; i < abiturients.length; ++i){
            System.out.println(abiturients[i]);
        }

    }

    public void filterByName() {
        System.out.println("Введіть ім'я для сортування:");
        Scanner scan = new Scanner(System.in);
        this.filterByName(scan.nextLine());
    }

    public void filterByName(String name) {
        abiturient[] var2 = this.abiturients;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            abiturient item = var2[var4];
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
        abiturient[] var3 = this.abiturients;
        int var4 = var3.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            abiturient item = var3[var5];
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
        abiturient[] sortedAbiturients = (abiturient[]) Arrays.copyOf(this.abiturients, this.abiturients.length);
        Arrays.sort(sortedAbiturients, new SortByAverageScore());

        for (int i = 0; i < number; ++i) {
            System.out.println(sortedAbiturients[i].toString());
        }

    }

    class SortByAverageScore implements Comparator<abiturient> {
        SortByAverageScore() {
        }

        public int compare(abiturient a, abiturient b) {
            if (a.getAverageScore() > b.getAverageScore()) {
                return -1;
            } else {
                return a.getAverageScore() == b.getAverageScore() ? 0 : 1;
            }
        }
    }
}
