package com.idi.morespringpatterns.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
public class WorkService {


    @Autowired
    private Map<String,Dao> daos;



    public void doWork(){
       daos.values().stream().filter(Dao::isActive).forEach(Dao::save);

    }

    public void setDbStatus(String dbName, boolean flag) {
        Dao dao = daos.get(dbName);
        if (dao == null) {
            throw new UnsupportedOperationException(dbName + " not supported yet");
        }
        dao.setActive(flag);
    }
}








