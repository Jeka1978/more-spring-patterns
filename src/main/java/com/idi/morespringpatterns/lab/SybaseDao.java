package com.idi.morespringpatterns.lab;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@Db(DBType.SYBASE)
public class SybaseDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saved to sybase");
    }
}
