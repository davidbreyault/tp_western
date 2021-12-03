package fr.western.tp;

public class Story {
    public static void main(String[] args) {

        Lady janine = new Lady("Janine", "bleue");
        Bandit mesrine = new Bandit("Jacques");
        Cowboy luc = new Cowboy("Luc");
        Barman boris = new Barman("Boris");

        Human[] caracters = new Human[4];
        caracters[0] = janine;
        caracters[1] = mesrine;
        caracters[2] = luc;
        caracters[3] = boris;

        for (int i = 0; i < caracters.length; i++) {
            caracters[i].introduce();
        }

//        janine.changeDress("Blanche");
//        mesrine.kidnap(janine);
//        janine.getKidnap();
//        luc.shoot(mesrine);
//        luc.release(janine);
    }
}
