package com.GEECTECH;

public class Birds extends Animals {
    private int airspeed;
    private Color color;
    private Habitat habitat;

    public Birds(String name, int age, int airspeed, Color color, Habitat habitat) {
        super(name, age);
        this.airspeed = airspeed;
        this.habitat = habitat;
        this.color = color;
    }
    public Birds(String name, int age, int airspeed) {
    }
    public Habitat getHabitat() {
        return habitat;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
    public int getAirspeed() {
        return airspeed;
    }
    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }
    public void makeVoice(int number, String voice) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }
    public final void makeVoice(String voice) {
        System.out.println(voice);
    }
    public String getInfo() {
        return "Name " + getName() + "\nColor " + color + "\nAge "
                + getAge() + "\nAirspeed " + getAirspeed() + " km/h"
                + "\nHabitat Place " + habitat.getPlace();
    }

}
