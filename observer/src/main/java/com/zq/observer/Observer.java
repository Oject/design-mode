package com.zq.observer;

import lombok.Data;

@Data
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
