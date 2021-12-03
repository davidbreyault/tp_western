package fr.western.tp;

public class Sherif extends Cowboy {

    private int numCaughtBandit;

    public Sherif(String name) {
        super("Sherif " + name);
        this.numCaughtBandit = 0;
    }

    @Override
    public void shoot(Bandit bandit) {
        super.shoot(bandit);
        say("Au nom de la loi, je vous arrête !");
        this.numCaughtBandit++;
    }

    @Override
    public void introduce() {
        super.introduce();
        String plural = this.numCaughtBandit <= 1 ? "" : "s";
        say("J'ai attrapé " + this.numCaughtBandit + " bandit" + plural + ".");
    }

    public void wantedBandit(Bandit bandit) {
        System.out.println("OYEZ OYEZ BRAVE GENS !! 200$ a qui arretera " + bandit.getName() + " le brigand mort ou vif !!");
    }
}
