package com.example.对象行为模式十一种.oberserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int state;
    private List<Oberserver> observers;

    public Subject() {
        this.state = 0;
        this.observers = new ArrayList<>();
    }
    /**
     * 状态更新的时候去通知所有观察者
     * */
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void addObserver(Oberserver observer) {
        observers.add(observer);
    }

    public void removeObserver(Oberserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Oberserver observer : observers) {
            observer.update(state);
        }
    }
}
