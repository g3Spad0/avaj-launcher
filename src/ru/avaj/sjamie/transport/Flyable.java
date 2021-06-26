package ru.avaj.sjamie.transport;

import ru.avaj.sjamie.weather.WeatherTower;

public interface Flyable {
    void updateConditions();
    void registerTower(WeatherTower weatherTower);
}
