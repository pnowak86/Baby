package com.company;

/**
 * Created by RENT on 2017-04-28.
 */
public class Main {
    public static void main(String[] args) {

        Mother mother = new Mother();
        Baby baby1 = new Baby("John", mother);
        baby1.feed(6);
        baby1.poop();
    }




}
