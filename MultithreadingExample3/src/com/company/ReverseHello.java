package com.company;

public class ReverseHello extends Thread {

    @Override
    public void run() {
        System.out.println(currentThread().getName() + " is starting");
       for (int i=1;i<=5;i++){
           new ReverseHello().start();
           System.out.println(currentThread().getName()+" is starting");

        }
    }

    public static void main(String[] args) {
	ReverseHello rh = new ReverseHello();
	rh.start();
    }
}
