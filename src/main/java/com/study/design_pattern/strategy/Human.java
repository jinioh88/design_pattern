package com.study.design_pattern.strategy;

public class Human implements CharacterDefense {
    private int attack;
    private int defense;

    public int defense() {
        this.defense = 50;
        return defense;
    }
}
