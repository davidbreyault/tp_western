package fr.western.tp;

public class Bandit extends Human {

    private String look;
    private int numKidnapedLadies;
    private double reward;
    private Boolean inJail;

    public Bandit(String name) {
        super(name, "Tord-Boyaux");
        this.look = "méchant";
        this.numKidnapedLadies = 0;
        this.reward = 100;
        this.inJail = false;
    }

    @Override
    public String getName() {
        return super.getName() + " le " + this.look;
    }

    @Override
    public void introduce() {
        super.introduce();
        say("J'ai l'air " + this.look + " et j'ai déjà kidnappé " + this.numKidnapedLadies + " dames.");
        say("Ma tête est mise a prix à " + this.reward + "$");
    }

    public void getRewardAmount() {
        System.out.println("Le butin en cas de capture du brigand : " + this.reward);
    }

    public void kidnap(Lady lady) {
        this.numKidnapedLadies++;
        say("Ah ah ! " + lady.getName() + ", tu es mienne désormais !");
    }

    public void getImprisoned(Cowboy cowboy) {
        this.inJail = true;
        say("Damn ! Je suis fait ! " + cowboy.getName() + " tu m'as eu !");
    }

}
