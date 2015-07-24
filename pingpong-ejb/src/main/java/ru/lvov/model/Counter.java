package ru.lvov.model;

import javax.persistence.*;

@Entity
public class Counter {
    @Id
    private int id;
    private int value = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void inc(){
        value++;
    }
}
