package com.study.design_pattern.state;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Human {
    private String name;
    private int hp;
    private int mp;
    private String type;
    private HumanState state;

    public void setState(HumanState state) {
        this.state = state;
    }
}
