package lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть рядок тексту:");
        String string = scan.nextLine();
        System.out.println("Введіть рядок, який буде використовуватись для заміни: ");
        String repString = scan.nextLine();
        System.out.print("Введіть довжину слів, які потрібно замінити: ");
        int k = scan.nextInt();
        scan.nextLine();
        MyStringChanger myList = new MyStringChanger(string, repString, k);
        System.out.println("Вихідний рядок:" + string);
        System.out.println("Змінений рядок:" + myList.getOutString());
    }
}
