package com.study.design_pattern.state;

public class SitStatus implements HumanState {
    @Override
    public int chargeHp(int hp) {
        return hp + 10;
    }
}
