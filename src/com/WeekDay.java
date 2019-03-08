package com;

public enum WeekDay {
    Mon("Moday"),
    Tue("Tuesday"),
    Wed("wednesday"),
    Thu("Thursday"),
    Fri("Friday"),
    Sat("Saturday"),
    Sun("Sunday");

    private final String day;

    private WeekDay(String day){
        this.day = day;
    }
    public String getDay(){
        return day;
    }
}
