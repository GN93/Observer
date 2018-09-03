package com.gn93.Notifications;

import com.gn93.Forecasts.WeatherForecast;

public class TvNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature()+
                "stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa\n");
    }
}
