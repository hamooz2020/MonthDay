package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int q, m, k, a, month;

        while (true) {

            System.out.println("\033[4;30m" + "find out who you are.");

            System.out.println("Type in the month you were born in.");
            m = keyboard.nextInt();

            System.out.println("Type in the day you were born in.");
            q = keyboard.nextInt();


            System.out.println("Type in the year you were born in." + "\033[0;96m");
            k = keyboard.nextInt();

            a = equation(m, q, k);
            month(m, k);
            answer(a);
            System.out.println(" ");
        }


    }

    private static void month(int dateM, int dateY) {

        switch (dateM) {
            case 1:
                System.out.println("You were born in January which has 31 days");
                break;
            case 2:
                if (dateY % 400 == 0) {
                    System.out.println("You were born in Febraury which has 29 days");
                } else if (dateY % 10 == 0) {
                    System.out.println("You were born in Febraury which has 28 days");
                } else if (dateY % 4 == 0) {
                    System.out.println("You were born in Febraury which has 29 days");
                } else {
                    System.out.println("You were born in Febraury which has 28 days");
                }
                    break;
                    case 3:
                        System.out.println("You were born in March which has 31 days");
                        break;
                    case 4:
                        System.out.println("You were born in April which has 30 days");
                        break;
                    case 5:
                        System.out.println("You were born in May which has 31 days");
                        break;
                    case 6:
                        System.out.println("You were born in June which has 3 days");
                        break;
                    case 7:
                        System.out.println("You were born in July which has 31 days");
                        break;
                    case 8:
                        System.out.println("You were born in August which has 31 days");
                        break;
                    case 9:
                        System.out.println("You were born in September which has 30 days");
                        break;
                    case 10:
                        System.out.println("You were born in October which has 31 days");
                        break;
                    case 11:
                        System.out.println("You were born in November which has 30 days");
                        break;
                    case 12:
                        System.out.println("You were born in December which has 31 days");
                        break;
                }
        }





    private static void nurseryRhyme(int poem) {
        switch (poem) {
            case 0:
                System.out.println("You work very hard.");
                break;
            case 1:
                System.out.println("You are wise and fair.");
                break;
            case 2:
                System.out.println("You're a cutie");
                break;
            case 3:
                System.out.println("You're a very happy person.");
                break;
            case 4:
                System.out.println("You're astonishing.");
                break;
            case 5:
                System.out.println("You are full of grace.");
                break;
            case 6:
                System.out.println("You are loving and graceful");
                break;
        }
    }
        //if month born is less than 2 than the year(K) will decrease by 1 and the month will be counted as previous year for example jan is 13 and feb is 14

    private static int equation(int m, int q, int k) {
        int j, modYear;
        int w;
        k = birthYear(k, m);
        if (m <= 2) {
        

        }

        m = birthMonth(m);

        modYear = (k % 100);

        j = (k / 100);

        w = (q + ((13 * (m + 1)) / 5)+modYear + (modYear / 4) + (j / 4) + 5 * j)%7;
        return w;
    }

    public static int birthMonth(int dateM) {
        if (dateM <= 2) {

        }
        return dateM;
    }

    public static int birthYear(int dateY, int dateM) {
        if (dateY % 4 == 0 || dateY%100 ==0 || dateY%400 ==0) {
            return 29;
        }else
        return 28;
    }

    public static void answer(int dateW) {
        switch (dateW) {
            case 0:
                System.out.println("You are Saturday");
                break;
            case 1:
                System.out.println("You are Sunday");
                break;
            case 2:
                System.out.println("You are Monday");
                break;
            case 3:
                System.out.println("You are Tuesday");
                break;
            case 4:
                System.out.println("You are Wednesday");
                break;
            case 5:
                System.out.println("You are Thursday");
                break;
            case 6:
                System.out.println("You are Friday");

        }


    }
}








