package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class MultiThreadingDemo extends Thread {
    int sleepSeconds;

    public MultiThreadingDemo(int sleepSeconds) {
        this.sleepSeconds = sleepSeconds;
    }

    public void run() {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");

            while(!Thread.currentThread().isInterrupted()){
                Date date = new Date();

                Thread.currentThread().sleep(sleepSeconds*1000);
                System.out.println(dateFormat.format(date)+" - Doing some work from thread "+Thread.currentThread().getId());
            }
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught "+e.getMessage());
        }
    }
}