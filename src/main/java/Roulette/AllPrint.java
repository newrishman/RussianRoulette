package Roulette;

class AllPrint {
    protected void all(int a) {
        AllText allText = new AllText();

        String x;
        String y;

        if (a == 1) {
            x = allText.introduction();
        } else if (a == 2) {
            x = allText.choice();
        } else if (a == 3) {
            x = allText.quantity();
        } else if (a == 4) {
            x = allText.start();
        } else if (a == 5) {
            x = allText.drum();
        } else if (a == 6) {
            y = "Игрок 1";
            x = y + allText.user();
        } else if (a == 7) {
            y = "Игрок 2";
            x = y + allText.user();
        } else if (a == 8) {
            y = "Игрок";
            x = y + allText.user();
        } else if (a == 9) {
            x = allText.nothing();
        } else if (a == 10) {
            x = allText.death();
        } else {
            x = allText.error();
        }

        System.out.println(x);
    }
}