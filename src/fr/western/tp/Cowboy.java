package fr.western.tp;

public class Cowboy extends Human {

    private int popularity;
    private String setting;

    public Cowboy(String name) {
        super(name, "whisky");
        this.popularity = 0;
        this.setting = "Vaillant";
    }

    public void shoot(Bandit bandit) {
        System.out.println("Le " + this.setting + " " + this.getName() + " tire sur " + bandit.getName() + ". PAN !");
        say("Prends ça, rascal !");
        bandit.getImprisoned(this);
    }

    public void release(Lady lady) {
        this.popularity++;
        lady.getReleased(this);
    }

}
