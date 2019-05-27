package Roulette;

import java.io.*;

class UserBang {
    protected int start() throws IOException {
        AllPrint allPrint = new AllPrint();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = reader.readLine();
        if (start.equals("   ")) {
            return 1;
        } else {
            allPrint.all(12);
            return 0;
        }
    }

    protected int bang() throws IOException {
        AllPrint allPrint = new AllPrint();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String bang = reader.readLine();
        if (bang.equals("")) {
            return 1;
        } else {
            allPrint.all(12);
            return 0;
        }
    }
}