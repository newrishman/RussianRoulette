package Roulette;

import java.io.*;

class AllRegulations {

    public int getChoice() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(reader.readLine());
        return choice;
    }

    public int getQuantity() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(reader.readLine());
        return quantity;
    }

    protected int choice(int choice) {
        AllPrint allPrint = new AllPrint(System.out, new AllText());

        if (choice > 0 && choice <= 2) {
            return choice;
        } else {
            allPrint.all(12);
            return 0;
        }
    }

    protected int quantity(int quantity) {
        AllPrint allPrint = new AllPrint(System.out, new AllText());

        if (quantity > 0 && quantity <= 2) {
            return quantity;
        } else {
            allPrint.all(12);
            return 0;
        }
    }

}