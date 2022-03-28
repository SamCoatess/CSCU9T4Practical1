package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {
    private String terrain;
    private String tempo;

    // creating constructor and adding tempo and terrain to CycleEntry object
    public CycleEntry(String name, int day, int month, int year, int hour, int minutes, int seconds, float distance, String terrain, String tempo) {
        super(name, day, month, year, hour, minutes, seconds, distance);
        this.terrain = terrain;
        this.tempo = tempo;
    }

// get and setter methods

    public String getTerrain(){
        return terrain;
    }

    public String getTempo(){
        return tempo;
    }


    //@override method from parent class Entry
    public String getEntry(){
        String result = getName()+" cycled " + getDistance() + " km "
                +"in " + getHour()+":"+getMin()+":"+ getSec() + " on "
                +getDay()+"/"+getMonth()+"/"+getYear()
                +" on " + terrain + " at " + tempo + " tempo"+"\n";
        return result;
    }



}
