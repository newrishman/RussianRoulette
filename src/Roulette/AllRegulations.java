package Roulette;

import java.io.*;

class AllRegulations {
    protected static int choice() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(reader.readLine());
        if (choice > 0 && choice <= 2) {
            return choice;
        } else {
            AllPrint.all(12);
            return 0;
        }
    }

    protected static int quantity() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(reader.readLine());
        if (quantity > 0 && quantity <= 2) {
            return quantity;
        } else {
            AllPrint.all(12);
            return 0;
        }
    }

}