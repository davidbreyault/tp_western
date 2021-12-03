package fr.western.tp;

public class Story {
    public static void main(String[] args) {

        Lady janine = new Lady("Janine", "bleue");
        Bandit mesrine = new Bandit("Mesrine");
        Cowboy luc = new Cowboy("Luc");
        Barman boris = new Barman("Boris");
        Sherif sullivan = new Sherif("Sullivan");
        Cowboy mervyn = new Sherif("Mervyn");

        Human[] caracters = new Human[6];
        caracters[0] = janine;
        caracters[1] = mesrine;
        caracters[2] = luc;
        caracters[3] = boris;
        caracters[4] = sullivan;
        caracters[5] = mervyn;

        for (int i = 0; i < caracters.length; i++) {
            caracters[i].introduce();
        }

//        janine.changeDress("Blanche");
//        mesrine.kidnap(janine);
//        janine.getKidnap();
//        luc.shoot(mesrine);
//        luc.release(janine);
        sullivan.wantedBandit(mesrine);
    }
}
