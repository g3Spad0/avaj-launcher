package ru.avaj.sjamie.transport;

import ru.avaj.sjamie.exceptions.AvajLauncherException;

public class AircraftFactory {
    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) {

        if (longitude <= 0 || latitude <= 0 || height <= 0) {
            throw new AvajLauncherException("Coordinates must be positive numbers");
        }
        Coordinates coordinates = new Coordinates(longitude, latitude, height);

        switch (type.toLowerCase()) {
            case "baloon":
                return new Baloon(name, coordinates);
            case "jetplane":
                return new JetPlane(name, coordinates);
            case "helicopter":
                return new Helicopter(name, coordinates);
            default:
                throw new AvajLauncherException("Aicraft type \"" + type + "\" is invalid");
        }
    }
}
