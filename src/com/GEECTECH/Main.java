package com.GEECTECH;

public class Main {
    public static void main(String[] args) {
        Habitat nature = new Habitat("Forest");
        Habitat home = new Habitat("birdcage");
        Habitat home1 = new Habitat("hencoop");
        Birds vulture = new Birds("Milvus", 10, 300, Color.BLACK, nature);
        System.out.println(vulture.getInfo());
        vulture.makeVoice("кхчияя");
        System.out.println("________");
        Poultry parrot = new Poultry("Boatswain", 8, 90, Color.BLUE, home, "Macaw");
        System.out.println(parrot.getInfo());
        parrot.makeVoice(2, "chiirrrk");
        System.out.println("________");
        Poultry hen = new Poultry("Ryzhinka", 3, 10, Color.RED, home1, "Brama");
        System.out.println(hen.getInfo());
        hen.makeVoice("ку ке ре ку", 2);
    }

}
