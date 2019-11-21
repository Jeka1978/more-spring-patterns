package com.idi.morespringpatterns.lab;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository("sybase")
public class SybaseDao extends AbstractDao {
    @Override
    public void save() {
        System.out.println("Saved to sybase");
    }
}
