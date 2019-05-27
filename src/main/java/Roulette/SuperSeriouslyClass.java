package Roulette;

import java.io.*;

public class SuperSeriouslyClass {

    public void start() throws IOException {
        AllPrint allPrint = new AllPrint();
        AllRegulations allRegulations = new AllRegulations();
        Classic classic = new Classic();
        Again again = new Again();
        allPrint.all(1);
        allPrint.all(2);
        int a = allRegulations.choice();
        allPrint.all(3);
        int b = allRegulations.quantity();

        if (a == 1 && b == 1) {
            classic.singlePlayer();

        } else if (a == 1 && b == 2) {
            classic.classic();

        } else if (a == 2 && b == 1) {
            again.singlePlayer();

        } else {
            again.classic();

        }
    }
}
