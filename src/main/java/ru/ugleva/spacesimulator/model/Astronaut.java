package ru.ugleva.spacesimulator.model;

public class Astronaut {
    private int hp = 100;    // health points (очки здоровья, ОЗ)
    private int ep = 100;    // energy points (очки энергии, ОЭ)

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public int getEp() {
        return this.ep;
    }

}
