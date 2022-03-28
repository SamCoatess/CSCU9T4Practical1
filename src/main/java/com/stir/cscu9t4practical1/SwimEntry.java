package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry {
    private String where;

    public SwimEntry(String name, int day, int month, int year, int hours, int minutes, int seconds, float distance, String where) {
        super(name, day, month, year, hours, minutes, seconds, distance);
        this.where = where;
    }

    //getters and setters

    public String getWhere() {
        return where;
    }

    public String getEntry () {
        String result = getName()+" swam " + getDistance() + " km " + getWhere() + " in "
                +getHour()+":"+getMin()+":"+ getSec() + " on " +
                +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
        return result;
    }
}
