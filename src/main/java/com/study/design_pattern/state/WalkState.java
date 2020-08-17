package com.study.design_pattern.state;

public class WalkState implements HumanState {
    @Override
    public int chargeHp(int hp) {
        return hp + 2;
    }
}
