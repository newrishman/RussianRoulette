package Roulette;

import java.io.*;

class AllRegulations {
    protected static int choice() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(reader.readLine());
        if (choice > 0 && choice <= 2) {
            return choice;
        } else {
            return 0;
        }
    }

    protected static int quantity() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(reader.readLine());
        if (quantity > 0 && quantity <= 3) {
            return quantity;
        } else {
            return 0;
        }
    }

}