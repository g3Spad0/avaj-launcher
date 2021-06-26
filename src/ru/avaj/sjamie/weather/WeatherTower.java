package ru.avaj.sjamie.weather;

import ru.avaj.sjamie.transport.Coordinates;

public class WeatherTower extends Tower {

    public String getWeather(Coordinates coordinates) {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    public void changeWeather() {
        conditionChanged();
    }
}
