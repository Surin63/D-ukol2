package com.engeto.rooms;

import java.time.LocalDate;

public class Guest {
    private String name;
    private LocalDate birthday;
    private boolean pracovni;


    public Guest(String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return
                "\n" + "Guest Name = " + name + " "
                 + birthday;
    }
}

