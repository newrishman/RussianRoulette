package Roulette;

class AllPrint {
    protected static void all(int a) {

        String x;
        String y;

        if (a == 1) {
            x = AllText.introduction();
        } else if (a == 2) {
            x = AllText.choice();
        } else if (a == 3) {
            x = AllText.quantity();
        } else if (a == 4) {
            x = AllText.start();
        } else if (a == 5) {
            x = AllText.drum();
        } else if (a == 6) {
            y = "Игрок 1";
            x = y + AllText.user();
        } else if (a == 7) {
            y = "Игрок 2";
            x = y + AllText.user();
        } else if (a == 8) {
            y = "Игрок";
            x = y + AllText.user();
        } else if (a == 9) {
            x = AllText.nothing();
        } else if (a == 10) {
            x = AllText.death();
        } else if (a == 11) {
            x = AllText.end();
        } else {
            x = AllText.error();
        }

        System.out.println(x);
    }
}