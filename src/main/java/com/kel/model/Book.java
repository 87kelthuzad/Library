package com.kel.model;

public class Book{
    private String title;
    private String subtitles;
    private String NameAuthor;
    private String SurnameAuthor;
    private TypeBook typeBook;
    private Language language;
    private String publisher;
    private int yearPublished;
    private boolean available = true;

    public Book(String title, String subtitles, String nameAuthor, String surnameAuthor, TypeBook typeBook, Language language, String publisher, int yearPublished, boolean available) {
        this.title = title;
        this.subtitles = subtitles;
        NameAuthor = nameAuthor;
        SurnameAuthor = surnameAuthor;
        this.typeBook = typeBook;
        this.language = language;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(String subtitles) {
        this.subtitles = subtitles;
    }

    public String getNameAuthor() {
        return NameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        NameAuthor = nameAuthor;
    }

    public String getSurnameAuthor() {
        return SurnameAuthor;
    }

    public void setSurnameAuthor(String surnameAuthor) {
        SurnameAuthor = surnameAuthor;
    }

    public TypeBook getTypeBook() {
        return typeBook;
    }

    public void setTypeBook(TypeBook typeBook) {
        this.typeBook = typeBook;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", subtitles='" + subtitles + '\'' +
                ", NameAuthor='" + NameAuthor + '\'' +
                ", SurnameAuthor='" + SurnameAuthor + '\'' +
                ", typeBook=" + typeBook +
                ", language=" + language +
                ", publisher='" + publisher + '\'' +
                ", yearPublished=" + yearPublished +
                ", available=" + available +
                '}';
    }
}