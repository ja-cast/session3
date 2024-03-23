package com.company;

import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            // write your code here
            System.out.println("Hellow world");
            List<MultiThreadingDemo> threads = new ArrayList<>();

            int n = 2; // Number of threads
            for (int i = 0; i < n; i++) {
                MultiThreadingDemo object = new MultiThreadingDemo(i+1);
                threads.add(object);
                object.start();
            }

            Thread.sleep(5000);

            for (MultiThreadingDemo t: threads) {
                t.interrupt();
            }
        }catch (Exception e){

        }
    }
}
