package fr.western.tp;

public class Lady extends Human {
    private String dressColor;
    private Boolean free;

    public Lady(String name, String dressColor) {
        super(name, "lait");
        this.dressColor = dressColor;
        this.free = true;
    }

    @Override
    public String getName() {
        return "Miss " + super.getName();
    }

    @Override
    public void introduce() {
        super.introduce();
        say("Je porte une robe de couleur " + this.dressColor);
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
