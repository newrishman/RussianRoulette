package Roulette;

import java.io.*;

class Again {
    protected static void classic() throws IOException {
        AllPrint.all(4);

        while (0 < 1) {
            AllPrint.all(5);
            UserBang.start();
            int[] bullet = Bullet.bullet();
            int i = 0;
            AllPrint.all(6);
            UserBang.bang();
            if (bullet[i] == 1) {
                AllPrint.all(10);
                break;
            } else {
                AllPrint.all(9);
                i++;
            }

            AllPrint.all(5);
            UserBang.start();
            bullet = Bullet.bullet();
            i = 0;
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
        int count = 0;

        while (0 < 1) {
            AllPrint.all(5);
            UserBang.start();
            int[] bullet = Bullet.bullet();
            int i = 0;
            AllPrint.all(8);
            UserBang.bang();
            count++;
            if (bullet[i] == 1) {
                AllPrint.all(10);
                break;
            } else {
                AllPrint.all(9);
                i++;
            }
        }
        System.out.println("Количество попыток для самоубийства - " + count);
    }
}


