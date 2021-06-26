package ru.avaj.sjamie.weather;

import ru.avaj.sjamie.transport.Flyable;

import java.util.ArrayList;
import java.util.List;

public abstract class Tower {
    private List<Flyable> observers = new ArrayList<>();

    public void register(Flyable flyable) {
        observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
    }

    protected void conditionChanged() {
        int size = observers.size();
        for (int i = 0; i < size; i++) {
            observers.get(i).updateConditions();
            if (size != observers.size()) {
                size = observers.size();
                i--;
            }
        }
    }

    public Boolean observersIsEmpty() {
        return observers.isEmpty();
    }
}
