import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalTime;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }
    private double x;
    private double y;
    private void run() {
        scanValues();
        double s = this.calculate_znach_S();
        double f = this.calculate_znach_F();
        this.print(s, f);
    }
    private double calculate_znach_S() {
        double S = 1 + x + Math.pow(x, 2) / 2 + Math.pow(x, 3) / 6 + Math.pow(x, 4) / 24;
        return S;
    }
    private double calculate_znach_F() {
        double F = x * (Math.sin(Math.pow(x, 3)) + Math.pow(Math.cos(y), 2));
        return F;
    }
    private void scanValues() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введіть значення x = ");
        x = scn.nextDouble();
        System.out.print("Введіть значення y = ");
        y = scn.nextDouble();
    }
    private void print(double s, double f) {
        System.out.printf("Результат обрахунку динамічного значення S  = %.2f%n", s);
        System.out.printf("Результат обрахунку динамічного значення F = %.2f%n", f);

        System.out.println("//*//*//*//*//*//*//");

        calculate_S_Y();
    }
    public static void calculate_S_Y() {
        double s, f, x1 = 0.335, y1 = 0.025;
        s = 1 + x1 + Math.pow(x1, 2) / 2 + Math.pow(x1, 3) / 6 + Math.pow(x1, 4) / 24;
        f = x1 * (Math.sin(Math.pow(x1, 3)) + (Math.pow(Math.cos(y1), 2)));
        System.out.println( "Результат обрахунку статичного знеачення S = " + s + "\n" +
                "Результат обрахунку статичного значення F = " + f + "\n");
        data_time_metod();
    }

    public static void data_time_metod() {
        Date Time = new Date();
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Час у форматі гг:хх:сс" + "\n" + time.format(Time));
    }
}

