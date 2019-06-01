

import Roulette.SuperSeriouslyClass;

import java.io.*;

public class Start {
    public static void main(String[] args) throws IOException {

        SuperSeriouslyClass superSeriouslyClass = new SuperSeriouslyClass();

        int a = superSeriouslyClass.getA();
        int b = superSeriouslyClass.getB();

        superSeriouslyClass.start(a, b);
    }
}
