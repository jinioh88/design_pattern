package com.study.design_pattern.strategy;

public class Character {
    private int attack;
    private CharacterDefense characterDefense;

    public void setCharacterDefense(CharacterDefense characterDefense) {
        this.characterDefense = characterDefense;
    }

    public int defense() {
        return characterDefense.defense();
    }
}
