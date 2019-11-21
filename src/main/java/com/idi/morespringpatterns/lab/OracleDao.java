package com.idi.morespringpatterns.lab;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
public class OracleDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saved to oracle");
    }
}
