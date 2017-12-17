package com.kel.model;

public enum TypeBook {
    SCIENCE_FICTION_FANTASY ("Science_fiction_Fantasy"),
    THRILLER ("Thriller"),
    COMEDY ("Comedy"),
    SCIENCE ("Science"),
    BIOGRAPHY ("Biography"),
    BUSINESS_FINANCE_LAW("Business_Finance_Law"),
    CHILDREN ("Children"),
    COMICS ("Comics"),
    COMPUTING_INTERNET ("Computing_Internet"),
    CRIME ("Crime"),
    EDUCATION("Education"),
    FOOD_DRINK("Food_Drink"),
    HEALTH_FAMILY_LIFESTYLE ("Health_Family_Lifestyle"),
    HISTORY ("History"),
    HOME_GARDEN("Home_Garden"),
    LANGUAGES ("Languages"),
    MIND_BODY_SPIRIT ("Mind_Body_Spirit"),
    MUSIC_STAGE_SCREEN ("Music_Stage_Screen"),
    POETRY_DRAMA_CRITICISM ("Poetry_Drama_Criticism"),
    REFERENCE ("Reference"),
    RELIGION_SPIRITUALITY ("Religion_Spirituality"),
    ROMANCE ("Romance"),
    SCHOOL_BOOKS ("School_Books"),
    SOCIETY_POLITICS_PHILOSOPHY ("Society_Politics_Philosophy"),
    SPORTS_HOBBIES_GAMES("Sports_Hobbies_Games"),
    TRAVEL_HOLIDAY("Travel_Holiday"),
    YOUNG_ADULT("Young_Adult");


    private String type;

    private TypeBook(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static TypeBook fromValue(String type) {
        for (TypeBook typeBook : values()) {
            if (typeBook.getType().equals(type)) {
                return typeBook;
            }
        }
        return null;
    }
}