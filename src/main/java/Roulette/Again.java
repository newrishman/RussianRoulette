package Roulette;

import java.io.*;

class Again {
    protected void classic() throws IOException {
        AllPrint allPrint = new AllPrint(System.out, new AllText());
        UserBang userBang = new UserBang();
        Bullet bullete = new Bullet();

        allPrint.all(4);

        while (0 < 1) {
            allPrint.all(5);
            userBang.start();
            int[] bullet = bullete.bullet();
            int i = 0;
            allPrint.all(6);
            userBang.bang();
            if (bullet[i] == 1) {
                allPrint.all(10);
                break;
            } else {
                allPrint.all(9);
                i++;
            }

            allPrint.all(5);
            userBang.start();
            bullet = bullete.bullet();
            i = 0;
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

        AllPrint allPrint = new AllPrint(System.out, new AllText());
        UserBang userBang = new UserBang();
        Bullet bullete = new Bullet();

        allPrint.all(4);
        int count = 0;

        while (0 < 1) {
            allPrint.all(5);
            userBang.start();
            int[] bullet = bullete.bullet();
            int i = 0;
            allPrint.all(8);
            userBang.bang();
            count++;
            if (bullet[i] == 1) {
                allPrint.all(10);
                break;
            } else {
                allPrint.all(9);
                i++;
            }
        }
        System.out.println("Количество попыток для самоубийства - " + count);
    }
}


