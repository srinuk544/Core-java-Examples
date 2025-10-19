package com.MultiThreading;
public class SynchronizedDemo {

    // Inner class Display
    static class Display {
        public synchronized void wish(String name) {
            for (int i = 0; i < 5; i++) {
                System.out.print("good morning: ");
                try {
                    Thread.sleep(1000); // pause 1 sec
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        }
    }

    // Inner class MyThread
    static class MyThread extends Thread {
        Display d;
        String name;

        MyThread(Display d, String name) {
            this.d = d;
            this.name = name;
        }

        @Override
        public void run() {
            d.wish(name);
        }
    }

    // Main method
    public static void main(String[] args) {
        Display d1 = new Display();

        MyThread t1 = new MyThread(d1, "dhoni");
        MyThread t2 = new MyThread(d1, "yuvaraj");

        t1.start();
        t2.start();
    }
}
