package Roulette;

import java.io.*;

public class Requlations1 {
    protected static void forOne() throws IOException {
        int[] bullet;
        int count = 0;

        AllPrint.all(4);
        AllPrint.all(5);
        UserBang.start();

        bullet = Bullet.bullet();

        for (int i = 0; i < 6; i++) {
            AllPrint.all(6);
            UserBang.bang();
            count++;
            if (bullet[i] == 1) {
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

