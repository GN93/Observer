package com.gn93.Notifications;

import com.gn93.Forecasts.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
