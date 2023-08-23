package ru.ugleva.spacesimulator._main;

import ru.ugleva.spacesimulator.model.Astronaut;
import ru.ugleva.spacesimulator.util.EventGenerator;

public class _Main {

    public static void main(String[] args) {
        Astronaut yura = new Astronaut();
        EventGenerator eg = new EventGenerator();
        eg.startAdventure(yura);
    }
}
