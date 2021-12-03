package fr.western.tp;

public class Human {

    private String name;
    private String beverage = "eau";

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getBeverage() {
        return this.beverage;
    }

    public void say(String speaking) {
        System.out.println(this.name + " - "  + speaking);
    }

    public void introduce() {
        System.out.println("Je m'appelle " + this.name + ", ma boisson préféré c'est : " + this.beverage);
    }

    public void drink() {
        System.out.println("Ah ! Un bon verre de " + this.beverage + " ! GLOUPS !");
    }
}

