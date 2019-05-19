package Roulette;

import java.io.*;

class UserBang {
    protected static int start() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = reader.readLine();
        if (start.equals("   ")) {
            return 1;
        } else {
            return 0;
        }
    }

    protected static int bang() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String bang = reader.readLine();
        if (bang.equals("")) {
            return 1;
        } else {
            return 0;
        }
    }

}