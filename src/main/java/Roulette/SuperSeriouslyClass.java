package Roulette;

import java.io.*;

public class SuperSeriouslyClass {

    public static void start() throws IOException {

        AllPrint.all(1);
        AllPrint.all(2);
        int a = AllRegulations.choice();
        AllPrint.all(3);
        int b = AllRegulations.quantity();

        if (a == 1 && b == 1) {
            Classic.singlePlayer();

        } else if (a == 1 && b == 2) {
            Classic.classic();

        } else if (a == 2 && b == 1) {
            Again.singlePlayer();

        } else {
            Again.classic();

        }
    }
}
