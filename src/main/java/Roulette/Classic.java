package Roulette;

import java.io.*;

class Classic {
    protected void classic() throws IOException {

        AllPrint allPrint = new AllPrint();
        UserBang userBang = new UserBang();
        Bullet bullete = new Bullet();

        allPrint.all(4);
        allPrint.all(5);

        userBang.start();
        int[] bullet = bullete.bullet();
        int i = 0;

        while (0 < 1) {
            allPrint.all(6);
            userBang.bang();
            if (bullet[i] == 1) {
                allPrint.all(10);
                break;
            } else {
                allPrint.all(9);
                i++;
            }
            allPrint.all(7);
            userBang.bang();
            if (bullet[i] == 1) {
                allPrint.all(10);
                break;
            } else {
                allPrint.all(9);
                i++;
            }

        }

    }

    protected void singlePlayer() throws IOException {

        AllPrint allPrint = new AllPrint();
        UserBang userBang = new UserBang();
        Bullet bullete = new Bullet();

        allPrint.all(4);
        allPrint.all(5);
        userBang.start();

        int[] bullet = bullete.bullet();
        int count = 0;

        for (int i : bullet) {
            allPrint.all(8);
            userBang.bang();
            count++;
            if (i == 1) {
                allPrint.all(10);
                break;
            } else {
                allPrint.all(9);
            }
        }

        System.out.println("Количество попыток для самоубийства - " + count);
    }
}


