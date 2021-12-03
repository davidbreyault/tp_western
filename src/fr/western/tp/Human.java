package fr.western.tp;

public class Human {

    private String name;
    private String beverage;

    public Human(String name) {
        this.name = name;
        this.beverage = "eau";
    }

    public Human(String name, String beverage) {
        this.name = name;
        this.beverage = beverage;
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
        this.say("Je m'appelle " + this.name + ", ma boisson préféré c'est le " + this.beverage);
    }

    public void drink() {
        System.out.println("Ah ! Un bon verre de " + this.beverage + " ! GLOUPS !");
    }
}

