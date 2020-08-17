package com.study.design_pattern.state;

public class BattleState implements HumanState {
    @Override
    public int chargeHp(int hp) {
        return hp;
    }
}
