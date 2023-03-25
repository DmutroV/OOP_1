import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalTime;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        method_0();
    }
    public static void method_0(){
     double s,f,x = 0.335,y = 0.025;
     s = 1 + x + Math.pow(x,2)/2 + Math.pow(x,3)/6 + Math.pow(x,4)/24;
     f = x * (Math.sin(Math.pow(x, 3)) + (Math.pow(Math.cos(y), 2)));
     System.out.println("Результат x = " + x + "\n" +
                        "Результат x = " + y + "\n" +
                        "Результат s = " + s + "\n" +
                        "Результат f = " + f + "\n");
        method_1();
    }
    public static void method_1(){
        Date Time = new Date( );
        SimpleDateFormat time = new SimpleDateFormat ("hh:mm:ss");
        System.out.println( "Час у форматі гг:хх:сс" + "\n" + time.format(Time));
        /////////
       method_2();
    }
    public static void method_2() {
        Scanner num = new Scanner(System.in);
        double s, f, x, y;
        System.out.print("Введіть х: ");
        x = num.nextDouble();
        System.out.print("Введіть y: ");
        y = num.nextDouble();
        s = 1 + x + Math.pow(x, 2) / 2 + Math.pow(x, 3) / 6 + Math.pow(x, 4) / 24;
        f = x * (Math.sin(Math.pow(x, 3)) + (Math.pow(Math.cos(y), 2)));
        System.out.print("Результат x = " + x + "\n" +
                         "Результат y = " + y + "\n" +
                         "Результат s = " + s + "\n" +
                          "Результат f = " + f + "\n");
    }
}