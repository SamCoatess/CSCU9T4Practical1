package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {

    private int repetitions;
    private int recovery;

    public SprintEntry(String name, int day, int month, int year, int hours, int minutes, int seconds, float distance, int repetitions, int recovery) {
        super(name, day, month, year, hours, minutes, seconds, distance);
        this.repetitions = repetitions;
        this.recovery = recovery;
    }

    //getter and setter methods

    public int getRepetitions() {
        return repetitions;
    }

    public int getRecovery() {
        return recovery;
    }

    //@override method from parent class Entry
    public String getEntry() {
        String result = getName() + " sprinted " + getRepetitions() + "x" + getDistance() + "m " + "in "
                + getHour() + ":" + getMin() + ":" + getSec() +
                " with " + getRecovery() + " minutes recovery on "
                + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
        return result;

    }
}
