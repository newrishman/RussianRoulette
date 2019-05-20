package Roulette;

import java.io.*;

public class Requlations1 {
    protected static void forOne() throws IOException {



        AllPrint.all(4);
        AllPrint.all(5);
        UserBang.start();

        int[] bullet = Bullet.bullet();
        int count = 0;
        for (int i:bullet){
            AllPrint.all(6);
            UserBang.bang();
            count++;
            if (i == 1) {
                AllPrint.all(10);
                break;
            } else {
                AllPrint.all(9);
            }
        }

        AllPrint.all(11);
        System.out.print(count);
    }
}

