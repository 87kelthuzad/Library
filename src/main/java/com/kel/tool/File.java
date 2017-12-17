package com.kel.tool;

import com.kel.model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class File {

    BufferedReader bufferedReader = null;
    FileWriter fileWriter = null;

    private static final String HEADER_BOOK = "Title,Subtitle,NameAuthor,SurnameAuthor,TypeBook,Language,Publisher,YearPublished,availabe";
    private static final String HEADER_USER = "IdUser,name,surname,sex";
    private static final String COMMA_DELIMITER = "@";
    private static final String NEW_LINE_SEPARATOR = "\n";

    private Set<Book>          bookWithFile        = new HashSet<Book>();
    private Set<User>          userWithFile        = new HashSet<User>();
    private List<BookBorrow>    bookBorrowWithFile  = new ArrayList<BookBorrow>();

    public void loadFile(String nameFile) {
        try {
            bufferedReader = new BufferedReader(new FileReader(nameFile));
        } catch (FileNotFoundException e) {
            System.out.println("nie znaleziona pliku //");
        } catch (IOException e) {
            System.out.println("blad zapisu lub odczyt");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("pusty plik");
                }
            }
        }
    }

    public void saveBookToFile(String nameFile , Set<Book> listAllBooks) {
        loadFile(nameFile);
        try {
            fileWriter = new FileWriter(nameFile);
            fileWriter.append(HEADER_BOOK);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (Book book : listAllBooks) {
                fileWriter.append(book.getTitle());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(book.getSubtitles());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(book.getNameAuthor());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(book.getSurnameAuthor());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(book.getTypeBook().getType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(book.getLanguage().getLanguage());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(book.getPublisher());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(book.getYearPublished()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(book.isAvailable()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        } catch (IOException e) {
            System.out.println("blad zapisu book");
        } finally {
            try {
//                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("blad zamykania pliku book");
            }
        }
    }

    public Set<Book> loadBookToList(String nameFile) {

        String line = "";
        try {
            bufferedReader = new BufferedReader(new FileReader(nameFile));

            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                String[] stringsBook = line.split(COMMA_DELIMITER);
                if (stringsBook.length > 0) {
                    Book book = new Book(   stringsBook[0] ,
                            (stringsBook[1].equals("null") ? null : stringsBook[1])/*stringsBook[1]*/ ,
                            stringsBook[2] ,
                            stringsBook[3] ,
                            TypeBook.fromValue(stringsBook[4]) ,
                            Language.fromValue(stringsBook[5]) ,
                            stringsBook[6] ,
                            Integer.parseInt(stringsBook[7]) ,
                            Boolean.parseBoolean(stringsBook[8]) );
                    bookWithFile.add(book);
                }
            }
        } catch (Exception e) {
            System.out.println("blad odczytu book");
        } finally {
            try {
//                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("blad zamykania pliku book");
            }
        }
        return bookWithFile;
    }

    public void savaUserToFile(String nameFile , Set<User> listAllUsers){
        loadFile(nameFile);
        try {
            fileWriter = new FileWriter(nameFile);
            fileWriter.append(HEADER_USER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (User user: listAllUsers) {
                fileWriter.append(String.valueOf(user.getIdUser()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(user.getFirstName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(user.getLastName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(user.getSex().getSex());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        } catch (Exception e) {
            System.out.println("blad zapisu User");
        } finally {
            try {
//                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("blad zamykania pliku User");
            }
        }
    }

    public Set<User> loadUserToList(String nameFile) {

        String line = "";
        try {
            bufferedReader = new BufferedReader(new FileReader(nameFile));

            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                String[] stringsUser = line.split(COMMA_DELIMITER);
                if (stringsUser.length > 0) {
                    User user = new User(   Integer.parseInt(stringsUser[0]) ,
                            stringsUser[1] ,
                            stringsUser[2] ,
                            Sex.fromValues(stringsUser[3]));
                    userWithFile.add(user);
                }
            }
        } catch (Exception e) {
            System.out.println("blad odczytu User");
        } finally {
            try {
//                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("blad zamykania pliku User");
            }
        }
        return userWithFile;
    }

    public void savaBooksBorrowToFile(String nameFile , List<BookBorrow> listAllBookBorrow) {
        loadFile(nameFile);
        try {
            fileWriter = new FileWriter(nameFile);

            fileWriter.append(NEW_LINE_SEPARATOR);

            for (BookBorrow bookBoorrow: listAllBookBorrow) {
//                fileWriter.append(user.getFirstName());
                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(user.getLastName());
                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(user.getIdUser()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        } catch (Exception e) {
            System.out.println("blad zapisu");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("blad zamykania pliku");
            }
        }
    }

    public List<BookBorrow> loadBookBorrowToList(String nameFile) {

        String line = "";
        try {
            bufferedReader = new BufferedReader(new FileReader(nameFile));

            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                String[] stringsBookBorrow = line.split(COMMA_DELIMITER);
                if (stringsBookBorrow.length > 0) {
//                    BookBorrow bookBoorrow = new BookBorrow(stringsBookBorrow[0] , stringsBookBorrow[1] , Integer.parseInt(stringsBookBorrow[2]) );
//                    bookBoorrowWithFile.add(bookBorrow);
                }
            }
        } catch (Exception e) {
            System.out.println("blad odczytu");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("blad zamykania pliku");
            }
        }
        return bookBorrowWithFile;
    }
}