package com.GEECTECH;

public final class Poultry extends Birds{
    private  String type;
    public Poultry(String name, int age, int airspeed,Color color,Habitat habitat, String  type) {
        super(name, age, airspeed,color,habitat);
        this.type = type;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "\nType: " + type;
    }
}
