package com.kel.model;

public enum Sex {

    MALE("mezczyzna"), FEMALE("kobieta");

    private String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public static Sex fromValues(String sex) {
        for (Sex s: values()) {
            if(s.getSex().equals(sex)) {
                return s;
            }
        }
        return null;
    }
}