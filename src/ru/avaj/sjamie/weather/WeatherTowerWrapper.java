package ru.avaj.sjamie.weather;

public class WeatherTowerWrapper {
    private int iterations;
    private WeatherTower weatherTower;

    public WeatherTowerWrapper(int iterations, WeatherTower weatherTower) {
        this.iterations = iterations;
        this.weatherTower = weatherTower;
    }

    public int getIterations() {
        return iterations;
    }

    public WeatherTower getWeatherTower() {
        return weatherTower;
    }
}
