package fr.western.tp;

public class Barman extends Human {

    private String barName;

    public Barman(String name) {
        super(name, "vin");
        this.barName = "Chez " + name;
    }

    public Barman(String name, String barName) {
        super(name, "vin");
        this.barName = barName;
    }

    @Override
    public void say(String speaking) {
        super.say(speaking + " coco.");
    }

    @Override
    public void introduce() {
        super.introduce();
        say("Je suis le gérant du bar " + this.barName);
    }
}
