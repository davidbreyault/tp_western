package fr.western.tp;

public class Story {
    public static void main(String[] args) {

        Lady janine = new Lady("Janine", "blue");
        Bandit mesrine = new Bandit("Jacques");
        Cowboy luc = new Cowboy("Luc");

        Human[] caracters = new Human[3];
        caracters[0] = janine;
        caracters[1] = mesrine;
        caracters[2] = luc;

        for (int i = 0; i < caracters.length; i++) {
            caracters[i].introduce();
        }

        janine.changeDress("Blanche");
        mesrine.kidnap(janine);
        janine.getKidnap();
        luc.shoot(mesrine);
        luc.release(janine);
    }
}
