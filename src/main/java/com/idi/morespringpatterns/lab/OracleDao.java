package com.idi.morespringpatterns.lab;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */

@Repository("oracle")
public class OracleDao extends AbstractDao {
    @Override
    public void save() {
        System.out.println("Saved to oracle");
    }



}
