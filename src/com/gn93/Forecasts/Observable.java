package com.gn93.Forecasts;

import com.gn93.Notifications.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers ();

}
