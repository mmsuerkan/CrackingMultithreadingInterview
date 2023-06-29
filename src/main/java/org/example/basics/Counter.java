package org.example.basics;

public class Main {
    private int count;
    public synchronized void increment() {
        count++;
        System.out.println("Count after increment: " + count);
    }
    public static void main(String[] args) {

        Main main = new Main();
        main.doWork();

    }
}