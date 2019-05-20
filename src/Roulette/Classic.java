package Roulette;

import java.io.*;

public class Classic {
    protected static void classic() throws IOException {
        AllPrint.all(4);
        AllPrint.all(5);

        UserBang.start();
        int[] bullet = Bullet.bullet();
        int i = 0;

        while (0 < 1) {
            AllPrint.all(6);
            UserBang.bang();
            if (bullet[i] == 1) {
                AllPrint.all(10);
                break;
            } else {
                AllPrint.all(9);
                i++;
            }
            AllPrint.all(7);
            UserBang.bang();
            if (bullet[i] == 1) {
                AllPrint.all(10);
                break;
            } else {
                AllPrint.all(9);
                i++;
            }

        }

    }

    protected static void singlePlayer() throws IOException {
        AllPrint.all(4);
        AllPrint.all(5);
        UserBang.start();

        int[] bullet = Bullet.bullet();
        int count = 0;

        for (int i : bullet) {
            AllPrint.all(8);
            UserBang.bang();
            count++;
            if (i == 1) {
                AllPrint.all(10);
                break;
            } else {
                AllPrint.all(9);
            }
        }

        System.out.print(count - 1);
        AllPrint.all(11);
    }
}


