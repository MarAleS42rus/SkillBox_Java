package ru.skillbox;

public class Keyboard {
    final String type;
    final boolean light;
    final double weight;

    public Keyboard(String type, boolean light, double weight) {
        this.type = type;
        this.light = light;
        this.weight = weight;
    }

    public String toString() {
        return "Keyboard { " +
                "type = " + type +
                ", light = " + light +
                ", weight = " + weight + " g" +
                '}';
    }
}
