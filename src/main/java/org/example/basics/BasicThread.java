package org.example.basics;

public class BasicThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            BasicThread thread = new BasicThread();
            thread.start();
        }
    }

}
