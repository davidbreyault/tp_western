package fr.western.tp;

public class Bandit extends Human {

    private String look;
    private int numKidnapedLadies;
    private double reward;
    private Boolean inJail;

    public Bandit(String name) {
        super(name);
        this.look = "méchant";
        this.numKidnapedLadies = 0;
        this.reward = 100;
        this.inJail = false;
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
