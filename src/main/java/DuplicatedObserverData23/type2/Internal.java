package main.java.DuplicatedObserverData23.type2;

import java.util.Observable;

public class Internal extends Observable {
    private String end = "0";

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
        setChanged();
        notifyObservers();
    }
}
