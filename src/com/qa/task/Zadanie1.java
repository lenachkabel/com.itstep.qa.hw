package com.qa.task;

import com.qa.home.work.ZadanieOne;

public class Zadanie1 {
    public static void main(String[] args) {
        ZadanieOne zadanie = new ZadanieOne();
        System.out.println(zadanie.toUSD(2, 2.4));
        System.out.println(zadanie.toUSD(3, 1.2));
    }

}
