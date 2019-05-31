package Roulette;

import java.io.*;

class UserBang {


    public String getStart() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = reader.readLine();
        return start;
    }

    public String getBang() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String bang = reader.readLine();
        return bang;
    }

    protected int start(String start) {
        AllPrint allPrint = new AllPrint(System.out, new AllText());

        if (start.equals("   ")) {
            return 1;
        } else {
            allPrint.all(12);
            return 0;
        }
    }

    protected int bang(String bang) {
        AllPrint allPrint = new AllPrint(System.out, new AllText());

        if (bang.equals("")) {
            return 1;
        } else {
            allPrint.all(12);
            return 0;
        }
    }
}