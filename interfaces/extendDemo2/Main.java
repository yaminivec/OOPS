package interfaces.extendDemo2;

import interfaces.extendDemo.B;

public class Main implements A, B {
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}