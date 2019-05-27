package Roulette;

class Bullet {
    protected int[] bullet() {
        int[] arr = new int[6];
        int random = (int) (Math.random() * 6);
        arr[random] = 1;
        return arr;
    }
}
