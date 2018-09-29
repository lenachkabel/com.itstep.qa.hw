package com.qa.home.work;

import java.util.Random;

public class ZadanieFour {
    public static int random (int a, int b){
        Random random = new Random();
        return random.nextInt((b-a)+1)+a;
    }
}
