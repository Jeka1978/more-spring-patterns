package com.idi.morespringpatterns.lab;

/**
 * @author Evgeny Borisov
 */
public class SybaseDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saved to sybase");
    }
}
