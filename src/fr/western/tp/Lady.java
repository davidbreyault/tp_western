package fr.western.tp;

public class Lady extends Human {
    private String dressColor;
    private Boolean free;

    public Lady(String name, String dressColor) {
        super(name);
        this.dressColor = dressColor;
        this.free = true;
    }

    public void getKidnap() {
        this.free = false;
        say("AAAAAAARRRRGH !");
    }

    public void getReleased(Cowboy cowboy) {
        this.free = true;
        say("Thank you " + cowboy.getName() + " !");
    }

    public void changeDress(String newColor) {
        this.dressColor = newColor;
        say("Hey ! Look at my new dress !");
    }
}
