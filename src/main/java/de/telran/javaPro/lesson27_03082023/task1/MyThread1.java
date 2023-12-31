package de.telran.javaPro.lesson27_03082023.task1;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 100; i < 110; i++) {
            System.out.println("Поток 1: " + i);
            test2();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Поток 1 прерван.");
            }
        }
    }

    public void test() {
        System.out.println("Тестовый метод");
    }

    private void test2() {
        System.out.println("Тестовый метод 2");
    }
}
