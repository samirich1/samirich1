import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int day = scanner1.nextInt();
        if (day < 0) {
            System.out.println("Некоректное число");
        }
        if (day <= 31) {
            System.out.println("January");
        } else if (day <= 59) {
            System.out.println("February");
        } else if (day <= 90) {
            System.out.println("March");
        } else if (day <= 120) {
            System.out.println("April");
        } else if (day <= 151) {
            System.out.println("May");
        } else if (day <= 181) {
            System.out.println("June");
        } else if (day <= 212) {
            System.out.println("July");
        } else if (day <= 243) {
            System.out.println("August");
        } else if (day <= 273) {
            System.out.println("September");
        } else if (day <= 304) {
            System.out.println("October");
        } else if (day <= 334) {
            System.out.println("November");
        } else if (day <= 365) {
            System.out.println("December");
        }
        }
    }

