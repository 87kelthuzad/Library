package com.kel.gui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gui {

    public int showMenu() {
        int answer = 0;
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        System.out.println("1-Dodaj nowa ksiazke");
        System.out.println("2-Dodaj nowego urzytkownika");
        System.out.println("3-Wyswietl wszystkie ksiazki");
        System.out.println("4-Wyporzycz ksiazke");
        System.out.println("5-Oddaj ksiazke");
        System.out.println("6-Zamknij Aplikacje");
        do {
            flag = true;
            try {
                answer = in.nextInt();
            } catch (InputMismatchException e) {
                in.nextLine();
            }
            switch (answer) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                default:
                    System.out.println("bledna wartosc");
                    flag = false;

            }
        }while(flag == false);

        return answer;
    }

    public void addBook() {
        System.out.println("tak");
    }


}