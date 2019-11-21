package com.idi.morespringpatterns.lab;

/**
 * @author Evgeny Borisov
 */
public interface Dao {
    void save();

    boolean isActive();

    void setActive(boolean flag);

}
