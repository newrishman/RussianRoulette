

import Roulette.Again;
import Roulette.Classic;
import Roulette.SuperSeriouslyClass;

import java.io.*;

public class Start {
    public static void main(String[] args) throws IOException {
        Again again = new Again();
        Classic classic = new Classic();
        SuperSeriouslyClass superSeriouslyClass = new SuperSeriouslyClass(classic, again);
        int a = superSeriouslyClass.getA();
        int b = superSeriouslyClass.getB();

        superSeriouslyClass.start(a, b);
    }
}
