package com.idi.morespringpatterns.lab;

/**
 * @author Evgeny Borisov
 */
public abstract class AbstractDao implements Dao {

    private boolean active;

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void setActive(boolean flag) {
        this.active = flag;
    }
}
