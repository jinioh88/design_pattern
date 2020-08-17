package com.study.design_pattern.strategy;

public class Trol implements CharacterDefense {
    private int attack;
    private int defense;

    public int defense() {
        this.defense = 40;
        return defense;
    }
}
