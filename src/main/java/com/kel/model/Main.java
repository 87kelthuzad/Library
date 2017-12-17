package com.kel.model;

import com.kel.tool.File;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        File file = new File();
        String nameFile = "./allBooks.csv";
        String nameFile2 = "./allUser.csv";
        Set<Book> listAllBook = new HashSet<Book>();
        Set<User> listAllUser = new HashSet<User>();
        listAllBook.add(new Book(   "Lord of the rings" ,
                "null" ,
                "J.R.R",
                "Tolkien" ,
                TypeBook.SCIENCE_FICTION_FANTASY ,
                Language.ENG ,
                "Sowa" ,
                2001 ,
                true));
        listAllBook.add(new Book(   "Lód" ,
                "null",
                "Jacek" ,
                "Dukaj" ,
                TypeBook.SCIENCE_FICTION_FANTASY ,
                Language.POL ,
                "PWN" ,
                2001,
                true));
        listAllBook.add(new Book(   "Wiedźmin" ,
                "Krew i Wino" ,
                "Andrzej",
                "Sapkowski",
                TypeBook.SCIENCE_FICTION_FANTASY ,
                Language.POL ,
                "Sowa",
                2001,
                true));

        listAllUser.add(new User(1,"Mateusz","Andrzejczak" , Sex.MALE));
        listAllUser.add(new User(2,"Kamil","Nowak" , Sex.MALE));
        listAllUser.add(new User(3,"Ola","Brzoza" , Sex.FEMALE));

        file.saveBookToFile(nameFile , listAllBook );
        Set<Book> allBook  = file.loadBookToList(nameFile);

        file.savaUserToFile(nameFile2 , listAllUser);
        Set<User> allUser = file.loadUserToList(nameFile2);

        for (Book b: allBook) {
            System.out.println(b);
        }

        for (User user : allUser) {
            System.out.println(user);
        }


    }
}