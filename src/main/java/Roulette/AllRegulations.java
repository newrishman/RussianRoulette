package Roulette;

import java.io.*;

class AllRegulations {
    protected int choice() throws IOException {
        AllPrint allPrint = new AllPrint(System.out, new AllText());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(reader.readLine());
        if (choice > 0 && choice <= 2) {
            return choice;
        } else {
            allPrint.all(12);
            return 0;
        }
    }

    protected int quantity() throws IOException {
        AllPrint allPrint = new AllPrint(System.out, new AllText());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(reader.readLine());
        if (quantity > 0 && quantity <= 2) {
            return quantity;
        } else {
            allPrint.all(12);
            return 0;
        }
    }

}