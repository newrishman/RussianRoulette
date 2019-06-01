package Roulette;

import java.io.*;

public class SuperSeriouslyClass {

    public int getA() throws IOException {

        AllRegulations allRegulations = new AllRegulations();
        AllPrint allPrint = new AllPrint(System.out, new AllText());

        allPrint.all(1);
        allPrint.all(2);

        int a = allRegulations.choice(allRegulations.getChoice());
        return a;
    }

    public int getB() throws IOException {

        AllRegulations allRegulations = new AllRegulations();
        AllPrint allPrint = new AllPrint(System.out, new AllText());

        allPrint.all(3);

        int b = allRegulations.choice(allRegulations.getQuantity());
        return b;
    }

    public void start(int a, int b) throws IOException {

        Classic classic = new Classic();
        Again again = new Again();

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
