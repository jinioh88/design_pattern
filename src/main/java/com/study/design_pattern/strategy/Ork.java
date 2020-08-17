package com.study.design_pattern.strategy;

public class Ork implements CharacterDefense {
    private int attack;
    private int defense;

    public int defense() {
        this.defense = 100;
        return defense;
    }
}
