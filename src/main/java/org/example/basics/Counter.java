package org.example.basics;

public class Counter {
    private int count;
    public synchronized void increment() {
        count++;
        System.out.println("Count after increment: " + count);
    }
    public static void main(String[] args) {

        Counter main = new Counter();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread is running: " + Thread.currentThread().getId());
                main.increment();

            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread is running: " + Thread.currentThread().getId());
                main.increment();

            }
        }).start();


    }
}