package com.kel.model;

public enum Language {
    ALB ("albański"),
    ENG ("angielski"),
    BEL ("białoruski"),
    BUL ("bułgarski"),
    CHI ("chiński"),
    SCR ("chorwacki"),
    CZE ("czeski"),
    DAN ("duński"),
    EPO ("esperanto"),
    EST ("estoński"),
    FIN ("fiński"),
    FRE ("francuski"),
    GRE ("grecki"),
    HEB ("hebrajski"),
    SPA ("hiszpański"),
    DUT ("holenderski"),
    ICE ("islandzki"),
    JPN ("japoński"),
    KOR ("koreański"),
    LIT ("litewski"),
    LAV ("łotewski"),
    MAC ("macedoński"),
    GER ("niemiecki"),
    NOR ("norweski"),
    POL ("polski"),
    POR ("portugalski"),
    RUS ("rosyjski"),
    RUM ("rumuński"),
    SCC ("serbski"),
    SLO ("słowacki"),
    SLV ("słoweński"),
    SWE ("szwedzki"),
    TUR ("turecki"),
    UKR ("ukraiński"),
    HUN ("węgierski"),
    ITA ("włoski");

    private String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public static Language fromValue(String language) {
        for (Language l: values()) {
            if (l.getLanguage().equals(language)) {
                return l;
            }
        }
        return null;
    }
}