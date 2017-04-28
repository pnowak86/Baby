package com.company;

public class Baby {
    int servings;
    String name;
    Mother mother;

    public Baby(String name, Mother mother) {
        this.name = name;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void feed(int servings) {
        mother.serviceBaby(this);

    }

    void feed2(int servings) {
        this.servings =
                this.servings + servings;
    }

    void poop() {
        System.out.println("All better!");
        servings = 0;
    }

}
